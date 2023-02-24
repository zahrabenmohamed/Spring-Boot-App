package com.zahra.appLearning.model;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class Contact {


    @NotBlank(message = "Name must not be blank")
    @Size(min = 4 ,message = "the name must be at least 3 characters ")
    private String name;

    @NotBlank(message = "Phone Number must not be blank ")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile Number must be 10 digits ")
    private String mobileNum;

    @NotBlank(message = "Email Must Not be blank")
    @Email(message = "please provide a valid email ")
    private String email;

    @NotBlank(message = "Subject Must Not be blank")
    @Size(min=6 ,message = "The subject  must be at least 6 characters ")
    private String subject;

    @NotBlank(message = "message Must not be blank ")
    @Size(min=11 ,message = "The subject  must be at least 11 characters ")
    private String message ;

}
