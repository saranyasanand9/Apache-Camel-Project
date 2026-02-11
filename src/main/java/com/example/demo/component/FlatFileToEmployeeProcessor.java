package com.example.demo.component;

import com.example.demo.models.Employee;
import com.example.demo.models.EmployeeHeader;
import com.example.demo.models.Response;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("flatFileToEmployeeProcessor")
public class FlatFileToEmployeeProcessor implements Processor {

    @Override
    public void process(Exchange exchange) {

        String fileContent = exchange.getIn().getBody(String.class);
        String[] lines = fileContent.split("\\r?\\n");

        String headerLine = lines[0];

        String deptName = headerLine.substring(0, 2);
        String deptId = headerLine.substring(2, 5);
        EmployeeHeader employeeHeader = new EmployeeHeader(deptName, deptId);

        List<Response> employees = new ArrayList<>();

        for (int i = 1; i < lines.length; i++) {

            String line = lines[i];

            String name = line.substring(0, 7).trim();
            String empId = line.substring(7, 13).trim();
            String dept = line.substring(13, 15).trim();
            String location = line.substring(15, 18).trim();

            Employee employee = new Employee(name, empId, dept, location);

            employees.add(new Response(employeeHeader, employee));
        }

        exchange.getIn().setBody(employees);
    }
}
