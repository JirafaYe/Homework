package org.yzh.homework.Service.Employees;

import org.yzh.homework.DTO.EmployeesDTO;
import org.yzh.homework.Utils.Result;
import org.yzh.homework.entity.Employees;

import java.util.List;

/**
 * @author yzh
 * @date 2022/6/20
 */
public interface EmployeesService {
    /**
     * 获取所有员工信息
     * @return List<Employees>
     */
    Result<List<Employees>> getEmployees();

    /**
     * 添加员工信息
     */
    Result<String> addEmployee(EmployeesDTO employeesDTO);
}
