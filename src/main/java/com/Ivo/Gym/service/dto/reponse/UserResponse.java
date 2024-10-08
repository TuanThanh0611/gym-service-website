package com.Ivo.Gym.service.dto.reponse;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class UserResponse {
    String id;
    String userName;
    String email;
    String password;
    String firstName;
    String lastName;
    LocalDate dob;
}
