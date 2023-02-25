package ir.pt.insurance.model;

import ir.pt.core.model.BaseModel;
import ir.pt.insurance.enums.Gender;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class PersonnelModel extends BaseModel {

    private String personnelCode;
    private Gender gender;
    private ContractModel contractModel;
    private Long startInsuranceDate;
    private Long endInsuranceDate;
    private Boolean active;
    private String nationalCode;
    private String firstName;
    private String lastName;
    private String insuranceCode;
    private String supervisorInsuranceCode;
    private Long versionNumber;


}
