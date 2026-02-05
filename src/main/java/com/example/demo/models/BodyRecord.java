package com.example.demo.models;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

@FixedLengthRecord
public class BodyRecord {
    @DataField(pos = 1, length = 3)
    public Integer recordId;
    @DataField(pos = 4, length = 20, trim = true)
    public String itemNumber;
    @DataField(pos = 24, length = 12, trim = true)
    public String lot;
    @DataField(pos = 36, length = 9, defaultValue = "0")
    public double quantityOnHandNotOnHold;
    @DataField(pos = 45, length = 9, defaultValue = "0")
    public double quantityOnHandOnHold;
    @DataField(pos = 54, length = 9, defaultValue = "0")
    public double quantityInReceiving;
    @DataField(pos = 63, length = 9, defaultValue = "0")
    public double quantityInShipping;
    @DataField(pos = 72, length = 9, defaultValue = "0")
    public double quantityAllocatedNotOnHold;
    @DataField(pos = 81, length = 9, defaultValue = "0")
    public double quantityAllocatedOnHold;
    @DataField(pos = 90, length = 9, defaultValue = "0")
    public double quantityOrderedNotAllocated;
    @DataField(pos = 99, length = 9, defaultValue = "0")
    public double suspendedQuantity;
    @DataField(pos = 108, length = 18, trim = true)
    public String ownerId;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public double getQuantityOnHandNotOnHold() {
        return quantityOnHandNotOnHold;
    }

    public void setQuantityOnHandNotOnHold(double quantityOnHandNotOnHold) {
        this.quantityOnHandNotOnHold = quantityOnHandNotOnHold;
    }

    public double getQuantityOnHandOnHold() {
        return quantityOnHandOnHold;
    }

    public void setQuantityOnHandOnHold(double quantityOnHandOnHold) {
        this.quantityOnHandOnHold = quantityOnHandOnHold;
    }

    public double getQuantityInReceiving() {
        return quantityInReceiving;
    }

    public void setQuantityInReceiving(double quantityInReceiving) {
        this.quantityInReceiving = quantityInReceiving;
    }

    public double getQuantityInShipping() {
        return quantityInShipping;
    }

    public void setQuantityInShipping(double quantityInShipping) {
        this.quantityInShipping = quantityInShipping;
    }

    public double getQuantityAllocatedNotOnHold() {
        return quantityAllocatedNotOnHold;
    }

    public void setQuantityAllocatedNotOnHold(double quantityAllocatedNotOnHold) {
        this.quantityAllocatedNotOnHold = quantityAllocatedNotOnHold;
    }

    public double getQuantityAllocatedOnHold() {
        return quantityAllocatedOnHold;
    }

    public void setQuantityAllocatedOnHold(double quantityAllocatedOnHold) {
        this.quantityAllocatedOnHold = quantityAllocatedOnHold;
    }

    public double getQuantityOrderedNotAllocated() {
        return quantityOrderedNotAllocated;
    }

    public void setQuantityOrderedNotAllocated(double quantityOrderedNotAllocated) {
        this.quantityOrderedNotAllocated = quantityOrderedNotAllocated;
    }

    public double getSuspendedQuantity() {
        return suspendedQuantity;
    }

    public void setSuspendedQuantity(double suspendedQuantity) {
        this.suspendedQuantity = suspendedQuantity;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
}
