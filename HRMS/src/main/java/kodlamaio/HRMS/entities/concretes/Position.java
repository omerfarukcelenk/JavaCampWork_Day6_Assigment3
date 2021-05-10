package kodlamaio.HRMS.entities.concretes;

import lombok.Data;


import javax.persistence.*;

@Data
@Entity
@Table(name = "Users")
public class Position {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int Id;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Password")
    private String Password;

    public Position(int id, String email, String password) {
        Id = id;
        Email = email;
        Password = password;
    }
}
