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
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eid;
    private String edu_title;
    private String edu_institution;
    @Temporal(TemporalType.DATE)
    private Date date_start;
    @Temporal(TemporalType.DATE)
    private Date date_end;
    @Column(name = "edu_logoUrl", length = 2048)
    private String edu_logoUrl;


}
