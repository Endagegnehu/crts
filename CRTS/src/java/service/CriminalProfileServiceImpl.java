package service;

import dao.CriminalProfileDao;
import entity.address;
import entity.criminal_profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CriminalProfileServiceImpl implements CriminalProfileService{

    @Autowired
    private CriminalProfileDao criminalProfileDao;
    
    @Override
    @Transactional
    public String SaveSuspect(criminal_profile criminalprofile, address address) 
    {
        return criminalProfileDao.SaveSuspect(criminalprofile, address);
    }
    
}
