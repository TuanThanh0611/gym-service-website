package com.Ivo.Gym.service.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min=3,message = "INVAILID_USERNAME")
    String userName;
    @Size(min=6,message = "INVALID_PASSWORD")

    String email;
    String password;
    String firstName;
    String lastName;
    LocalDate dob;
}
