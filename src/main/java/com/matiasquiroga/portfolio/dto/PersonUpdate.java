package com.matiasquiroga.portfolio.dto;

import com.matiasquiroga.portfolio.model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonUpdate {
    private Person person;
}
