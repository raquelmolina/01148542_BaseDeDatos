package com.uabc.edu.mx.demo.Entidades;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "companydetail")
public class CompanyDetail {
    public CompanyDetail(){}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 11)
    private int id;

    @Column(name = "employeeStrength", length = 11)
    private int employeeStrength;

    @Column(name = "notes", length = 1024)
    private String notes;

    public CompanyDetail(int employeeStrength, String notes) {
        this.employeeStrength = employeeStrength;
        this.notes = notes;
    }
}

