package dao;

import entity.crime_log;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

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

    @Override
    public List<crime_log> ListCrimeLog(int userid) 
    {
        Session session = sessionFactory.getCurrentSession();
        
        List<crime_log> thecrimlog = session.createQuery("from crime_log log where log.assigned_officer_id='"+userid+"'").list();
        
        return thecrimlog;
    }
    
}
