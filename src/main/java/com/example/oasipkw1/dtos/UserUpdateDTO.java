package com.example.oasipkw1.dtos;


import com.example.oasipkw1.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateDTO {
    private Integer id;
    private String name;
    private String email;
    private Role role;
}
