package dao;

import entity.address;
import entity.job;
import entity.users;
import java.util.List;
import org.springframework.ui.Model;


public interface ProfileDao {
<<<<<<< HEAD
    public List<users> getUser(int userid);
    public List<address> getAddress(int userid);
    public List<job> getJob(int userid);
=======
    public List<users> getUser(String username);
    public List<address> getAddress(String username);
    public List<job> getJob(String username);
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
    public String UpdateProfile(String user_name,String first_name,String last_name,String email,String password,String region,String woreda,String keble,String home_number,String phon,String name,int idusers,int idaddress,int idjob,Model model);
    
}
