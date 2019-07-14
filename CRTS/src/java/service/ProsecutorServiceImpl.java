package service;

import dao.ProsecutorDao;
import entity.case_file;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProsecutorServiceImpl implements ProsecutorService{

    @Autowired
    private ProsecutorDao prosecutorDao;
    
    @Override
    @Transactional
    public List<case_file> listCaseFile(int id) 
    {
        return prosecutorDao.listCaseFile(id);
    }

    @Override
    @Transactional
    public void ApproveCasefile(int id) 
    {
        prosecutorDao.ApprovecaseFile(id);
    }
    
    
}
