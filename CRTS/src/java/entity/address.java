package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
=======
>>>>>>> 314e1dd3b104f1446ecb2ceff62d3efe541b2476
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
<<<<<<< HEAD
@Table(name="address")
public class address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
=======
@Table(name="adress")
public class address {
    
    @Id
>>>>>>> 314e1dd3b104f1446ecb2ceff62d3efe541b2476
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
    
<<<<<<< HEAD
    @Column(name = "keble")
    private String kebele;
    
    @Column(name = "user_id")
    private int user_id;
=======
    @Column(name = "kebele")
    private String kebele;
    
    @Column(name = "users_idusers")
    private int users_idusers;
    
    @Column(name = "criminal_profile_idsuspect")
    private int criminal_profile_idsuspect;

>>>>>>> 314e1dd3b104f1446ecb2ceff62d3efe541b2476
    public address()
    {
        
    }

<<<<<<< HEAD
    public address(String home_number, String phon, String region, String woreda, String kebele, int user_id) {
=======
    public address(int idaddres, String home_number, String phon, String region, String woreda, String kebele, int users_idusers, int criminal_profile_idsuspect) {
        this.idaddres = idaddres;
>>>>>>> 314e1dd3b104f1446ecb2ceff62d3efe541b2476
        this.home_number = home_number;
        this.phon = phon;
        this.region = region;
        this.woreda = woreda;
        this.kebele = kebele;
<<<<<<< HEAD
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    
=======
        this.users_idusers = users_idusers;
        this.criminal_profile_idsuspect = criminal_profile_idsuspect;
    }

   

>>>>>>> 314e1dd3b104f1446ecb2ceff62d3efe541b2476
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

<<<<<<< HEAD
    @Override
    public String toString() {
        return "address{" + "idaddres=" + idaddres + ", home_number=" + home_number + ", phon=" + phon + ", region=" + region + ", woreda=" + woreda + ", kebele=" + kebele + ", user_id=" + user_id + '}';
    }
    
=======
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
>>>>>>> 314e1dd3b104f1446ecb2ceff62d3efe541b2476
}
