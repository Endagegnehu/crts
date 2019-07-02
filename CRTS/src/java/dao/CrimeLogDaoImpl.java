package dao;

import entity.crime_log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CrimeLogDaoImpl implements CrimeLogDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void saveCrimeLog(crime_log crimeLog) 
    {
        Session currentSession = sessionFactory.getCurrentSession();
        
        currentSession.save(crimeLog);
    }
    
}
