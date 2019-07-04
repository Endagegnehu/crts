package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rank")
public class rank {
    
    @Id
    @Column(name = "idrank")
    private int idrank;
    
    @Column(name = "rank_type")
    private String rank_type;
    
    @Column(name = "job_idjob")
    private int job_idjob;
    
    @Column(name = "job_users_idusers")
    private int job_users_idusers;

    public rank(int idrank, String rank_type, int job_idjob, int job_users_idusers) {
        this.idrank = idrank;
        this.rank_type = rank_type;
        this.job_idjob = job_idjob;
        this.job_users_idusers = job_users_idusers;
    }

   
   
    public int getIdrank() {
        return idrank;
    }

    public void setIdrank(int idrank) {
        this.idrank = idrank;
    }

    public String getRank_type() {
        return rank_type;
    }

    public void setRank_type(String rank_type) {
        this.rank_type = rank_type;
    }

    public int getJob_idjob() {
        return job_idjob;
    }

    public void setJob_idjob(int job_idjob) {
        this.job_idjob = job_idjob;
    }

    public int getJob_users_idusers() {
        return job_users_idusers;
    }

    public void setJob_users_idusers(int job_users_idusers) {
        this.job_users_idusers = job_users_idusers;
    }
}
