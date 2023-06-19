package pro.sky.skyprospringmap.services;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringmap.model.Employee;

import java.util.HashMap;
import java.util.Map;
@Service
public class EmployeeBookServiceImpl implements EmployeeBookService {
    Map<String, Employee> employees = new HashMap<>();
    
    public Map<String, Employee> getEmployees() {
        return employees;
    }

    public String addEmployee(String lastName, String firstName, String patronymicName, int salary, String department){
        Employee employee = new Employee(lastName, firstName, patronymicName, salary, department);
        String fullName = lastName + " " + firstName + " " + patronymicName;
        if (employees.containsKey(fullName)){
            throw new RuntimeException("This employee is already in database");
        }
        employees.put(fullName, employee);
        return employee.toString();
    }

    public String removeEmployee(String lastName, String firstName, String patronymicName){
        String fullName = lastName + " " + firstName + " " + patronymicName;
        if (!employees.containsKey(fullName)){
            throw new RuntimeException("This employee is not in database");
        }
        employees.remove(fullName);
        return fullName;
    }

    public String findEmployee(String lastName, String firstName, String patronymicName){
        String fullName = lastName + " " + firstName + " " + patronymicName;
        if (!employees.containsKey(fullName)){
            throw new RuntimeException("This employee is not in database");
        }
        return employees.get(fullName).toString();
    }

    public String printEmployees(){
        String empls = "";
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            empls+= entry.getKey() + " " + entry.getValue() + "\n";
        }
        return empls;
    }
}
