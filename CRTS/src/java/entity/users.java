package entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "users")
public class users {
    
    @Id
    @Column(name = "idusers")
    private int idusers;
    
    @Column(name = "user_name")
    private String user_name;
            
    @Column(name = "password")
    private String password;
            
    @Column(name = "email")
    private String email;
            
    @Column(name = "first_name")
    private String first_name;
            
    @Column(name = "last_name")
    private String last_name;   
   
    @Column(name = "created_at")
<<<<<<< HEAD
    private String created_at;
    
    @Column(name = "updated_at")
    private String updated_at;
    
    public users(int idusers, String user_name, String password, String email, String first_name, String last_name, String created_at, String updated_at) {
=======
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created_at;
    
    @Column(name = "updated_at")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date updated_at;

    public users() {
        
    }

    public users(int idusers, String user_name, String password, String email, String first_name, String last_name, Date created_at, Date updated_at) {
>>>>>>> 314e1dd3b104f1446ecb2ceff62d3efe541b2476
        this.idusers = idusers;
        this.user_name = user_name;
        this.password = password;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

<<<<<<< HEAD
    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

   public users() {
        
    }
=======
     
    
>>>>>>> 314e1dd3b104f1446ecb2ceff62d3efe541b2476
    public int getIdusers() {
        return idusers;
    }

    public void setIdusers(int idusers) {
        this.idusers = idusers;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

<<<<<<< HEAD
  
=======
    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

>>>>>>> 314e1dd3b104f1446ecb2ceff62d3efe541b2476
    @Override
    public String toString() {
        return "users{" + "idusers=" + idusers + ", user_name=" + user_name + ", password=" + password + ", email=" + email + ", first_name=" + first_name + ", last_name=" + last_name + ", created_at=" + created_at + ", updated_at=" + updated_at + '}';
    }
    
    
    
}

