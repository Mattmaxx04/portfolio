package com.matiasquiroga.portfolio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

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

    @OneToMany(targetEntity = Education.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ed_fk", referencedColumnName = "id")
    private List<Education> educations;
    @OneToMany(targetEntity = Skill.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "sk_fk", referencedColumnName = "id")
    private List<Skill> skillList;
    @OneToMany(targetEntity = Soft.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "sf_fk", referencedColumnName = "id")
    private List<Soft> softList;
    @OneToMany(targetEntity = Experience.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ex_fk", referencedColumnName = "id")
    private List<Experience> experiences;
    @OneToMany(targetEntity = Project.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "pr_fk", referencedColumnName = "id")
    private List<Project> projects;

}
