package com.uabc.edu.mx.demo.Entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@Entity
@Table(name = "companystatus")
public class CompanyStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 11)
    private int id;

    @Column(name = "name", length = 45)
    private String name;

    @OneToMany(mappedBy = "companyStatus", cascade = CascadeType.ALL)
    private Set<Company> companies;

    public  CompanyStatus(){}


}
