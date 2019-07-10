package service;

import dao.CrimeLogDao;
import entity.crime_log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
<<<<<<< HEAD
import org.springframework.ui.Model;
=======
>>>>>>> ce04a11b37ed17ec7b8dbb5ad1588f15f53d759f

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
    
}
