package com.example.EmployeeCRUDapp.Repository;

import com.example.EmployeeCRUDapp.Model.Employees1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees1,Long > {
}
