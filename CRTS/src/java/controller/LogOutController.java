package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class LogOutController 
{
    @RequestMapping("logout")
    public String logout(Model model)
    {
        model.addAttribute("name", "");
        return "index";
    }
}
