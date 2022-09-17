package com.spring.redis.service;

import com.spring.redis.model.EmployeeData;
import com.spring.redis.model.EmployeeResponse;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Optional<EmployeeResponse> saveEmployeeData(EmployeeData employeeData);

    Optional<EmployeeResponse> getEmployeeById(Integer employeeId);

    List<EmployeeResponse> getAllEmployees();
}
