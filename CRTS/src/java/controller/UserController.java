package controller;

import entity.crime_log;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CrimeLogService;
import service.OfficerService;

@Controller
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private CrimeLogService crimeLogService;
    
    @PostMapping("/saveCrimeLog")
    public String SaveCrimeLog(HttpServletRequest request,Model model)
    {
        int id =Integer.parseInt(request.getParameter("crimeid"));
        String crimetype = request.getParameter("crimetype");
        String occureddate = request.getParameter("crimeoccuredDate");
        String registereddate = request.getParameter("crimeregistereddate");
        String defendantname = request.getParameter("defendantname");
        String plaintiffname = request.getParameter("plaintiffname");
        int officerid = Integer.parseInt(request.getParameter("assignedofficer"));
        String crimedescription = request.getParameter("crimedescription");
        
        crime_log crimelog = new crime_log(id, crimetype, occureddate, registereddate, defendantname, plaintiffname, officerid, crimedescription);
        
        crimeLogService.saveCrimeLog(crimelog);
        return "index";
    }
    
}
