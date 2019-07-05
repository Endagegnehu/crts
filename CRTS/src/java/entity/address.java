package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    
    @Column(name = "keble")
    private String kebele;
    
    @Column(name = "user_id")
    private int user_id;
    public address()
    {
        
    }

    public address(String home_number, String phon, String region, String woreda, String kebele, int user_id) {
        this.home_number = home_number;
        this.phon = phon;
        this.region = region;
        this.woreda = woreda;
        this.kebele = kebele;
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    @Override
    public String toString() {
        return "address{" + "idaddres=" + idaddres + ", home_number=" + home_number + ", phon=" + phon + ", region=" + region + ", woreda=" + woreda + ", kebele=" + kebele + ", user_id=" + user_id + '}';
    }
    
}
