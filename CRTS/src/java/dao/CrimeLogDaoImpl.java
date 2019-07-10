package dao;

import entity.crime_log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
<<<<<<< HEAD
import org.springframework.ui.Model;
=======
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f

@Repository
public class CrimeLogDaoImpl implements CrimeLogDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void saveCrimeLog(crime_log crimeLog) 
    {
        Session currentSession = sessionFactory.getCurrentSession();
<<<<<<< HEAD
        currentSession.save(crimeLog);        
=======
        
        currentSession.save(crimeLog);
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
    }
    
}
