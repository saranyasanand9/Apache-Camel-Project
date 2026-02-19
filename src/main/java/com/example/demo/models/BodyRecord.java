package com.example.demo.models;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

@FixedLengthRecord(ignoreTrailingChars = true)
public class BodyRecord {

    @DataField( trim = true, pos = 1, length = 3)
    public Integer recordId;

    @DataField( trim = true, pos = 4, length = 20)
    public String itemNumber;

    @DataField( trim = true, pos = 24, length = 12)
    public String lot;

    @DataField( trim = true, pos = 36, length = 9, defaultValue = "0")
    public Double quantityOnHandNotOnHold;

    @DataField( trim = true, pos = 45, length = 9, defaultValue = "0")
    public Double quantityOnHandOnHold;

    @DataField( trim = true, pos = 54, length = 9, defaultValue = "0")
    public Double quantityInReceiving;

    @DataField( trim = true, pos = 63, length = 9, defaultValue = "0")
    public Double quantityInShipping;

    @DataField( trim = true, pos = 72, length = 9, defaultValue = "0")
    public Double quantityAllocatedNotOnHold;

    @DataField( trim = true, pos = 81, length = 9, defaultValue = "0")
    public Double quantityAllocatedOnHold;

    @DataField( trim = true, pos = 90, length = 9, defaultValue = "0")
    public Double quantityOrderedNotAllocated;

    @DataField( trim = true, pos = 99, length = 9, defaultValue = "0")
    public Double suspendedQuantity;

    @DataField( trim = true, pos = 108, length = 18)
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

    @Override
    public String toString() {
        return "BodyRecord{" +
                "recordId=" + recordId +
                ", itemNumber='" + itemNumber + '\'' +
                ", lot='" + lot + '\'' +
                ", quantityOnHandNotOnHold=" + quantityOnHandNotOnHold +
                ", quantityOnHandOnHold=" + quantityOnHandOnHold +
                ", quantityInReceiving=" + quantityInReceiving +
                ", quantityInShipping=" + quantityInShipping +
                ", quantityAllocatedNotOnHold=" + quantityAllocatedNotOnHold +
                ", quantityAllocatedOnHold=" + quantityAllocatedOnHold +
                ", quantityOrderedNotAllocated=" + quantityOrderedNotAllocated +
                ", suspendedQuantity=" + suspendedQuantity +
                ", ownerId='" + ownerId + '\'' +
                '}';
    }
}