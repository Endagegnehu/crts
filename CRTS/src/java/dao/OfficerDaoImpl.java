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
<<<<<<< HEAD
            idList.add(tempjob.getUsers_idusers());
=======
<<<<<<< HEAD
            idList.add(tempjob.getUsers_idusers());
=======
<<<<<<< HEAD
            idList.add(tempjob.getUsers_idusers());
=======
<<<<<<< HEAD
            idList.add(tempjob.getUsers_idusers());
=======
            idList.add(tempjob.getIdjob());
>>>>>>> 01c912cd5a95c5ae85d28c97e8f6f6dc84dae9b2
>>>>>>> a9a1455a2964ec603a22488d8f6747aa1af7f609
>>>>>>> 897b593556fe478dbf8b7a9579c320831f3e65b9
>>>>>>> 314e1dd3b104f1446ecb2ceff62d3efe541b2476
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
        }
        
        for(Integer num : idList)
        {
            List<users> userList = currentsession.createQuery("from users off where off.idusers='"+num+"'", users.class).getResultList();
            
            for(users tempuser : userList)
            {
<<<<<<< HEAD
                offlist.add(tempuser.getUser_name());
=======
<<<<<<< HEAD
                offlist.add(tempuser.getUser_name());
=======
<<<<<<< HEAD
                offlist.add(tempuser.getUser_name());
=======
<<<<<<< HEAD
                offlist.add(tempuser.getUser_name());
=======
<<<<<<< HEAD
                offlist.add(tempuser.getUser_name());
=======
                offlist.add(tempuser.getFirst_name());
>>>>>>> a9a1455a2964ec603a22488d8f6747aa1af7f609
>>>>>>> 897b593556fe478dbf8b7a9579c320831f3e65b9
>>>>>>> 314e1dd3b104f1446ecb2ceff62d3efe541b2476
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
            }
        }
        return offlist;
    }
    
}
