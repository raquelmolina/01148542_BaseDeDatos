package com.uabc.edu.mx.demo.Entidades;

import com.uabc.edu.mx.demo.Entidades.Contact;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ContactDetail")
public class ContactDetail {
    public ContactDetail(){}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 11)
    private int id;

    @Column(name = "gender", length = 11)
    private int gender;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(foreignKey=@ForeignKey(name = "contact_fk"))
    private Contact contact;

    public ContactDetail(int gender, Date dateOfBirth) {
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
}
