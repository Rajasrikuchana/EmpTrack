package net.javaguides.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //to instance variables
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")  //creating tables
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement the id value
    private Long id;

    @Column(name="first_name")  //column name mapping
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email_id",nullable = false,unique = true)
    private String email;
}
