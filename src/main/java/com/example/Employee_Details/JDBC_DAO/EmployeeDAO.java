package com.example.Employee_Details.JDBC_DAO;

import com.example.Employee_Details.model.Employee;

import java.util.ArrayList;

public interface EmployeeDAO {
    ArrayList<Employee> getAllEmployee();

    Employee getEmployeeById();
}
