package controller;

import entity.job;
import entity.users;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NewClass {

    public static void main(String[] args)
    {
        ArrayList<Integer> idList = new ArrayList(); 
<<<<<<< HEAD
        List<String> offlist = new ArrayList();
        
=======
>>>>>>> 01c912cd5a95c5ae85d28c97e8f6f6dc84dae9b2
        SessionFactory factory = new Configuration()
                                        .configure("hibernate.cfg.xml")
                                        .addAnnotatedClass(job.class)
                                        .addAnnotatedClass(users.class)
                                        .buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        try
        {
            session.beginTransaction();
            List<job> officersList = session.createQuery("from job off where off.name='investigator'", job.class).getResultList();
        
        for(job tempjob : officersList)
        {
<<<<<<< HEAD
            idList.add(tempjob.getUsers_idusers());
        }
        
        for(Integer inti : idList)
        {
            System.out.println(inti);
        }
        
        for(Integer num : idList)
        {
            List<users> userList = session.createQuery("from users off where off.idusers='"+num+"'", users.class).getResultList();
            
            for(users tempuser : userList)
            {
                offlist.add(tempuser.getFirst_name());
            }
        }
        for(String stri : offlist)
        {
            System.out.println(stri);
=======
            idList.add(tempjob.getIdjob());
>>>>>>> 01c912cd5a95c5ae85d28c97e8f6f6dc84dae9b2
        }
        }
        finally
        {
            factory.close();
        }
    }
}
