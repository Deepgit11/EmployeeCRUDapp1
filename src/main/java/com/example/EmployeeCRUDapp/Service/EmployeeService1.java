package com.example.EmployeeCRUDapp.Service;

import com.example.EmployeeCRUDapp.Model.Employees1;
import com.example.EmployeeCRUDapp.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService1 implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employees1> getAll() {
      return employeeRepository.findAll();
    }
}
