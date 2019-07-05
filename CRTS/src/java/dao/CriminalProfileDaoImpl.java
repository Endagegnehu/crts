package dao;

import entity.address;
import entity.criminal_profile;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CriminalProfileDaoImpl implements CriminalProfileDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public String SaveSuspect(criminal_profile criminalprofile, address address) 
    {
        Session session = sessionFactory.getCurrentSession();
        
        session.save(criminalprofile);
        session.save(address);
        return "index";
    }
    
}
