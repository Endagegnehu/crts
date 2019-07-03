package dao;

import entity.job;
import entity.users;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OfficerDaoImpl implements OfficerDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public List<String> getOfficers() 
    {
        List<String> offlist = new ArrayList();
        ArrayList<Integer> idList = new ArrayList(); 
        
        Session currentsession = sessionFactory.getCurrentSession();
        
        List<job> officersList = currentsession.createQuery("from job off where off.name='investigator'", job.class).getResultList();
        
        for(job tempjob : officersList)
        {
<<<<<<< HEAD
            idList.add(tempjob.getUsers_idusers());
=======
<<<<<<< HEAD
            idList.add(tempjob.getUsers_idusers());
=======
            idList.add(tempjob.getIdjob());
>>>>>>> 01c912cd5a95c5ae85d28c97e8f6f6dc84dae9b2
>>>>>>> a9a1455a2964ec603a22488d8f6747aa1af7f609
        }
        
        for(Integer num : idList)
        {
            List<users> userList = currentsession.createQuery("from users off where off.idusers='"+num+"'", users.class).getResultList();
            
            for(users tempuser : userList)
            {
<<<<<<< HEAD
                offlist.add(tempuser.getUser_name());
=======
                offlist.add(tempuser.getFirst_name());
>>>>>>> a9a1455a2964ec603a22488d8f6747aa1af7f609
            }
        }
        return offlist;
    }
    
}
