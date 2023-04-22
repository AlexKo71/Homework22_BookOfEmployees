package pro.sky.homework22_bookofemployees1;

public class Employee {
    private final String firstName;
    private final String surName;
    private final String lastName;
    private int department;
    private int salary;

    public Employee(String firstName, String surName, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
