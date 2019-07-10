package dao;

import entity.crime_log;
import org.springframework.ui.Model;

public interface CrimeLogDao {

    public void saveCrimeLog(crime_log crimeLog);
    
}
