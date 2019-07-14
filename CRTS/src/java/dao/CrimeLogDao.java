package dao;

import entity.crime_log;
import java.util.List;
import org.springframework.ui.Model;

public interface CrimeLogDao {

    public void saveCrimeLog(crime_log crimeLog);

    public List<crime_log> ListCrimeLog(int userid);
    
}
