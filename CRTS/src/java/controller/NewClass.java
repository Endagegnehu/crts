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
            idList.add(tempjob.getIdjob());
        }
        }
        finally
        {
            factory.close();
        }
    }
}
