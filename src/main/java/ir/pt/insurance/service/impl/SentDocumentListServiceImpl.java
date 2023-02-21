package ir.pt.insurance.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.entity.SentDocumentList;
import ir.pt.insurance.mapper.CityMapper;
import ir.pt.insurance.mapper.SentDocumentListMapper;
import ir.pt.insurance.model.CityModel;
import ir.pt.insurance.model.SentDocumentListModel;
import ir.pt.insurance.service.CityService;
import ir.pt.insurance.service.SentDocumentListService;
import org.springframework.stereotype.Service;

@Service
public class SentDocumentListServiceImpl extends BaseServiceImpl<SentDocumentList, SentDocumentListModel, SentDocumentListMapper> implements SentDocumentListService {

}
