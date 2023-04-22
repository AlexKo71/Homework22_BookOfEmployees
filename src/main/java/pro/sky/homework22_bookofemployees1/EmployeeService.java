package pro.sky.homework22_bookofemployees1;


import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    List<Employee> employeeList = new ArrayList<>(Arrays.asList(
            new Employee("Иван", "Петрович", "Сидоров", 1, 100_000),
            new Employee("Пётр", "Семёнович", "Чижов", 1, 90_000),
            new Employee("Вера", "Петровна", "Разина", 2, 60_000),
            new Employee("Екатерина", "Владимировна", "Кузьмина", 3, 65_000),
            new Employee("Александр", "Николаевич", "Валько", 1, 80_000),
            new Employee("Татьяна", "Павлона", "Конкина", 2, 85_000),
            new Employee("Иван", "Степанович", "Сизов", 3, 65_000),
            new Employee("Евгений", "Сергеевич", "Петров", 1, 50_000),
            new Employee("Светлана", "Михайловна", "Правдина", 2, 92_000),
            new Employee("Михаил", "Петрович", "Зотов", 3, 75_000)));

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
