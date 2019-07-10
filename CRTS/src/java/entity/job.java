package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job")
public class job {
    
    @Id
    @Column(name = "idjob")
    private int idjob;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "users_idusers")
    private int users_idusers;

    public job(int idjob, String name, int users_idusers) {
        this.idjob = idjob;
        this.name = name;
        this.users_idusers = users_idusers;
    }

    public job()
    {
        
    }
    
    public int getIdjob() {
        return idjob;
    }

    public void setIdjob(int idjob) {
        this.idjob = idjob;
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
