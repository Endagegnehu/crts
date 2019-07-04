package dao;

import entity.job;
import entity.users;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Repository
public class LogInDaoImpl implements LogInDao{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    @Transactional
    public String NextPage(String name, String password,Model model) 
    {
        int id = 0;
        String UserJob = null,page;
        Session session = sessionFactory.getCurrentSession();
        
        try
        {
            List<users> theuser = session.createQuery("from users user where user.user_name='"+name+"' AND user.password='"+password+"'").list();
            if(theuser != null)
            {
                for(users tempuser : theuser)
                {
                    id = tempuser.getIdusers();
                }
            }
            List<job> userjob = session.createQuery("from job user where user.users_idusers='"+id+"'").list();
            if(userjob != null)
            {
                model.addAttribute("name",name);
                for(job jobs : userjob)
                {
                    UserJob = jobs.getName();
                }
            }
            switch(UserJob)
            {
                case "police":
                        page = "police";
                        break;
                case "investigator":
                    page = "investigator";
                    break;
                case "prosecutor":
                    page = "prosecutor";
                    break;
                case "judge":
                    page = "judge";
                    break;
                case "lawyer":
                    page = "lawyer";
                    break;
                default:
                    page = "index";
                    break;
            }
            
        }
        catch(Exception e)
        {
            model.addAttribute("msg", "Incorrect Entry");
            return "index";
        }
        return page;
    }
    
}
