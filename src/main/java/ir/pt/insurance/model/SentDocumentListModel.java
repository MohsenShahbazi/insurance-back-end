package ir.pt.insurance.model;//package com.pt.bime.entity;

import ir.pt.core.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class SentDocumentListModel extends BaseModel {


    private String mobile;

    private Long regRangeToDate;


    private Long regRangeFromDate;

    private Long sentRangeToDate;


    private Long sentRangeFromDate;

    private String regRange;

    private String sentRange;

    private Long requestId;


    private Long processId;


    private Boolean status;

    private Long started;

    private Long requestDate;


    private String lastMessage;


    private Double percent;


    private String finalEstimated;


    private String completed;

    private String downloadPath;


    private String finalMessage;


}
