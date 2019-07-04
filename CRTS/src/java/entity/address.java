package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adress")
public class address {
    
    @Id
    @Column(name = "idaddres")
    private int idaddres;
    
    @Column(name = "home_number")
    private String home_number;
    
    @Column(name = "phon")
    private String phon;
    
    @Column(name = "region")
    private String region;
    
    @Column(name = "woreda")
    private String woreda;
    
    @Column(name = "kebele")
    private String kebele;
    
    @Column(name = "users_idusers")
    private int users_idusers;
    
    @Column(name = "criminal_profile_idsuspect")
    private int criminal_profile_idsuspect;

    public address()
    {
        
    }

    public address(int idaddres, String home_number, String phon, String region, String woreda, String kebele, int users_idusers, int criminal_profile_idsuspect) {
        this.idaddres = idaddres;
        this.home_number = home_number;
        this.phon = phon;
        this.region = region;
        this.woreda = woreda;
        this.kebele = kebele;
        this.users_idusers = users_idusers;
        this.criminal_profile_idsuspect = criminal_profile_idsuspect;
    }

   

    public int getIdaddres() {
        return idaddres;
    }

    public void setIdaddres(int idaddres) {
        this.idaddres = idaddres;
    }

    public String getHome_number() {
        return home_number;
    }

    public void setHome_number(String home_number) {
        this.home_number = home_number;
    }

    public String getPhon() {
        return phon;
    }

    public void setPhon(String phon) {
        this.phon = phon;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getWoreda() {
        return woreda;
    }

    public void setWoreda(String woreda) {
        this.woreda = woreda;
    }

    public String getKebele() {
        return kebele;
    }

    public void setKebele(String kebele) {
        this.kebele = kebele;
    }

    public int getUsers_idusers() {
        return users_idusers;
    }

    public void setUsers_idusers(int users_idusers) {
        this.users_idusers = users_idusers;
    }

    public int getCriminal_profile_idsuspect() {
        return criminal_profile_idsuspect;
    }

    public void setCriminal_profile_idsuspect(int criminal_profile_idsuspect) {
        this.criminal_profile_idsuspect = criminal_profile_idsuspect;
    }
}
