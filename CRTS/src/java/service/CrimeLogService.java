package service;

import entity.crime_log;
import java.util.List;
import org.springframework.ui.Model;

public interface CrimeLogService {
    
    public void saveCrimeLog(crime_log crimeLog);
    public List<crime_log> ListCrimeLog(int userid);
}
