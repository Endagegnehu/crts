package controller;

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
        
        return offid;
        }
        finally
        {
            factory.close();
        }
    }
}
