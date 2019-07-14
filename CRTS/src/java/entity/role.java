package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class role {
    
    @Id
    @Column(name = "idrole")
    private int idrole;
    
    @Column(name = "number")
    private int number;
    
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "users_idusers")
    @Column(name = "users_idusers")
    private int users_idusers;

    public role(int idrole, int number, int users_idusers) {
        this.idrole = idrole;
        this.number = number;
        this.users_idusers = users_idusers;
    }

    public role()
    {
        
    }

    public int getIdrole() {
        return idrole;
    }

    public void setIdrole(int idrole) {
        this.idrole = idrole;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getUsers_idusers() {
        return users_idusers;
    }

    public void setUsers_idusers(int users_idusers) {
        this.users_idusers = users_idusers;
    }
    
    
}
