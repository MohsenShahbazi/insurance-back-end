package ir.pt.insurance.entity;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Filter;

import javax.persistence.*;
@Setter
@Getter
@Entity
@Table(name = "Sata")
@SequenceGenerator(name = "id_Sequence", sequenceName = "Sata_SEQ", allocationSize = 1)
@Data
public class Sata extends BaseEntity {

    @Column(name = "indicator")
    private Long indicator;

    @Column(name = "name")
    private String  name;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "province", referencedColumnName = "ID")
    @Filter(name = "dataStateFilter", condition = "dataState=0")
    private Province province;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "city", referencedColumnName = "ID")
    @Filter(name = "dataStateFilter", condition = "dataState=0")
    private City city;

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
