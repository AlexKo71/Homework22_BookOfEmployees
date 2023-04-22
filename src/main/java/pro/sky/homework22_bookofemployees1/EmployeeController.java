package pro.sky.homework22_bookofemployees1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/max-salary")
    public Employee maxSalary(@RequestParam(value = "departmentId") int numberDepartment) {
        return service.maxSalary(service.employeeList, numberDepartment);
    }

    @GetMapping("/min-salary")
    public Employee minSalary(@RequestParam(value = "departmentId") int numberDepartment) {
        return service.minSalary(service.employeeList, numberDepartment);
    }

    @GetMapping(value = "/all", params = {"departmentId"})
    public List<Employee> allDepartment(@RequestParam (value = "departmentId") int numberDepartment) {
        return service.departmentList(service.employeeList, numberDepartment);
    }

    @GetMapping("/all")
    public Map<Integer, List<Employee>> all() {
        return service.listOfAllEmployees(service.employeeList);
    }
}
