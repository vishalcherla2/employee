package com.example.employee;

import com.example.employee.Employee;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.employee.EmployeeService;

@RestController
public class EmployeeController {
     EmployeeService employeeService = new EmployeeService();

     @GetMapping("/employees")
     public ArrayList<Employee> getEmployees() {
          return employeeService.getEmployees();
     }

     @PostMapping("/employees")
     public Employee addEmployee(@RequestBody Employee employee) {
          return employeeService.addEmployee(employee);
     }

     @GetMapping("/employees/{employeeId}")
     public Employee getEmployeeById(@PathVariable("employeeId") int employeeId) {
          return employeeService.getEmployeeById(employeeId);
     }

     @PutMapping("/employees/{employeeId}")
     public Employee updateEmployee(@PathVariable("employeeId") int employeeId, @RequestBody Employee employee) {
          return employeeService.updateEmployee(employeeId, employee);
     }

     @DeleteMapping("/employees/{employeeId}")
     public void deleteEmployee(@PathVariable("employeeId") int employeeId) {
          employeeService.deleteEmployee(employeeId);
     }

}
