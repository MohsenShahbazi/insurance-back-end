package ir.pt.insurance.model;

import ir.pt.core.model.BaseModel;
import ir.pt.insurance.enums.CostType;
import ir.pt.insurance.enums.Gender;
import ir.pt.insurance.enums.HospitalCostType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.io.Serializable;

@Setter
@Getter
public class DocumentModel extends BaseModel {

    private String nationalCode;
    private Long acceptedDate;
    private String mobile;
    private Long leafNumber;
    private HospitalCostType costType;
    private CostType documentType;
    private String cost;
    private String hospitalName;
    private String description;
    private String nameFamily;
    private String primaryInsured;
    private String contractType;
    private Long contractNumber;
    private Gender gender;
    private Long dateReceivingDegree;
}
