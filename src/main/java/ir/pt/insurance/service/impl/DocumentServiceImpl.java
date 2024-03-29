package ir.pt.insurance.service.impl;

import ir.pt.core.BusinessException;
import ir.pt.core.service.BaseServiceImpl;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.entity.Document;
import ir.pt.insurance.enums.CostType;
import ir.pt.insurance.enums.HospitalCostType;
import ir.pt.insurance.mapper.CityMapper;
import ir.pt.insurance.mapper.DocumentMapper;
import ir.pt.insurance.model.CityModel;
import ir.pt.insurance.model.DocumentModel;
import ir.pt.insurance.service.CityService;
import ir.pt.insurance.service.DocumentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl extends BaseServiceImpl<Document, DocumentModel, DocumentMapper> implements DocumentService {

}
