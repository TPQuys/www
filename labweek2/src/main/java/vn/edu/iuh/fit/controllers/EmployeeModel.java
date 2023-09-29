package vn.edu.iuh.fit.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.enums.EnumEmployee;
import vn.edu.iuh.fit.models.Employee;
import vn.edu.iuh.fit.resources.EmployeeResources;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.ParseException;

public class EmployeeModel {
    public void insertEmp (HttpServletRequest req , HttpServletResponse resp) throws ParseException, IOException, InterruptedException {
        String name = req.getParameter("fullname");
        String dob_s = req.getParameter("dob");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String address = req.getParameter("address");

        Employee e = new Employee(name,dob_s,email,phone,address, EnumEmployee.ACTIVE);

        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(e.toString()))
                .uri(URI.create("http://localhost:8080/labweek2/api/employees")).build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response =  client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
