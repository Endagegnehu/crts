package entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "case_file")
public class case_file 
{    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcase_file")
    private int idcase_file;

    @Column(name = "typeof_crime")
    private String typeof_crime;
    
    @Column(name = "dateof_crime")
    private String dateof_crime;
    
    @Column(name = "crime_tip_date")
    private String crime_tip_date;
    
    @Column(name = "log_file_id")
    private int log_file_id;
    
    @Column(name = "investigation_end_date")
    private String investigation_end_date;
    
    @Column(name = "investigator_id")
    private int investigator_id;
    
    @Column(name = "prosecutor_id")
    private int prosecutor_id;
    
    @Column(name = "suspect_name")
    private String suspect_name;
    
    @Column(name = "short_sumary")
    private String short_sumary;
    
    @Column(name = "lawyer_id")
    private int lawyer_id;
    
    @Column(name = "prosecutor_approved")
    private String prosecutor_approved;
    
    @Column(name = "registrar_approved")
    private String registrar_approved;

    public case_file(String typeof_crime, String dateof_crime, String crime_tip_date, int log_file_id, String investigation_end_date, int investigator_id, int prosecutor_id, String suspect_name, String short_sumary, int lawyer_id, String prosecutor_approved, String registrar_approved) {
        this.typeof_crime = typeof_crime;
        this.dateof_crime = dateof_crime;
        this.crime_tip_date = crime_tip_date;
        this.log_file_id = log_file_id;
        this.investigation_end_date = investigation_end_date;
        this.investigator_id = investigator_id;
        this.prosecutor_id = prosecutor_id;
        this.suspect_name = suspect_name;
        this.short_sumary = short_sumary;
        this.lawyer_id = lawyer_id;
        this.prosecutor_approved = prosecutor_approved;
        this.registrar_approved = registrar_approved;
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

    public String getDateof_crime() {
        return dateof_crime;
    }

    public void setDateof_crime(String dateof_crime) {
        this.dateof_crime = dateof_crime;
    }

    public String getCrime_tip_date() {
        return crime_tip_date;
    }

    public void setCrime_tip_date(String crime_tip_date) {
        this.crime_tip_date = crime_tip_date;
    }

    public int getLog_file_id() {
        return log_file_id;
    }

    public void setLog_file_id(int log_file_id) {
        this.log_file_id = log_file_id;
    }

    public String getInvestigation_end_date() {
        return investigation_end_date;
    }

    public void setInvestigation_end_date(String investigation_end_date) {
        this.investigation_end_date = investigation_end_date;
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

    public String getSuspect_name() {
        return suspect_name;
    }

    public void setSuspect_name(String suspect_name) {
        this.suspect_name = suspect_name;
    }

    public String getShort_sumary() {
        return short_sumary;
    }

    public void setShort_sumary(String short_sumary) {
        this.short_sumary = short_sumary;
    }

    public int getLawyer_id() {
        return lawyer_id;
    }

    public void setLawyer_id(int lawyer_id) {
        this.lawyer_id = lawyer_id;
    }

    public String getProsecutor_approved() {
        return prosecutor_approved;
    }

    public void setProsecutor_approved(String prosecutor_approved) {
        this.prosecutor_approved = prosecutor_approved;
    }

    public String getRegistrar_approved() {
        return registrar_approved;
    }

    public void setRegistrar_approved(String registrar_approved) {
        this.registrar_approved = registrar_approved;
    }

    @Override
    public String toString() {
        return "case_file{" + "idcase_file=" + idcase_file + ", typeof_crime=" + typeof_crime + ", dateof_crime=" + dateof_crime + ", crime_tip_date=" + crime_tip_date + ", log_file_id=" + log_file_id + ", investigation_end_date=" + investigation_end_date + ", investigator_id=" + investigator_id + ", prosecutor_id=" + prosecutor_id + ", suspect_name=" + suspect_name + ", short_sumary=" + short_sumary + ", lawyer_id=" + lawyer_id + ", prosecutor_approved=" + prosecutor_approved + ", registrar_approved=" + registrar_approved + '}';
    }

    public case_file() {
    }
    
    
}
