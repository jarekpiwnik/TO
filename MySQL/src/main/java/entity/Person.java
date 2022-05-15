package entity;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    int id;
    @Column(name = "FIRST_NAME")
    String firstName;

    @Column(name = "LAST_NAME")
    String lastName;

    // getters & setters
    public String toString() { return id + " " + firstName+" "+ lastName;}
}