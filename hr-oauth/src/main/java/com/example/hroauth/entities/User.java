package com.example.hroauth.entities;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Set<Role> roles = new HashSet<>();

}
