package com.matiasquiroga.portfolio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company_name;
    private String company;
    @Temporal(TemporalType.DATE)
    private Date date_start;
    @Temporal(TemporalType.DATE)
    private Date date_end;
    @Column(name = "education_logoUrl", length = 2048)
    private String edu_logoUrl;
}
