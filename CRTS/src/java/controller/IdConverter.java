package controller;

<<<<<<< HEAD
import entity.address;
=======
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
import entity.job;
import entity.users;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class IdConverter {

    public int Convert(String assignedoff)
    {
        
        SessionFactory factory = new Configuration()
                                        .configure("hibernate.cfg.xml")
                                        .addAnnotatedClass(job.class)
                                        .addAnnotatedClass(users.class)
                                        .buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        try
        {
        session.beginTransaction();
        int offid = 0;
        List<users> officersList = session.createQuery("from users off where off.user_name='"+assignedoff+"'", users.class).getResultList();
        
        for(users tempusers : officersList)
        {
            offid = tempusers.getIdusers();
        }
<<<<<<< HEAD
        session.getTransaction().commit();
        return offid;
        }
        finally
        {
            factory.close();
        }
    }
    public int getaddressid(int userid)
    {
        
        SessionFactory factory = new Configuration()
                                        .configure("hibernate.cfg.xml")
                                        .addAnnotatedClass(address.class)
                                        .buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        try
        {
        session.beginTransaction();
        int offid = 0;
        List<address> addressList = session.createQuery("from address add where add.user_id='"+userid+"'").getResultList();
        
        for(address tempusers : addressList)
        {
            offid = tempusers.getIdaddres();
        }
        session.getTransaction().commit();
        return offid;
        }
        finally
        {
            factory.close();
        }
    }
    public int getjobid(int userid)
    {
        SessionFactory factory = new Configuration()
                                        .configure("hibernate.cfg.xml")
                                        .addAnnotatedClass(job.class)
                                        .buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        try
        {
        session.beginTransaction();
        int offid = 0;
        List<job> jobList = session.createQuery("from job job where job.users_idusers='"+userid+"'").getResultList();
        
        for(job tempusers : jobList)
        {
            offid = tempusers.getIdjob();
        }
        session.getTransaction().commit();
=======
        
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
        return offid;
        }
        finally
        {
            factory.close();
        }
    }
<<<<<<< HEAD
    
=======
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
}
