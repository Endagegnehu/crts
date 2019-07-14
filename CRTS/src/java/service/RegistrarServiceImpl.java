package service;

import dao.ProsecutorDao;
import dao.RegistrarDao;
import entity.case_file;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistrarServiceImpl implements RegistrarService{

    @Autowired
    private RegistrarDao registrarDao;
    
    @Override
    @Transactional
    public List<case_file> listCaseFile(int id) 
    {
        return registrarDao.listCaseFile(id);
    }

    @Override
    @Transactional
    public void ApproveCasefile(int id) 
    {
        registrarDao.ApprovecaseFile(id);
    }
    
    
}
