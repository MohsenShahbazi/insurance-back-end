package ir.pt.insurance.model;

import ir.pt.core.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ContractModel extends BaseModel implements Serializable {
    private String name;
    private String code;
    private String dateRange;
    private String startDate;
    private String endDate;
}
