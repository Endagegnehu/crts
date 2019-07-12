package service;

import dao.CrimeLogDao;
import entity.crime_log;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

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

    @Override
    @Transactional
    public List<crime_log> ListCrimeLog(int userid) 
    {
        List<crime_log> thecrimelog = crimeLogDao.ListCrimeLog(userid);
        return thecrimelog;
    }
    
}
