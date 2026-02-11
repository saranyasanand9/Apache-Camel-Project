package com.example.demo.models;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

import java.util.Date;

@FixedLengthRecord(length = 44)
public class HeaderRecord {
    @DataField(required = true, trim = true, pos = 10, length = 6)
    String fromNode;

    @DataField(required = true, trim = true, pos = 1, length = 3)
    String recordId;

    @DataField(required = true, trim = true, pos = 17, length = 7)
    String seqNumber;

    @DataField(required = true, trim = true, pos = 24, length = 14,  pattern = "yyyyMMddHHmmss")
    Date publishDateTime;



    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getFromNode() {
        return fromNode;
    }

    public void setFromNode(String fromNode) {
        this.fromNode = fromNode;
    }

    public String getSeqNumber() {
        return seqNumber;
    }

    public void setSeqNumber(String seqNumber) {
        this.seqNumber = seqNumber;
    }

    public Date getPublishDateTime() {
        return publishDateTime;
    }

    public void setPublishDateTime(Date publishDateTime) {
        this.publishDateTime = publishDateTime;
    }
}
