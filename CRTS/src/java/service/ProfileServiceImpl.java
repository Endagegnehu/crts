package service;

import dao.ProfileDao;
import entity.address;
import entity.job;
import entity.users;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

@Service
public class ProfileServiceImpl implements ProfileService
{
    @Autowired
    private ProfileDao profileDao;

    @Override
    @Transactional
    public List<users> getUser(int userid) 
    {
        return profileDao.getUser(userid);
    }

    @Override
    @Transactional
    public List<address> getAddress(int userid)
    {
        return profileDao.getAddress(userid);
    }

    @Override
    @Transactional
    public List<job> getJob(int userid) 
    {
        return profileDao.getJob(userid);
    }

    @Override
    @Transactional
    public String UpdateProfile(String user_name,String first_name,String last_name,String email,String password,String region,String woreda,String keble,String home_number,String phon,String name,int idusers,int idaddress,int idjob,Model model) 
    {
        return profileDao.UpdateProfile(user_name,first_name,last_name,email,password,region,woreda,keble,home_number,phon,name,idusers,idaddress,idjob,model);
    }
    
    
    
}
