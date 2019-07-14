package service;

import entity.case_file;
import java.util.List;

public interface RegistrarService {
    
    public List<case_file> listCaseFile(int id);
    public void ApproveCasefile(int id);
}
