package com.example.EmployeeCRUDapp.Controller;

import com.example.EmployeeCRUDapp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController{
    @Autowired
   EmployeeService employeeService;
    @GetMapping("/")
    public String view (Model model ){
        model.addAttribute( "listemployee",employeeService.getAll());
        return "Index";
    }
}
