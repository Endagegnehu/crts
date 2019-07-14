package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/investigator")
@SessionAttributes({"name","id"})
public class InvestigatorController 
{
    @RequestMapping("/page")
    public String Page()
    {
        return "investigator";
    }
    
    @RequestMapping("/investigatorprofile")
    public String Profile()
    {
        return "redirect:/profile/page";
    }
    
    @RequestMapping("/crimelogview")
    public String CrimeLogView()
    {
        return "redirect:/crimelog/listcrimelog";
    }
    
<<<<<<< HEAD
    @RequestMapping("/casefileview")
    public String CaseFile()
    {
        return "redirect:/casefile/casefileview";
=======
    @RequestMapping("/casefile")
    public String CaseFile()
    {
        return "redirect:/casefile/page";
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
    }
    
    @RequestMapping("/createcasefile")
    public String CreateCaseFile()
    {
        return "redirect:/casefile/createcasefile";
    }
}
