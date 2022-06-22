package org.jirafa.homework.Service.Employees;

import org.jirafa.homework.DTO.EmployeesDTO;
import org.jirafa.homework.Utils.Result;
import org.jirafa.homework.entity.Employees;

import java.util.List;

/**
 * @author jirafa
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
