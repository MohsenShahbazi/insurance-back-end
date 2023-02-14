package ir.pt.insurance.entity;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "Sata")
@SequenceGenerator(name = "id_Sequence", sequenceName = "Sata_SEQ", allocationSize = 1)
@Data
public class Sata extends BaseEntity {

    @Column(name = "indicator")
    private Long indicator;

    @Column(name = "name")
    private String  name;

    @Column(name = "province")
    private Long provincer;

    @Column(name = "city")
    private Long city;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "address")
    private String address;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;


}
