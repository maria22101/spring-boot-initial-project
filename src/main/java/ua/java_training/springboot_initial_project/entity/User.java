package ua.java_training.springboot_initial_project.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
    private int id;

//    @Column(name = "first_name", nullable = false)
    private String firstName;

//    @Column(name = "last_name", nullable = false)
    private String lastName;

//    @Column(name = "email", nullable = false)
    private String email;

//    @Column(name = "role")
//    @Enumerated(EnumType.STRING)
    private String role;

//    @Column(name = "login", nullable = false)
    private String login;

//    @Column(name = "password", nullable = false)
    private String password;
}
