package csulb.cecs323.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ComputingAccount {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String username;
    private String password;
    private int diskQuote;

    private String getUsername(){ return username;  }

    public void setUsername(String username){ this.username = username; }

    private String getPassword(){ return password;  }

    public void setPassword(String password){ this.password = password; }

    private int getDiskQuote(){ return diskQuote;  }

    public void setDiskQuote(int diskQuote){ this.diskQuote = diskQuote; }



}
