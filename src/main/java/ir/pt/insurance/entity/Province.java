package ir.pt.insurance.entity;

import ir.pt.core.repository.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "Province")
@SequenceGenerator(name = "id_Sequence", sequenceName = "Province_SEQ", allocationSize = 1)
public class Province extends BaseEntity {

    @Column(length = 500, nullable = false)
    private String name;

}
