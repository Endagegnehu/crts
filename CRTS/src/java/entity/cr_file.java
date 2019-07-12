package entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cr_file")
public class cr_file {
    
    @Id
    @Column(name = "idcr_file")
    private int idcr_file;
    
    @Column(name = "defendabt_name")
    private String defendabt_name;
        
    @Column(name = "crime_name")
    private String crime_name;

    @Column(name = "investigator_id1")
    private int investigator_id1;
            
    @Column(name = "suspect_id1")
    private int suspect_id1;
            
    @Column(name = "date_of_imprisonment")
    private Date date_of_imprisonment;
            
    @Column(name = "date_of_crime_and_time")
    private Date date_of_crime_and_time;
            
    @Column(name = "date_filed_on")
    private Date date_filed_on;
            
    @Column(name = "case_file_id1")
    private int case_file_id1;

    public cr_file(int idcr_file, String defendabt_name, String crime_name, int investigator_id1, int suspect_id1, Date date_of_imprisonment, Date date_of_crime_and_time, Date date_filed_on, int case_file_id1) {
        this.idcr_file = idcr_file;
        this.defendabt_name = defendabt_name;
        this.crime_name = crime_name;
        this.investigator_id1 = investigator_id1;
        this.suspect_id1 = suspect_id1;
        this.date_of_imprisonment = date_of_imprisonment;
        this.date_of_crime_and_time = date_of_crime_and_time;
        this.date_filed_on = date_filed_on;
        this.case_file_id1 = case_file_id1;
    }

    
    public int getIdcr_file() {
        return idcr_file;
    }

    public void setIdcr_file(int idcr_file) {
        this.idcr_file = idcr_file;
    }

    public String getDefendabt_name() {
        return defendabt_name;
    }

    public void setDefendabt_name(String defendabt_name) {
        this.defendabt_name = defendabt_name;
    }

    public String getCrime_name() {
        return crime_name;
    }

    public void setCrime_name(String crime_name) {
        this.crime_name = crime_name;
    }

    public int getInvestigator_id1() {
        return investigator_id1;
    }

    public void setInvestigator_id1(int investigator_id1) {
        this.investigator_id1 = investigator_id1;
    }

    public int getSuspect_id1() {
        return suspect_id1;
    }

    public void setSuspect_id1(int suspect_id1) {
        this.suspect_id1 = suspect_id1;
    }

    public Date getDate_of_imprisonment() {
        return date_of_imprisonment;
    }

    public void setDate_of_imprisonment(Date date_of_imprisonment) {
        this.date_of_imprisonment = date_of_imprisonment;
    }

    public Date getDate_of_crime_and_time() {
        return date_of_crime_and_time;
    }

    public void setDate_of_crime_and_time(Date date_of_crime_and_time) {
        this.date_of_crime_and_time = date_of_crime_and_time;
    }

    public Date getDate_filed_on() {
        return date_filed_on;
    }

    public void setDate_filed_on(Date date_filed_on) {
        this.date_filed_on = date_filed_on;
    }

    public int getCase_file_id1() {
        return case_file_id1;
    }

    public void setCase_file_id1(int case_file_id1) {
        this.case_file_id1 = case_file_id1;
    }
    
    

}
