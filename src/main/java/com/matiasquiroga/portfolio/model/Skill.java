package com.matiasquiroga.portfolio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;
    private String skill_name;
    private String skill_age;
    @Column(name = "skill_logoUrl", length = 2048)
    private String skill_logoUrl;

}
