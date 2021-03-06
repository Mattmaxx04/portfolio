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
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;
    private String project_name;
    @Column(name = "project_imgUrl", length = 2048)
    private String project_imgUrl;
    private String project_url;
    @Column(name = "project_description", length = 300)
    private String project_description;
}
