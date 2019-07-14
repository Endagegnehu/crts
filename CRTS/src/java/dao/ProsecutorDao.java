package dao;

import entity.case_file;
import java.util.List;

public interface ProsecutorDao {
    
    public List<case_file> listCaseFile(int id);
    public void ApprovecaseFile(int id);
}
