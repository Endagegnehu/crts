package service;

import entity.cr_file;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CrFileServiceImpl implements CrFileService{

    @Override
    @Transactional
    public String ListCrfile()
    {
     return "hello";
    }
    
}
