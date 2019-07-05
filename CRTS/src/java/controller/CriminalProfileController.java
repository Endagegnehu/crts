package controller;

import entity.address;
import entity.criminal_profile;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import service.CriminalProfileService;

@Controller
public class CriminalProfileController {
    
    @Autowired
    private CriminalProfileService criminalProfileService;
    
    @PostMapping("/criminalprofile")
    public String RegisterSuspect(HttpServletRequest request)
    {
        int suspectid = Integer.parseInt(request.getParameter("idsuspect"));
        String first_name = request.getParameter("first_name");
        String middle_name = request.getParameter("middle_name");
        String last_name = request.getParameter("last_name");
        String age = request.getParameter("age");
        String religion = request.getParameter("religion");
        String occupation = request.getParameter("occupation");
        String marital_status = request.getParameter("marital_status");
        String addiction = request.getParameter("addiction");
        String academic_level = request.getParameter("academic_level");
        
        String region = request.getParameter("region");
        String woreda = request.getParameter("woreda");
        String kebele = request.getParameter("kebele");
        String home_number = request.getParameter("home_number");
        String phone_number = request.getParameter("phone_number");
        
        criminal_profile criminalprofile = new criminal_profile(suspectid, first_name, middle_name, last_name, age, religion, occupation, marital_status, addiction, academic_level);
        address address = new address(home_number, phone_number, region, woreda, kebele, suspectid);
        
        return criminalProfileService.SaveSuspect(criminalprofile, address);
    }
}
