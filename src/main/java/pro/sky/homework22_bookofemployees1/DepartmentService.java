package pro.sky.homework22_bookofemployees1;


import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

    public List<Employee> employees;

    public Employee maxSalary(List<Employee> employees, int number) {
        return employees.stream()
                .filter(d -> d.getDepartment() == number)
                .max(Comparator.comparingInt(Employee::getSalary)).orElse(null);
    }

    public Employee minSalary(List<Employee> employees, int number) {
        return employees.stream()
                .filter(d -> (d.getDepartment() == number))
                .min(Comparator.comparing(Employee::getSalary)).orElse(null);
    }

    public List<Employee> departmentList(List<Employee> employees, int number) {
        return employees.stream()
                .filter(p -> (p.getDepartment() == number))
                .collect(Collectors.toList());
    }

    public Map<Integer, List<Employee>> listOfAllEmployees(List<Employee> employees) {
        return new HashMap<>(employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment)));
    }
}
