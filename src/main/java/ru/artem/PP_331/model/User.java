package ru.artem.PP_331.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstName")
    @NotEmpty(message = "FirstName не должно быть пустым")
    @Size(min = 2, max = 30, message = "FirstName должно быть в пределах от 2 до 30 символов")
    private String firstName;

    @Column(name = "lastName")
    @NotEmpty(message = "LastName не должно быть пустым")
    @Size(min = 2, max = 30, message = "LastName должно быть в пределах от 2 до 30 символов")
    private String lastName;

    @Column(name = "email")
    @Email(message = "Несоотвествие форме Email")
    @NotEmpty(message = "Email не должен быть пустым")
    private String email;

    @Column(name = "age")
    @Min(value = 0, message = "Age должен быть больше, чем 0")
    private int age;

    public User() {}

    public User(int id, String firstName, String lastName, String email, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

