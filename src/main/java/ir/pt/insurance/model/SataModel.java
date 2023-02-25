package ir.pt.insurance.model;

import ir.pt.core.model.BaseModel;
import ir.pt.core.repository.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

@Setter
@Getter
public class SataModel extends BaseModel {

    private Long indicator;
    private String name;
    private ProvinceModel province;
    private CityModel city;
    private String telephone;
    private String mobile;
    private String address;
    private String userName;
    private String password;


}
