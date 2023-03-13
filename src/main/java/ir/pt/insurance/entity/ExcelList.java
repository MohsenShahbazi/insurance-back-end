package ir.pt.insurance.entity;

import ir.pt.core.repository.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@Entity
@SequenceGenerator(name = "id_Sequence", sequenceName = "ExcelList_SEQ", allocationSize = 1)
@Table(name = "ExcelList")
public class ExcelList extends BaseEntity {

    @Column(name = "contract")
    private String contract;

    @Column(name = "details")
    private String details;

    @Column(name = "excelFile")
    private String excelFile;

    @Column(name = "insertTime")
    private String insertTime;

    @Column(name = "uploaderUser")
    private String uploaderUser;

}
