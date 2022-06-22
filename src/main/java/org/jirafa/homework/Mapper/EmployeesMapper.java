package org.jirafa.homework.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.jirafa.homework.entity.Employees;

import java.util.List;

/**
 * @author jirafa
 * @date 2022/6/20
 */
@Mapper
public interface EmployeesMapper extends BaseMapper<Employees> {
    /**
     * 添加员工
     *
     * @param employees 员工实体类
     * @return int 添加的数量
     */
    int addEmployee(Employees employees);

    /**
     * 查询所有员工信息
     * @return List 员工列表
     */
    List<Employees> getAllEmployees();
}
