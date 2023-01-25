package ir.pt.trip.entity;

import ir.pt.core.repository.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Filter;

import javax.persistence.*;


@Entity
@Table(name = "City")
@SequenceGenerator(name = "id_Sequence", sequenceName = "City_hbr_SEQ", allocationSize = 1)
@NoArgsConstructor
@Getter@Setter
public class City extends BaseEntity {

    @Column(name = "name", length = 500, nullable = false)
    private String name;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "state", referencedColumnName = "ID")
    @Filter(name = "dataStateFilter", condition = "dataState=0")
    private State state;

    public City(Long id, String name) {
        this.name = name;
        super.setId(id);
    }
}
