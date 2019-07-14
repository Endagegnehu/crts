package dao;

import entity.case_file;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegistrarDaoImpl implements RegistrarDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public List<case_file> listCaseFile(int id) 
    {
        Session session = sessionFactory.getCurrentSession();
        List<case_file> theCaseFile = session.createQuery("from case_file casefile where casefile.registrar_approved='not approved'").list();
        return theCaseFile;
    }

    @Override
    public void ApprovecaseFile(int id) 
    {
        Session session = sessionFactory.getCurrentSession();
        
        case_file casefile = session.get(case_file.class, id);
        
        casefile.setRegistrar_approved("approved");
    }
       
}
