package ir.pt.insurance.model;

import ir.pt.core.model.BaseModel;
import ir.pt.core.repository.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

@Setter
@Getter
public class ExcelListModel extends BaseModel {
    private String contract;
    private String details;
    private String excelFile;
    private String insertTime;
    private String uploaderUser;

}
