package com.example.demo.component;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Component("flatFileProcessor")
public class FlatFileProcessor implements Processor {

    @Override
    public void process(Exchange exchange) {

        String line = exchange.getIn().getBody(String.class);
        String[] fields = line.split(",");

        // Parse Date
        DateTimeFormatter inputFormat =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter outputFormat =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        LocalDateTime dateTime =
                LocalDateTime.parse(fields[2], inputFormat);

        // Header
        Map<String, Object> header = new HashMap<>();
        header.put("source", "FLAT_FILE");
        header.put("processedTime", LocalDateTime.now().toString());

        // Body
        Map<String, Object> body = new HashMap<>();
        body.put("id", fields[0]);
        body.put("name", fields[1]);
        body.put("transactionDate", dateTime.format(outputFormat));
        body.put("amount", fields[3]);

        // Final JSON structure
        Map<String, Object> finalJson = new HashMap<>();
        finalJson.put("header", header);
        finalJson.put("body", body);

        exchange.getIn().setBody(finalJson);
    }
}
