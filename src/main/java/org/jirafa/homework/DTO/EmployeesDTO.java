package org.jirafa.homework.DTO;

import lombok.Data;

/**
 * @author jirafa
 * @date 2022/06/20
 */
@Data
public class EmployeesDTO {

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
}
