package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/casefile")
@SessionAttributes("name")
public class CaseFileController 
{
    @RequestMapping("/page")
    public String Page()
    {
        return "case_file";
    }
    
    @RequestMapping("/createcasefile")
    public String CreateCaseFile(String crimelogid,Model model)
    {
        model.addAttribute("crimelogid", crimelogid);
        return "create_case_file";
    }
}
