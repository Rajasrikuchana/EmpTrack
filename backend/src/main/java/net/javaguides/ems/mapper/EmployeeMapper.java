package net.javaguides.ems.mapper;

import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;

//used to map EmployeeDto to Employee and Employee to EmploueeDto
public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee)
    {
        return new EmployeeDto(
              employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto)
    {
        return new Employee(
              employeeDto.getId(),
              employeeDto.getFirstName(),
              employeeDto.getLastName(),
              employeeDto.getEmail()
        );
    }
}
