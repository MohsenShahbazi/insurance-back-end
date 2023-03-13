package ir.pt.insurance.entity;

import ir.pt.core.repository.BaseEntity;
import ir.pt.insurance.enums.CostType;
import ir.pt.insurance.enums.Gender;
import ir.pt.insurance.enums.HospitalCostType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "Document")
@SequenceGenerator(name = "id_Sequence", sequenceName = "Document_SEQ", allocationSize = 1)
public class Document extends BaseEntity implements Serializable {


    @Column(name = "nationalCode")
    private String nationalCode;
    @Column(name = "acceptedDate")
    private Long acceptedDate;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "leafNumber")
    private Long leafNumber;
    @Column(name = "costType")
    private HospitalCostType costType;
    @Column(name = "documentType")
    private CostType documentType;
    @Column(name = "cost")
    private String cost;
    @Column(name = "hospitalName")
    private String hospitalName;
    @Column(name = "nameFamily")
    private String nameFamily;
    @Column(name = "primaryInsured")
    private String primaryInsured;
    @Column(name = "contractType")
    private String contractType;
    @Column(name = "contractNumber")
    private Long contractNumber;
    @Column(name = "gender")
    private Gender gender;
    @Column(name = "dateReceivingDegree")
    private Long dateReceivingDegree;
    @Column(name = "description")
    private String description;

}
