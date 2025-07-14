package net.javaguides.ems.service;

import net.javaguides.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    //create employee
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    //get employee
    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployess();

    EmployeeDto updateEmployee(Long employeeId,EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);
}
