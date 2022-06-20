package org.yzh.homework.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.yzh.homework.DTO.EmployeesDTO;
import org.yzh.homework.Service.Employees.EmployeesService;
import org.yzh.homework.Utils.Result;

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
