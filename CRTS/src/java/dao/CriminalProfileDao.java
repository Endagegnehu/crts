package dao;

import entity.address;
import entity.criminal_profile;

public interface CriminalProfileDao {
    
    public String SaveSuspect(criminal_profile criminalprofile, address address);
}
