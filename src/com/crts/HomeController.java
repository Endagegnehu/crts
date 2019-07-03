package com.crts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showPage(){
        return "index";
    }
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    } 
    
    @RequestMapping("/add_data_to_form")
    public String lestShwo(@RequestParam("studentName") String theName, Model model){
//        String theName = httpServletRequest.getParameter("studentName");
        
        theName =  theName.toUpperCase();
        
        String result = "YO!" + theName;
        
        model.addAttribute("massage", result);
        return "helloworld";
    }
    
//    @RequestMapping("/add_data_to_form")
//    public String lestShwo(HttpServletRequest httpServletRequest, Model model){
//        String theName = httpServletRequest.getParameter("studentName");
//        
//        theName =  theName.toUpperCase();
//        
//        String result = "YO!" + theName;
//        
//        model.addAttribute("massage", result);
//        return "helloworld";
//    }
}
