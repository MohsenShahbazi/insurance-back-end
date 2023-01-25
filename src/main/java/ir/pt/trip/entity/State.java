package ir.pt.trip.entity;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "State")
@SequenceGenerator(name = "id_Sequence", sequenceName = "State_hbr_SEQ", allocationSize = 1)
@Data
public class State extends BaseEntity {

    @Column(length = 500, nullable = false)
    private String name;
}
