package org.yzh.homework.Service.Employees.Impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.yzh.homework.DTO.EmployeesDTO;
import org.yzh.homework.Mapper.EmployeesMapper;
import org.yzh.homework.Service.Employees.EmployeesService;
import org.yzh.homework.Utils.R;
import org.yzh.homework.Utils.Result;
import org.yzh.homework.entity.Employees;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yzh
 * @date 2022/6/20
 */
@Service
@Slf4j
public class EmployeesServiceImpl implements EmployeesService {

    @Resource
    private EmployeesMapper employeesMapper;

    @Override
    public Result<List<Employees>> getEmployees(){
        log.info("获取所有员工信息");
        List<Employees> allEmployees = employeesMapper.getAllEmployees();
        if(allEmployees.isEmpty()){
            throw new RuntimeException("获取异常，人数为0");
        }else {
            return R.success(allEmployees);
        }
    }

    @Override
    public Result<String> addEmployee(EmployeesDTO employeesDTO){
        log.info("添加员工信息");
        Employees employees = new Employees();
        employees.setEmpAddress(employeesDTO.getEmpAddress());
        employees.setEmpIdentity(employeesDTO.getEmpIdentity());
        employees.setEmpName(employeesDTO.getEmpName());
        employees.setEmpPhoneNumber(employeesDTO.getEmpPhoneNumber());

        List<Employees> allEmployees = employeesMapper.getAllEmployees();
        if (!allEmployees.isEmpty()) {
            for (Employees employee : allEmployees) {
                if (employees.equals(employee)) {
                    throw new RuntimeException("该员工已存在");
                }
            }
        }

        int i = employeesMapper.addEmployee(employees);
        if(i==1){
            return R.success();
        }else {
            throw new RuntimeException("添加员工异常");
        }
    }
}
