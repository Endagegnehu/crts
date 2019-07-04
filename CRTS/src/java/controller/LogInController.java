package controller;

import dao.LogInDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LogInController {
    
    @Autowired
    private LogInDao logInDao;
    
    @PostMapping("/login")
    public String LogIn(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password,Model model)
    {
        return logInDao.NextPage(username, password,model);
    }
}
