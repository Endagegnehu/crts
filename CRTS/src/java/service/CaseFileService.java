package service;

import entity.case_file;
import entity.crime_log;
import java.util.List;

public interface CaseFileService {
    public List<crime_log> getCrimelog(int crimelog);
    public List<String> getLawyer();
    public List<String> getProsecutor();
    public String createCasefile(String typeof_crime,String dateof_crime,String crime_tip_date,
                                        String investigation_end_date,String suspect_name,
                                        String prosecutor_approved,String registrar_approved,String short_sumary,
                                                int prosecutorid,int lawyerid,int log_file_id,int investigator_id);
    public List<case_file> ListCaseFile(int id);
}
