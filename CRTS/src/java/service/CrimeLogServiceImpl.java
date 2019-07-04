package service;

import dao.CrimeLogDao;
import entity.crime_log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
