package net.javaguides.ems.repository;

import net.javaguides.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
//SimpleJpaRepository class implements JpaRepository interface;
    //already simplejparepository annotated with repository so we dont need to use in ur code
    //annotated @transactions where all operations are performed like delete ,add in simplejparepository


}
