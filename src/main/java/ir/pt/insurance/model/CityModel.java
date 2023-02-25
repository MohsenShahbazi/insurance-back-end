package ir.pt.insurance.model;

import ir.pt.core.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class CityModel extends BaseModel {
    private String name;
    private ProvinceModel province;
}
