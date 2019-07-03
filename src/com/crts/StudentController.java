/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ende
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/showForm")
    public String showForm(Model theModel){
        //Student object
      Student theStudent = new Student();
       // add student oject to the model
       theModel.addAttribute("student",theStudent);
        return "student-form";
    }
    
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
        return "student-conf";
    }
        
}
