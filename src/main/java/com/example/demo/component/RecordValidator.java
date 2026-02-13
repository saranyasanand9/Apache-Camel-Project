package com.example.demo.component;

import com.example.demo.models.BodyRecord;
import com.example.demo.models.HeaderRecord;
import org.apache.camel.ValidationException;
import java.lang.reflect.Field;

public class RecordValidator {
    public static void validate(BodyRecord body) throws ValidationException {
        if (body == null) return;

        // Use reflection to find which field is null
        for (Field field : body.getClass().getDeclaredFields()) {
            try {
                if (field.get(body) == null) {
                    throw new ValidationException(null, "Mandatory field is missing: " + field.getName());
                }
            } catch (IllegalAccessException e) {
                // Handle reflection errors
            }
        }
    }
    public static void validateHeader(HeaderRecord header) throws ValidationException {
        if (header == null) return;

        // Use reflection to find which field is null
        for (Field field : header.getClass().getDeclaredFields()) {
            try {
                if (field.get(header) == null) {
                    throw new ValidationException(null, "Mandatory field is missing: " + field.getName());
                }
            } catch (IllegalAccessException e) {
                // Handle reflection errors
            }
        }
    }
}