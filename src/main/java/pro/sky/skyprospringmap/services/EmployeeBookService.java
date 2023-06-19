package pro.sky.skyprospringmap.services;

import pro.sky.skyprospringmap.model.Employee;

import java.util.Map;

public interface EmployeeBookService {
    String addEmployee(String lastName, String firstName,String patronymicName, int salary,String department);
    Map<String, Employee> getEmployees();

    String printEmployees();

    String removeEmployee(String lastName, String firstName, String patronymicName);

    String findEmployee(String lastName, String firstName, String patronymicName);
}
