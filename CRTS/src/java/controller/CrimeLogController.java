package controller;

import entity.crime_log;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.ModelAttribute;
=======
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import service.CrimeLogService;
import service.OfficerService;

@Controller
@RequestMapping("/crimelog")
<<<<<<< HEAD
@SessionAttributes({"name","id"})
=======
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
public class CrimeLogController {
       
    @Autowired
    private CrimeLogService crimeLogService;
    
    @Autowired
    private OfficerService officerService;
    
    @RequestMapping("page")
    public String page(Model model)
    {
        List<String> offlist = officerService.getOfficers();
        model.addAttribute("offlist", offlist);
        
        return "crime_log_form";
    }
    
    @PostMapping("/savecrimelog")
    public String SaveCrimeLog(HttpServletRequest request,Model model)
    {
        try
        {
<<<<<<< HEAD
=======
=======
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import service.CrimeLogService;

@Controller
public class CrimeLogController {
    
    @Autowired
    private CrimeLogService crimeLogService;
    
    
    @PostMapping("/savecrimelog")
    public String SaveCrimeLog(HttpServletRequest request)
    {
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
        IdConverter idConverter = new IdConverter();
        int id =Integer.parseInt(request.getParameter("crimeid"));
        String crimetype = request.getParameter("crimetype");
        String occureddate = request.getParameter("crimeoccuredDate");
        String registereddate = request.getParameter("crimeregistereddate");
        String defendantname = request.getParameter("defendantname");
        String plaintiffname = request.getParameter("plaintiffname");
        String assignedofficer = request.getParameter("assignedofficer");
        String crimedescription = request.getParameter("crimedescription");
        
        int officerid = idConverter.Convert(assignedofficer);
        
        crime_log crimelog = new crime_log(id, crimetype, occureddate, registereddate, defendantname, plaintiffname, officerid, crimedescription);
        
        crimeLogService.saveCrimeLog(crimelog);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
        }
        catch(Exception e)
                {
                    model.addAttribute("crime_log_err", "Incorrect Entry"); 
                    return "redirect:/crimelogform";
                }
<<<<<<< HEAD
        return "index";
    }
    
    @RequestMapping("/listcrimelog")
    public String ListCrimeLog(@ModelAttribute("id") int userid,Model model)
    {
        List<crime_log> thecrimelog = crimeLogService.ListCrimeLog(userid);
        model.addAttribute("crime_log", thecrimelog);
        return "crime_log_list";
    }
=======
=======
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
        return "index";
    }
    
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
}
