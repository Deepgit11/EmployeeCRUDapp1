package com.example.EmployeeCRUDapp.Model;

import javax.persistence.*;

@Entity
public class Employees1 {
     @Id
     @GeneratedValue
     long id;
     @Column(name = "Employee name")
      String Employee_name;
     @Column(name = "Email")
      String Email;
     @Column(name = "Ph_no")
      String Phone_number;
     @Column(name = "Salary")
      String Salary;

    public Employees1() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployee_name() {
        return Employee_name;
    }

    public void setEmployee_name(String employee_name) {
        Employee_name = employee_name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }
}
