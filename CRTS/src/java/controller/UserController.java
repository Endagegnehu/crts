package controller;

import entity.crime_log;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 897b593556fe478dbf8b7a9579c320831f3e65b9
import entity.job;
import entity.users;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
<<<<<<< HEAD
=======
=======
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> a9a1455a2964ec603a22488d8f6747aa1af7f609
>>>>>>> 897b593556fe478dbf8b7a9579c320831f3e65b9
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CrimeLogService;
import service.OfficerService;

@Controller
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
@RequestMapping("/users")
>>>>>>> 01c912cd5a95c5ae85d28c97e8f6f6dc84dae9b2
>>>>>>> a9a1455a2964ec603a22488d8f6747aa1af7f609
>>>>>>> 897b593556fe478dbf8b7a9579c320831f3e65b9
public class UserController {
    
    @Autowired
    private CrimeLogService crimeLogService;
    
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 897b593556fe478dbf8b7a9579c320831f3e65b9
    
    @PostMapping("/savecrimelog")
    public String SaveCrimeLog(HttpServletRequest request)
    {
        IdConverter idConverter = new IdConverter();
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
    @PostMapping("/savecrimelog")
    public String SaveCrimeLog(HttpServletRequest request)
=======
    @PostMapping("/saveCrimeLog")
    public String SaveCrimeLog(HttpServletRequest request,Model model)
>>>>>>> 01c912cd5a95c5ae85d28c97e8f6f6dc84dae9b2
    {
>>>>>>> a9a1455a2964ec603a22488d8f6747aa1af7f609
>>>>>>> 897b593556fe478dbf8b7a9579c320831f3e65b9
        int id =Integer.parseInt(request.getParameter("crimeid"));
        String crimetype = request.getParameter("crimetype");
        String occureddate = request.getParameter("crimeoccuredDate");
        String registereddate = request.getParameter("crimeregistereddate");
        String defendantname = request.getParameter("defendantname");
        String plaintiffname = request.getParameter("plaintiffname");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 897b593556fe478dbf8b7a9579c320831f3e65b9
        String assignedofficer = request.getParameter("assignedofficer");
        String crimedescription = request.getParameter("crimedescription");
        
        int officerid = idConverter.Convert(assignedofficer);
        
<<<<<<< HEAD
=======
=======
        int officerid = Integer.parseInt(request.getParameter("assignedofficer"));
        String crimedescription = request.getParameter("crimedescription");
        
<<<<<<< HEAD
        
        
=======
>>>>>>> 01c912cd5a95c5ae85d28c97e8f6f6dc84dae9b2
>>>>>>> a9a1455a2964ec603a22488d8f6747aa1af7f609
>>>>>>> 897b593556fe478dbf8b7a9579c320831f3e65b9
        crime_log crimelog = new crime_log(id, crimetype, occureddate, registereddate, defendantname, plaintiffname, officerid, crimedescription);
        
        crimeLogService.saveCrimeLog(crimelog);
        return "index";
    }
    
}
