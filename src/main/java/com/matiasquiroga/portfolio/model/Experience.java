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
    private Long xid;
    private String company_name;
    private String company_url;
    @Temporal(TemporalType.DATE)
    private Date date_start;
    @Temporal(TemporalType.DATE)
    private Date date_end;
    @Column(name = "company_logoUrl", length = 2048)
    private String company_logoUrl;
    @Column(name = "experience_description", length = 1000)
    private String experience_description;

}
