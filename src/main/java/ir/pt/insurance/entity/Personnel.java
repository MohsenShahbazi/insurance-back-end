package ir.pt.insurance.entity;

import ir.pt.core.repository.BaseEntity;
import ir.pt.insurance.enums.Gender;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Filter;

import javax.persistence.*;
@Setter
@Getter
@Entity
@Table(name = "Personnel")
@SequenceGenerator(name = "id_Sequence", sequenceName = "Personnel_SEQ", allocationSize = 1)
@Data
public class Personnel extends BaseEntity {

    @Column(name = "personnelCode")
    private String personnelCode;

    @Column(name = "gender")
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "contractId", referencedColumnName = "ID")
    @Filter(name = "dataStateFilter", condition = "dataState=0")
    private Contract contract;

    @Column(name = "startInsuranceDate")
    private Long startInsuranceDate;

    @Column(name = "endInsuranceDate")
    private Long endInsuranceDate;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "nationalCode")
    private String nationalCode;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "insuranceCode")
    private String insuranceCode;

    @Column(name = "supervisorInsuranceCode")
    private String supervisorInsuranceCode;

    @Column(name = "versionNumber")
    private Long versionNumber;


}
