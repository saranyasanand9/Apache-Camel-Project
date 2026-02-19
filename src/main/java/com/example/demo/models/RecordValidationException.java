package com.example.demo.models;

public class RecordValidationException extends RuntimeException {

    private final String fieldName;
    private final Integer recordId;
    private final int rowNumber;

    public RecordValidationException(String message,
                                     String fieldName,
                                     Integer recordId,
                                     int rowNumber) {
        super(message);
        this.fieldName = fieldName;
        this.recordId = recordId;
        this.rowNumber = rowNumber;
    }

    public String getFieldName() { return fieldName; }
    public Integer getRecordId() { return recordId; }
    public int getRowNumber() { return rowNumber; }
}
