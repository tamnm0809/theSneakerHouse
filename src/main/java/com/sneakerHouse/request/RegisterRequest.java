package com.sneakerHouse.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    Long id;
    String username;
    String password;
    String name;
    String image;
    boolean gender;
    Date birthday;
    String email;
    int phone;
    Date date_create;
    boolean active;
}
