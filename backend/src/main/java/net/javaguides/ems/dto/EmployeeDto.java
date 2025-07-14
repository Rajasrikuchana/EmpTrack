package net.javaguides.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//used this file to trasfer data between client and server
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
