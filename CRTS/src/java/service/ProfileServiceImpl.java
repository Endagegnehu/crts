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
<<<<<<< HEAD
    public List<users> getUser(int userid) 
    {
        return profileDao.getUser(userid);
=======
<<<<<<< HEAD
    public List<users> getUser(int userid) 
    {
        return profileDao.getUser(userid);
=======
    public List<users> getUser(String username) 
    {
        return profileDao.getUser(username);
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
    }

    @Override
    @Transactional
<<<<<<< HEAD
    public List<address> getAddress(int userid)
    {
        return profileDao.getAddress(userid);
=======
<<<<<<< HEAD
    public List<address> getAddress(int userid)
    {
        return profileDao.getAddress(userid);
=======
    public List<address> getAddress(String username)
    {
        return profileDao.getAddress(username);
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
    }

    @Override
    @Transactional
<<<<<<< HEAD
    public List<job> getJob(int userid) 
    {
        return profileDao.getJob(userid);
=======
<<<<<<< HEAD
    public List<job> getJob(int userid) 
    {
        return profileDao.getJob(userid);
=======
    public List<job> getJob(String username) 
    {
        return profileDao.getJob(username);
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
    }

    @Override
    @Transactional
    public String UpdateProfile(String user_name,String first_name,String last_name,String email,String password,String region,String woreda,String keble,String home_number,String phon,String name,int idusers,int idaddress,int idjob,Model model) 
    {
        return profileDao.UpdateProfile(user_name,first_name,last_name,email,password,region,woreda,keble,home_number,phon,name,idusers,idaddress,idjob,model);
    }
    
    
    
}
