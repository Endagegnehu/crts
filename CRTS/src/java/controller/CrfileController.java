package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("crfile")
public class CrfileController 
{
    @RequestMapping("page")
    public String page()
    {
        
        return "crfile";
    }
}
