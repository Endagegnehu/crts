package controller;

import entity.address;
import entity.job;
import entity.users;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import service.ProfileService;

@Controller
@SessionAttributes({"name","id"})
@RequestMapping("profile")
public class ProfileController 
{
    @Autowired
    private ProfileService profileService;
    
    @RequestMapping("/page")
    public String page(@ModelAttribute("id") int userid, Model model)
    {
        List<users> theuser = profileService.getUser(userid);
        List<address> theAddress = profileService.getAddress(userid);
        List<job> theJob = profileService.getJob(userid);
        model.addAttribute("user",theuser);
        model.addAttribute("address", theAddress);
        model.addAttribute("job", theJob);
        return "profile";
    }
    
    @RequestMapping("/updateprofile")
    public String updateProfile(@ModelAttribute("id") int idusers,HttpServletRequest request , Model model)
    {
        String user_name,first_name,last_name,email,password,region,woreda,keble,home_number,phon,name;
        int idaddress,idjob;
        
        user_name = request.getParameter("user_name");
        first_name = request.getParameter("first_name");
        last_name = request.getParameter("last_name");
        email = request.getParameter("email");
        password = request.getParameter("password");
        region= request.getParameter("region");
        woreda = request.getParameter("woreda");
        keble = request.getParameter("keble");
        home_number = request.getParameter("home_number");
        phon = request.getParameter("phon");
        name = request.getParameter("job");
        
        IdConverter idconverter = new IdConverter();
        idaddress = idconverter.getaddressid(idusers);
        idjob = idconverter.getjobid(idusers);
        
        return profileService.UpdateProfile(user_name,first_name,last_name,email,password,region,woreda,keble,home_number,phon,name,idusers,idaddress,idjob,model);
    }
}
