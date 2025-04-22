package com.sastipg.security.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor

public class SignupRequest {
//    @NotBlank
//    @Size(min = 3, max = 20)
//    private String firstName;
//
//    @NotBlank
//    @Size(min = 3, max = 20)
//    private String lastName;
//
//    @NotBlank
//    @Size(max = 50)
//    @Email
//    private String email;
//
//    private Set<String> role;
//
//    @NotBlank
//    @Size(min = 6, max = 40)
//    private String password;
//
//    public Set<String> getRole() {
//        return this.role;
//    }
//
//    public void setRole(Set<String> role) {
//        this.role = role;
//    }

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dob;
    private Set<String> role;
    private String city;
    private String password;
}
