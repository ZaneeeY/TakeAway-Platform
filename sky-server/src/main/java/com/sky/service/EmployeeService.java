package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @param employeeDTO
     */
    void addEmployee(EmployeeDTO employeeDTO);

    /**
     * 分页查询
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 设置账号状态
     * @param status
     * @param id
     */
    void setAccountStatus(Integer status, Long id);

    /**
     * 根据id查找员工
     * @param id
     * @return
     */
    Employee getById(String id);

    /**
     * 更新员工信息
     * @param employeeDTO
     */
    void updateRecord(EmployeeDTO employeeDTO);
}
