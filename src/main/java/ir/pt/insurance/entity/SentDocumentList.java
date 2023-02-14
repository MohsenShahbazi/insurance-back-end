package ir.pt.insurance.entity;//package com.pt.bime.entity;

import ir.pt.core.repository.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "SentDocumentList")
@SequenceGenerator(name = "id_Sequence", sequenceName = "SentDocumentList_SEQ", allocationSize = 1)
public class SentDocumentList extends BaseEntity {

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "regRangeToDate")
    private Long regRangeToDate;

    @Column(name = "regRangeFromDate")
    private Long regRangeFromDate;

    @Column(name = "sentRangeToDate")
    private Long sentRangeToDate;

    @Column(name = "sentRangeFromDate")
    private Long sentRangeFromDate;

    @Column(name = "regRange")
    private String regRange;

    @Column(name = "sentRange")
    private String sentRange;

    @Column(name = "requestId")
    private Long requestId;

    @Column(name = "processId")
    private Long processId;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "started")
    private Long started;

    @Column(name = "requestDate")
    private Long requestDate;

    @Column(name = "lastMessage")
    private String lastMessage;

    @Column(name = "percent")
    private Double percent;

    @Column(name = "finalEstimated")
    private String finalEstimated;

    @Column(name = "completed")
    private String completed;

    @Column(name = "downloadPath")
    private String downloadPath;

    @Column(name = "finalMessage")
    private String finalMessage;


}
