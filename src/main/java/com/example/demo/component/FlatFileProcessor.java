/*
package com.example.demo.component;

import com.example.demo.models.*;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component("flatFileProcessor")
public class FlatFileProcessor implements Processor {

    @Override
    public void process(Exchange exchange) {

        String fileContent = exchange.getIn().getBody(String.class);
        String[] lines = fileContent.split("\\r?\\n");

        String headerLine = lines[0];

        String recordId = headerLine.substring(0, 3).trim();
        String fromNode = headerLine.substring(4, 15).trim();
        String seqNumber = headerLine.substring(16, 23).trim();

            String publishDateTimeStr = headerLine.substring(17, 31).trim();

        HeaderRecord headerRecord = new HeaderRecord(recordId, fromNode,seqNumber, publishDateTimeStr);

        List<FlatFileJsonResponse> responseList = new ArrayList<>();

        for (int i = 1; i < lines.length; i++) {

            String line = lines[i];

            String bodyId = line.substring(0, 3).trim();
            String itemNumber = line.substring(7, 13).trim();


            BodyRecord bodyRecord = new BodyRecord(bodyId,itemNumber);

            responseList.add(new FlatFileJsonResponse(headerRecord, bodyRecord));
        }

        exchange.getIn().setBody(responseList);
    }
}
*/
