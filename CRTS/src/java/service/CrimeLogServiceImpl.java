package service;

import dao.CrimeLogDao;
import entity.crime_log;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
<<<<<<< HEAD
=======
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
<<<<<<< HEAD
import org.springframework.ui.Model;
=======
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40

@Service
public class CrimeLogServiceImpl implements CrimeLogService{

    @Autowired
    private CrimeLogDao crimeLogDao;
    
    @Override
    @Transactional
    public void saveCrimeLog(crime_log crimeLog) 
    {
        crimeLogDao.saveCrimeLog(crimeLog);
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40

    @Override
    @Transactional
    public List<crime_log> ListCrimeLog(int userid) 
    {
        List<crime_log> thecrimelog = crimeLogDao.ListCrimeLog(userid);
        return thecrimelog;
    }
<<<<<<< HEAD
=======
=======
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
>>>>>>> d63610874bdaef4b5a8d0257e89ca50c76957f40
    
}
