package service;

import entity.crime_log;
import org.springframework.ui.Model;

public interface CrimeLogService {
    
    public void saveCrimeLog(crime_log crimeLog);
}
