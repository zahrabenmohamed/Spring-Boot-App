package com.zahra.appLearning.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Contact {

    private String name;
    private Integer mobileNum;
    private String email;
    private String subject;
    private String message ;

}
