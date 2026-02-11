package com.example.demo.models;


import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

@FixedLengthRecord
public class Employee {

    @DataField(pos = 1, length = 7)
    String name;

    @DataField(pos = 8, length = 6)
    String empId;

    @DataField(pos = 14, length = 2)
    String department;

    @DataField(pos = 16, length = 3)
    String designation;

    public Employee(String name, String empId, String department, String designation) {
        this.name = name;
        this.empId = empId;
        this.department = department;
        this.designation = designation;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
