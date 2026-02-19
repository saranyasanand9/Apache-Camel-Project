package com.example.demo.component;

import com.example.demo.models.BodyRecord;
import com.example.demo.models.RecordValidationException;
import org.apache.camel.Exchange;
import org.apache.camel.ValidationException;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import java.lang.reflect.Field;

public class RecordValidator {

   /* public void validate(BodyRecord body, Exchange exchange) throws ValidationException {
        // 1. Get Row Number (0-based index + 1)
        Integer index = exchange.getProperty(Exchange.SPLIT_INDEX, Integer.class);
        int rowNum = (index != null) ? index + 1 : 0;

        // 2. Get Item ID
        String itemId = (body.getItemNumber() != null) ? body.getItemNumber() : "Unknown";

        // 3. Check fields via reflection
        for (Field field : body.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(DataField.class)) {
                field.setAccessible(true);
                try {
                    Object value = field.get(body);
                    if (value == null) {
                        DataField ann = field.getAnnotation(DataField.class);
                        // Construct the exact message requested
                        String errorMsg = String.format(
                                "The mandatory field %s (field %d at position %d) is missing for Id %s (row number %d)",
                                field.getName(), ann.pos(), ann.pos(), itemId, rowNum
                        );
                        throw new ValidationException(exchange, errorMsg);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
   public void validate(BodyRecord body, Exchange exchange) {

       Integer index = exchange.getProperty(Exchange.SPLIT_INDEX, Integer.class);
       int rowNum = (index != null) ? index + 1 : 0;

       Integer recordId = body.getRecordId() != null
               ? body.getRecordId()
               : 000;

       validateMandatory(body.getRecordId(), "recordId", recordId, rowNum);
       validateMandatory(body.getItemNumber(), "itemNumber", recordId, rowNum);

       /*for (Field field : body.getClass().getDeclaredFields()) {

           if (field.isAnnotationPresent(DataField.class)) {

               field.setAccessible(true);

               try {
                   Object value = field.get(body);

                   if (value == null ||
                           (value instanceof String && ((String) value).trim().isEmpty())) {


                       String message = String.format(
                               "Mandatory field '%s' is missing for Item Number '%s' at row %d",
                               field.getName(),
                               recordId.trim(),
                               rowNum
                       );

                       throw new RecordValidationException(
                               message,
                               field.getName(),
                               recordId,
                               rowNum
                       );
                   }

               } catch (IllegalAccessException e) {
                   throw new RuntimeException(e);
               }
           }
       }*/
   }
    private void validateMandatory(Object value,
                                   String fieldName,
                                   Integer recordId,
                                   int rowNum) {

        if (value == null ||
                (value instanceof String && ((String) value).trim().isEmpty())) {

            String message = String.format(
                    "Mandatory field '%s' is missing for Record ID '%s' at row %d",
                    fieldName,
                    recordId,
                    rowNum
            );

            throw new RecordValidationException(
                    message,
                    fieldName,
                    recordId,
                    rowNum
            );
        }
    }


}
