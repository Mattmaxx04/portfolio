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
public class Soft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fid;
    private String sft_name;
    @Column(name = "sft_logoUrl", length = 2048)
    private String sft_logoUrl;
}
