package controller;

import entity.crime_log;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.OfficerService;

@Controller
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
@RequestMapping("/pages")
>>>>>>> 01c912cd5a95c5ae85d28c97e8f6f6dc84dae9b2
>>>>>>> a9a1455a2964ec603a22488d8f6747aa1af7f609
>>>>>>> 897b593556fe478dbf8b7a9579c320831f3e65b9
>>>>>>> 314e1dd3b104f1446ecb2ceff62d3efe541b2476
public class PageController {
    
    @Autowired
    private OfficerService officerService;
    
    @GetMapping("/crimelogform")
    public String CrimeLogForm(Model model)
    {
        //crime_log crimeLog = new crime_log();
        
        //model.addAttribute("crimelog", crimeLog);
        
        List<String> offlist = officerService.getOfficers();
        model.addAttribute("offlist", offlist);
        
        return "crime_log_form";
    }
<<<<<<< HEAD
    @GetMapping("/criminalprofileform")
    public String CriminalProfileForm()
    {
        return "criminal_profile";
    }
=======
>>>>>>> 314e1dd3b104f1446ecb2ceff62d3efe541b2476
}
