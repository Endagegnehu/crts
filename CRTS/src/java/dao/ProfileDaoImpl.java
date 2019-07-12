package dao;

import entity.address;
import entity.job;
import entity.users;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public class ProfileDaoImpl implements ProfileDao
{
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
<<<<<<< HEAD
    public List<users> getUser(int userid) 
    {
     Session session = sessionFactory.getCurrentSession();
     
     List<users> theUser = session.createQuery("from users user where user.idusers='"+userid+"'").getResultList();
=======
    public List<users> getUser(String username) 
    {
     Session session = sessionFactory.getCurrentSession();
     
     List<users> theUser = session.createQuery("from users user where user.user_name='"+username+"'").getResultList();
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
     return theUser;
    }

    @Override
<<<<<<< HEAD
    public List<address> getAddress(int userid)
    {
        Session session = sessionFactory.getCurrentSession();
        
        List<address> theAdress = session.createQuery("from address address where address.user_id='"+userid+"'").getResultList();
=======
    public List<address> getAddress(String username)
    {
        int id = 0;
        Session session = sessionFactory.getCurrentSession();
        
        List<users> theUser = session.createQuery("from users user where user.user_name='"+username+"'").getResultList();
        for(users user :theUser)
        {
            id = user.getIdusers();
        }
        
        List<address> theAdress = session.createQuery("from address address where address.user_id='"+id+"'").getResultList();
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
        return theAdress;
    }

    @Override
<<<<<<< HEAD
    public List<job> getJob(int userid) 
    {
        Session session = sessionFactory.getCurrentSession();
        
        List<job> thejob = session.createQuery("from job job where job.users_idusers='"+userid+"'").getResultList();
=======
    public List<job> getJob(String username) 
    {
        int id = 0;
        Session session = sessionFactory.getCurrentSession();
        
        List<users> theUser = session.createQuery("from users user where user.user_name='"+username+"'").getResultList();
        for(users user :theUser)
        {
            id = user.getIdusers();
        }
        
        List<job> thejob = session.createQuery("from job job where job.users_idusers='"+id+"'").getResultList();
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
        return thejob;
    }

    @Override
    public String UpdateProfile(String user_name,String first_name,String last_name,String email,String password,String region,String woreda,String keble,String home_number,String phon,String name,int idusers,int idaddress,int idjob,Model model) 
    {
        try
        {
        Session session = sessionFactory.getCurrentSession();
        users theuser = session.get(users.class, idusers);
        
        theuser.setUser_name(user_name);
        theuser.setPassword(password);
        theuser.setEmail(email);
        theuser.setFirst_name(first_name);
        theuser.setLast_name(last_name);
        
        address theaddress = session.get(address.class, idaddress);
        
        theaddress.setHome_number(home_number);
        theaddress.setPhon(phon);
        theaddress.setRegion(region);
        theaddress.setWoreda(woreda);
        theaddress.setKebele(keble);
        
        job thejob = session.get(job.class, idjob);
        
        thejob.setName(name);
        model.addAttribute("profilemsg", "Profile Updated Successfully");
        return "redirect:/profile/page";
        }
        catch(Exception e)
        {
            model.addAttribute("profilemsg", "Profile Updated Successfully");
            return "redirect:/profile/page";
        }
    }
    
}
