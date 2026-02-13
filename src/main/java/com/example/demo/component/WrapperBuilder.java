package com.example.demo.component;

import com.example.demo.models.BodyRecord;
import com.example.demo.models.FlatFileJsonResponse;
import com.example.demo.models.HeaderRecord;
import org.apache.camel.Exchange;

public class WrapperBuilder {

    private static  HeaderRecord cachedHeader;


    public static FlatFileJsonResponse build(Exchange exchange) {
         HeaderRecord header = exchange.getProperty("fileHeader", HeaderRecord.class);

        if (header != null) {
            cachedHeader = header;
        } else {
            header = cachedHeader;
        }
        BodyRecord body =
                exchange.getProperty("currentBody", BodyRecord.class);

        FlatFileJsonResponse wrapper = new FlatFileJsonResponse();
        wrapper.setHeader(header);
        wrapper.setBody(body);

        return wrapper;
    }
}
