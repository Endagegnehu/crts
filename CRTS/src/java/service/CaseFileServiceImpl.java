package service;

import dao.CaseFileDao;
import entity.case_file;
import entity.crime_log;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CaseFileServiceImpl implements CaseFileService{

    @Autowired
    private CaseFileDao caseFileDao;
    
    @Override
    @Transactional
    public String createCasefile(String typeof_crime,String dateof_crime,String crime_tip_date,
                                 String investigation_end_date,String suspect_name,
                                 String prosecutor_approved,String registrar_approved,String short_sumary,
                                 int prosecutorid,int lawyerid,int log_file_id,int investigator_id) 
    {
        
        return caseFileDao.createCasefile(typeof_crime, dateof_crime, crime_tip_date, investigation_end_date, suspect_name, prosecutor_approved, registrar_approved, short_sumary, prosecutorid, lawyerid, log_file_id, investigator_id);
    }

    @Override
    @Transactional
    public List<crime_log> getCrimelog(int crimelog) 
    {
        return caseFileDao.getCrimelog(crimelog);
    }

    @Override
    @Transactional
    public List<String> getLawyer() 
    {
        return caseFileDao.getLawyer();
    }

    @Override
    @Transactional
    public List<String> getProsecutor() 
    {
        return caseFileDao.getProsecutor();
    }

    @Override
    @Transactional
    public List<case_file> ListCaseFile(int id) 
    {
     return caseFileDao.listCaseFile(id);
    }
    
}
