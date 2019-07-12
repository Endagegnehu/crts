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
<<<<<<< HEAD
        
=======
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
        return "crfile";
    }
}
