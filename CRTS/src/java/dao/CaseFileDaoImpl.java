package dao;

import entity.case_file;
import entity.crime_log;
import entity.job;
import entity.users;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CaseFileDaoImpl implements CaseFileDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public String createCasefile(String typeof_crime,String dateof_crime,String crime_tip_date,
                                 String investigation_end_date,String suspect_name,
                                 String prosecutor_approved,String registrar_approved,String short_sumary,
                                 int prosecutorid,int lawyerid,int log_file_id,int investigator_id) 
    {
        Session session = sessionFactory.getCurrentSession();
        
        case_file caseFile = new case_file(typeof_crime, dateof_crime, crime_tip_date, log_file_id, investigation_end_date, investigator_id, prosecutorid, suspect_name, short_sumary, lawyerid, prosecutor_approved, registrar_approved);
        
        session.save(caseFile);
        
    return "redirect:/crimelog/listcrimelog";
    }

    @Override
    public List<crime_log> getCrimelog(int crimelogid) 
    {
        Session session = sessionFactory.getCurrentSession();
        
        List<crime_log> theLog = session.createQuery("from crime_log log where log.idcrime_log='"+crimelogid+"'").list();
        return theLog;
    }

    @Override
    public List<String> getLawyer() 
    {
        List<String> lawlist = new ArrayList();
        ArrayList<Integer> idList = new ArrayList(); 
        
        Session currentsession = sessionFactory.getCurrentSession();
        
        List<job> lawyersList = currentsession.createQuery("from job off where off.name='lawyer'", job.class).getResultList();
        
        for(job tempjob : lawyersList)
        {
            idList.add(tempjob.getUsers_idusers());
        }
        
        for(Integer num : idList)
        {
            List<users> userList = currentsession.createQuery("from users off where off.idusers='"+num+"'", users.class).getResultList();
            
            for(users tempuser : userList)
            {
                lawlist.add(tempuser.getUser_name());
            }
        }
        return lawlist;
    }

    @Override
    public List<String> getProsecutor() 
    {
        List<String> proslist = new ArrayList();
        ArrayList<Integer> idList = new ArrayList(); 
        
        Session currentsession = sessionFactory.getCurrentSession();
        
        List<job> prosecutorsList = currentsession.createQuery("from job off where off.name='prosecutor'", job.class).getResultList();
        
        for(job tempjob : prosecutorsList)
        {
            idList.add(tempjob.getUsers_idusers());
        }
        
        for(Integer num : idList)
        {
            List<users> userList = currentsession.createQuery("from users off where off.idusers='"+num+"'", users.class).getResultList();
            
            for(users tempuser : userList)
            {
                proslist.add(tempuser.getUser_name());
            }
        }
        return proslist;
    }

    @Override
    public List<case_file> listCaseFile(int id) 
    {
        Session session = sessionFactory.getCurrentSession();
        
        List<case_file> theCasefile = session.createQuery("from case_file casefile where casefile.investigator_id='"+id+"'").list();
        
        return theCasefile;
    }
    
}
