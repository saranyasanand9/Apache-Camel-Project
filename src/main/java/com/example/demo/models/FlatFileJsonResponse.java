package com.example.demo.models;

import java.util.List;


public class FlatFileJsonResponse {

    private HeaderRecord header;
    private List<BodyRecord> bodies;

    public HeaderRecord getHeader() {
        return header;
    }

    public void setHeader(HeaderRecord header) {
        this.header = header;
    }

    public List<BodyRecord> getBodies() {
        return bodies;
    }

    public void setBodies(List<BodyRecord> bodies) {
        this.bodies = bodies;
    }
}
