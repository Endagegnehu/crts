package entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
=======
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "case_file")
public class case_file {
    
    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
=======
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
    @Column(name = "idcase_file")
    private int idcase_file;
    
    @Column(name = "typeof_crime")
    private String typeof_crime;
    
    @Column(name = "dateof_crime")
    private Date dateof_crime;
    
    @Column(name = "crime_tip_date")
    private Date crime_tip_date;
    
    @Column(name = "cr_file_id")
    private int cr_file_id;
    
    @Column(name = "log_file_id")
    private int log_file_id;
    
    @Column(name = "investigation_end_date")
    private Date investigation_end_date;
    
    @Column(name = "investigation_authorizer")
    private int investigation_authorizer;
    
    @Column(name = "investigator_id")
    private int investigator_id;
    
    @Column(name = "prosecutor_id")
    private int prosecutor_id;
    
    @Column(name = "suspect_id")
    private int suspect_id;
    
    @Column(name = "short_sumary")
    private String short_sumary;

<<<<<<< HEAD
    public case_file( String typeof_crime, Date dateof_crime, Date crime_tip_date, int cr_file_id, int log_file_id, Date investigation_end_date, int investigation_authorizer, int investigator_id, int prosecutor_id, int suspect_id, String short_sumary) {
=======
    public case_file(int idcase_file, String typeof_crime, Date dateof_crime, Date crime_tip_date, int cr_file_id, int log_file_id, Date investigation_end_date, int investigation_authorizer, int investigator_id, int prosecutor_id, int suspect_id, String short_sumary) {
        this.idcase_file = idcase_file;
>>>>>>> 4ac56edb36e166dfeb3e0f948b85612ddb0d4858
        this.typeof_crime = typeof_crime;
        this.dateof_crime = dateof_crime;
        this.crime_tip_date = crime_tip_date;
        this.cr_file_id = cr_file_id;
        this.log_file_id = log_file_id;
        this.investigation_end_date = investigation_end_date;
        this.investigation_authorizer = investigation_authorizer;
        this.investigator_id = investigator_id;
        this.prosecutor_id = prosecutor_id;
        this.suspect_id = suspect_id;
        this.short_sumary = short_sumary;
    }

    

    public int getIdcase_file() {
        return idcase_file;
    }

    public void setIdcase_file(int idcase_file) {
        this.idcase_file = idcase_file;
    }

    public String getTypeof_crime() {
        return typeof_crime;
    }

    public void setTypeof_crime(String typeof_crime) {
        this.typeof_crime = typeof_crime;
    }

    public Date getDateof_crime() {
        return dateof_crime;
    }

    public void setDateof_crime(Date dateof_crime) {
        this.dateof_crime = dateof_crime;
    }

    public Date getCrime_tip_date() {
        return crime_tip_date;
    }

    public void setCrime_tip_date(Date crime_tip_date) {
        this.crime_tip_date = crime_tip_date;
    }

    public int getCr_file_id() {
        return cr_file_id;
    }

    public void setCr_file_id(int cr_file_id) {
        this.cr_file_id = cr_file_id;
    }

    public int getLog_file_id() {
        return log_file_id;
    }

    public void setLog_file_id(int log_file_id) {
        this.log_file_id = log_file_id;
    }

    public Date getInvestigation_end_date() {
        return investigation_end_date;
    }

    public void setInvestigation_end_date(Date investigation_end_date) {
        this.investigation_end_date = investigation_end_date;
    }

    public int getInvestigation_authorizer() {
        return investigation_authorizer;
    }

    public void setInvestigation_authorizer(int investigation_authorizer) {
        this.investigation_authorizer = investigation_authorizer;
    }

    public int getInvestigator_id() {
        return investigator_id;
    }

    public void setInvestigator_id(int investigator_id) {
        this.investigator_id = investigator_id;
    }

    public int getProsecutor_id() {
        return prosecutor_id;
    }

    public void setProsecutor_id(int prosecutor_id) {
        this.prosecutor_id = prosecutor_id;
    }

    public int getSuspect_id() {
        return suspect_id;
    }

    public void setSuspect_id(int suspect_id) {
        this.suspect_id = suspect_id;
    }

    public String getShort_sumary() {
        return short_sumary;
    }

    public void setShort_sumary(String short_sumary) {
        this.short_sumary = short_sumary;
    }
    
    
}
