package ir.pt.insurance.entity;
import ir.pt.core.repository.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "Contract")
@SequenceGenerator(name = "id_Sequence", sequenceName = "Contract_SEQ", allocationSize = 1)
public class Contract extends BaseEntity {

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
