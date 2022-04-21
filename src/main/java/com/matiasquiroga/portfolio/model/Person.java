package com.matiasquiroga.portfolio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Person {

    @Id
    private Long id;
    private String name;
    private String lastname;
    private Date birth_date;
    private String address;
    private String phone;
    private String e_mail;
    @Column(name = "about_me", length = 600)
    private String about_me;
    @Column(name = "img_url", length = 2048)
    private String img_url;
}
