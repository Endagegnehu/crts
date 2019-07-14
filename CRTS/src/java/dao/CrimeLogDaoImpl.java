package dao;

import entity.crime_log;
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
<<<<<<< HEAD
import org.springframework.ui.Model;
=======
<<<<<<< HEAD
import org.springframework.ui.Model;
=======
<<<<<<< HEAD
import org.springframework.ui.Model;
=======
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40

@Repository
public class CrimeLogDaoImpl implements CrimeLogDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void saveCrimeLog(crime_log crimeLog) 
    {
        Session currentSession = sessionFactory.getCurrentSession();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
        currentSession.save(crimeLog);        
    }

    @Override
    public List<crime_log> ListCrimeLog(int userid) 
    {
        Session session = sessionFactory.getCurrentSession();
        
        List<crime_log> thecrimlog = session.createQuery("from crime_log log where log.assigned_officer_id='"+userid+"'").list();
        
        return thecrimlog;
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
        currentSession.save(crimeLog);        
=======
        
        currentSession.save(crimeLog);
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
    }
    
}
