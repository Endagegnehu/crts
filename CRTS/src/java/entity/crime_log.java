package entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crime_log")
public class crime_log {
    
    @Id
    @Column(name = "idcrime_log")
    private int idcrime_log;
    
    @Column(name = "crime_type")
    private String crime_type;
    
    @Column(name = "crime_occurred_date")
    private String crime_occurred_date;
    
    @Column(name = "crime_registered_date")
    private String crime_registered_date;
    
    @Column(name = "defendant_name")
    private String defendant_name;
            
    @Column(name = "plaintiff_name")
    private String plaintiff_name;
            
    @Column(name = "assigned_officer_id")
    private int assigned_officer_id;
            
    @Column(name = "crime_description")
    private String crime_description;

    public crime_log(int idcrime_log, String crime_type, String crime_occurred_date, String crime_registered_date, String defendant_name, String plaintiff_name, int assigned_officer_id, String crime_description) {
        this.idcrime_log = idcrime_log;
        this.crime_type = crime_type;
        this.crime_occurred_date = crime_occurred_date;
        this.crime_registered_date = crime_registered_date;
        this.defendant_name = defendant_name;
        this.plaintiff_name = plaintiff_name;
        this.assigned_officer_id = assigned_officer_id;
        this.crime_description = crime_description;
    }

    public crime_log() 
    {
        
    }
    
    public int getIdcrime_log() {
        return idcrime_log;
    }

    public void setIdcrime_log(int idcrime_log) {
        this.idcrime_log = idcrime_log;
    }

    public String getCrime_type() {
        return crime_type;
    }

    public void setCrime_type(String crime_type) {
        this.crime_type = crime_type;
    }

    public String getCrime_occurred_date() {
        return crime_occurred_date;
    }

    public void setCrime_occurred_date(String crime_occurred_date) {
        this.crime_occurred_date = crime_occurred_date;
    }

    public String getCrime_registered_date() {
        return crime_registered_date;
    }

    public void setCrime_registered_date(String crime_registered_date) {
        this.crime_registered_date = crime_registered_date;
    }

    public String getDefendant_name() {
        return defendant_name;
    }

    public void setDefendant_name(String defendant_name) {
        this.defendant_name = defendant_name;
    }

    public String getPlaintiff_name() {
        return plaintiff_name;
    }

    public void setPlaintiff_name(String plaintiff_name) {
        this.plaintiff_name = plaintiff_name;
    }

    public int getAssigned_officer_id() {
        return assigned_officer_id;
    }

    public void setAssigned_officer_id(int assigned_officer_id) {
        this.assigned_officer_id = assigned_officer_id;
    }

    public String getCrime_description() {
        return crime_description;
    }

    public void setCrime_description(String crime_description) {
        this.crime_description = crime_description;
    }

    @Override
    public String toString() {
        return "crime_log{" + "idcrime_log=" + idcrime_log + ", crime_type=" + crime_type + ", crime_occurred_date=" + crime_occurred_date + ", crime_registered_date=" + crime_registered_date + ", defendant_name=" + defendant_name + ", plaintiff_name=" + plaintiff_name + ", assigned_officer_id=" + assigned_officer_id + ", crime_description=" + crime_description + '}';
    }
    
    
}
