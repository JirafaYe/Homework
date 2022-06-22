package org.jirafa.homework.Controller;

import org.springframework.web.bind.annotation.*;
import org.jirafa.homework.DTO.EmployeesDTO;
import org.jirafa.homework.Service.Employees.EmployeesService;
import org.jirafa.homework.Utils.Result;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/emp")
public class EmployeesController {

    @Resource
    private EmployeesService employeesService;

    @GetMapping("/all")
    public Result getAllEmp(){
        return employeesService.getEmployees();
    }

    @PostMapping("/add")
    public Result addEmployee(@RequestBody EmployeesDTO employeesDTO){
        return employeesService.addEmployee(employeesDTO);
    }
}
