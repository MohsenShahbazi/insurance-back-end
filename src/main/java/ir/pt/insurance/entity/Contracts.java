package ir.pt.insurance.entity;
import ir.pt.core.repository.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Contracts")
@SequenceGenerator(name = "id_Sequence", sequenceName = "Contracts_SEQ", allocationSize = 1)
public class Contracts extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "dateRange")
    private String dateRange;

    @Column(name = "startDate")
    private String startDate;


    @Column(name = "endDate")
    private String endDate;

}
