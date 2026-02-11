package com.example.demo.models;

public class Response {

    EmployeeHeader employeeHeader;
    Employee employeeBody;

    public Response(EmployeeHeader employeeHeader, Employee employee) {
        this.employeeHeader = employeeHeader;
        this.employeeBody = employee;
    }

    public EmployeeHeader getEmployeeHeader() {
        return employeeHeader;
    }

    public void setEmployeeHeader(EmployeeHeader employeeHeader) {
        this.employeeHeader = employeeHeader;
    }

    public Employee getEmployee() {
        return employeeBody;
    }

    public void setEmployee(Employee employee) {
        this.employeeBody = employee;
    }
}
