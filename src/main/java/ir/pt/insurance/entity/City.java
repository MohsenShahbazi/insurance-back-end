package ir.pt.insurance.entity;

import ir.pt.core.repository.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Filter;

import javax.persistence.*;
import java.io.Serializable;


@Setter
@Getter
@Entity
@Table(name = "City")
@SequenceGenerator(name = "id_Sequence", sequenceName = "City_SEQ", allocationSize = 1)
public class City extends BaseEntity {

    @Column(name = "name", length = 500, nullable = false)
    private String name;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "provinceId", referencedColumnName = "ID",nullable = false)
    @Filter(name = "dataStateFilter", condition = "dataState=0")
    private Province province;

}
