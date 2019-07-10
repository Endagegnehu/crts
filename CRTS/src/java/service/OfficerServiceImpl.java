package service;

import dao.OfficerDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OfficerServiceImpl implements OfficerService{

    @Autowired
    private OfficerDao officerDao;
    
    @Override
    @Transactional
    public List<String> getOfficers() 
    {
        List<String> offlist = officerDao.getOfficers();
        return offlist;
    }
    
}
