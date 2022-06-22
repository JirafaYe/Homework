package org.jirafa.homework.entity;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author jirafa
 * @date 2022/06/20
 */
@Data
@TableName("t_employees")
public class Employees implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工id
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 员工姓名
     */
    private String empName;

    /**
     * 员工电话
     */
    private String empPhoneNumber;

    /**
     * 员工地址
     */
    private String empAddress;

    /**
     * 员工权限
     */
    private Integer empIdentity;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return empName.equals(employees.empName) && empPhoneNumber.equals(employees.empPhoneNumber) && empAddress.equals(employees.empAddress) && empIdentity.equals(employees.empIdentity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, empPhoneNumber, empAddress, empIdentity);
    }
}
