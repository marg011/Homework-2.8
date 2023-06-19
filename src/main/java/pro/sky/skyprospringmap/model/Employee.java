package pro.sky.skyprospringmap.model;

public class Employee {
    private static int id;
    private final int EmployeeId;
    private String lastName;
    private String firstName;
    private String patronymicName;
    private int salary;
    private String department;
    public Employee(String lastName, String firstName,String patronymicName, int salary,String department) {
        this.EmployeeId = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.salary = salary;
        this.department = department;
        id++;
    }
        @Override
        public String toString(){
            return "ID: "+ this.EmployeeId + ", last name: " + this.lastName + ", first name: "
                    + this.firstName + ", patronymic: " + this.patronymicName
                    + ", salary: " + this.salary + ", department: " + this.department;


    }



}
