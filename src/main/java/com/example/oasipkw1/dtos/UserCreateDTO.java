package com.example.oasipkw1.dtos;

import com.example.oasipkw1.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Enumerated;

@Getter
@Setter
public class UserCreateDTO {
    private Integer id;
    private String name;
    private String email;
    @Enumerated()
    private Role role = Role.student;

}
