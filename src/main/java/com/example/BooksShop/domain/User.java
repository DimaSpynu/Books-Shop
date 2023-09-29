package com.example.BooksShop.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")

public class User {

    private static final String SEQUENCE_NAME = "user_sequence";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_NAME)
    @SequenceGenerator(name = SEQUENCE_NAME, sequenceName = SEQUENCE_NAME, allocationSize = 1)

    private Long id;
    @Column(name = "name")
    private String name;
    private String password;
    private String gender;
    private int age;
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToOne(mappedBy = "user", cascade = CascadeType.REMOVE)
    private Bucket bucket;

    public boolean isChild(){
        return age < 18;
    }

    private enum Role {
        USER,
        ADMIN,
        MANAGER
    }
}
