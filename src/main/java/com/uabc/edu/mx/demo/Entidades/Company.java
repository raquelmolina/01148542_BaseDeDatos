package com.uabc.edu.mx.demo.Entidades;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 11)
    private int id;

    @Column(name = "name", length = 100)
    private String name;

    @ManyToOne
    @JoinColumn( name="statusId_fk" ,nullable=false, foreignKey=@ForeignKey(name = "statusId_fk"))
    private CompanyStatus companyStatus;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private Set<Contact> contacts;

    @Column(name = "version")
    private Timestamp version;


    public Company(String name) {
        this.name = name;
    }

    public Company(){
    }
}
