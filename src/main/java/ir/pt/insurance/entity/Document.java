package ir.pt.insurance.entity;

import ir.pt.core.repository.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "Document")
@SequenceGenerator(name = "id_Sequence", sequenceName = "Document_SEQ", allocationSize = 1)
public class Document extends BaseEntity {


	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "published")
	private boolean published;

}
