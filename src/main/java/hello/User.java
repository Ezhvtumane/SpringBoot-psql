package hello;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ogst")
public class User implements Serializable{

    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long user_id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    protected User(){}

    public User(String name, String email){
        this.name=name;
        this.email=email;
    }

    @Override
    public String toString(){
        return String.format("User[id=%d, User Name: '%s', User email: '%s']", user_id, name, email);
    }

}
