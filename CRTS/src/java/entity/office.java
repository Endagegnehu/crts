package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "office")
public class office {
    
    @Id
    @Column(name = "idoffice")
    private int idoffice;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "users_idusers")
    private int users_idusers;

    public office(int idoffice, String name, int users_idusers) {
        this.idoffice = idoffice;
        this.name = name;
        this.users_idusers = users_idusers;
    }

   

    public int getIdoffice() {
        return idoffice;
    }

    public void setIdoffice(int idoffice) {
        this.idoffice = idoffice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUsers_idusers() {
        return users_idusers;
    }

    public void setUsers_idusers(int users_idusers) {
        this.users_idusers = users_idusers;
    }
    
}
