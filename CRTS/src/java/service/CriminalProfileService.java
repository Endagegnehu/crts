package service;

import entity.address;
import entity.criminal_profile;

public interface CriminalProfileService {

    public String SaveSuspect(criminal_profile criminalprofile, address address);
    
}
