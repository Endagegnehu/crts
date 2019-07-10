package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("officer")
@SessionAttributes("name")
public class OfficerController {
    
    @RequestMapping("page")
    public String page()
    {
        return "officer";
    }
    
    @RequestMapping("/officerprofile")
    public String OfficerProfilePage(Model model)
    {
        return "redirect:/profile/page";
    }
    @RequestMapping("/crimelogform")
    public String CrimelogformPage(Model model)
    {
        return "redirect:/crimelog/page";
    }
    @RequestMapping("/criminalprofileform")
    public String OcriminalprofileformPage(Model model)
    {
        return "redirect:/criminalprofile/page";
    }
    @RequestMapping("/listcrfile")
    public String listcrfilePage(Model model)
    {
        return "redirect:/crfile/page";
    }
    
    @RequestMapping("/logout")
    public String logoutpage()
    {
        return "redirect:/logout";
    }
}
