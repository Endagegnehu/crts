package controller;

import dao.LogInDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
=======

@Controller
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
public class LogInController {
    
    @Autowired
    private LogInDao logInDao;
    
    @PostMapping("/login")
<<<<<<< HEAD
    public String LogIn(@RequestParam("username") String username,@RequestParam("password") String password,Model model)
=======
    public String LogIn(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password,Model model)
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
    {
        return logInDao.NextPage(username, password,model);
    }
}
