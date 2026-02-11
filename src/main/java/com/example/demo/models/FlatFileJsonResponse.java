package com.example.demo.models;

import java.util.List;


public class FlatFileJsonResponse {

    private HeaderRecord header;
    private BodyRecord body;

    public HeaderRecord getHeader() {
        return header;
    }

    public void setHeader(HeaderRecord header) {
        this.header = header;
    }

    public BodyRecord getBody() {
        return body;
    }

    public void setBody(BodyRecord body) {
        this.body = body;
    }
}
