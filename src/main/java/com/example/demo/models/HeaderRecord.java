package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

import java.time.LocalDateTime;
import java.util.Date;

@FixedLengthRecord(ignoreTrailingChars = true)
public class HeaderRecord {

    @DataField(required = true, trim = true, pos = 1, length = 3)
    String recordId;

    @DataField(required = true, trim = true, pos = 10, length = 6)
    String fromNode;

    @DataField(required = true, trim = true, pos = 16, length = 8)
    String seqNumber;

    @DataField(required = true, trim = true, pos = 24, length = 14,pattern = "yyyyMMddHHmmss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "EEE MMM dd HH:mm:ss z yyyy", timezone = "Asia/Kolkata")
    Date publishDateTime;

    public String getFromNode() {
        return fromNode;
    }

    public void setFromNode(String fromNode) {
        this.fromNode = fromNode;
    }

    public Date getPublishDateTime() {
        return publishDateTime;
    }

    public void setPublishDateTime(Date publishDateTime) {
        this.publishDateTime = publishDateTime;
    }

    public String getSeqNumber() {
        return seqNumber;
    }

    public void setSeqNumber(String seqNumber) {
        this.seqNumber = seqNumber;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Override
    public String toString() {
        return "HeaderRecord{" +
                "fromNode='" + fromNode + '\'' +
                ", recordId='" + recordId + '\'' +
                ", seqNumber='" + seqNumber + '\'' +
                ", publishDateTime='" + publishDateTime + '\'' +
                '}';
    }
}
