package ir.pt.insurance.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.entity.Personnel;
import ir.pt.insurance.mapper.CityMapper;
import ir.pt.insurance.mapper.PersonnelMapper;
import ir.pt.insurance.model.CityModel;
import ir.pt.insurance.model.PersonnelModel;
import ir.pt.insurance.service.CityService;
import ir.pt.insurance.service.PersonnelService;
import org.springframework.stereotype.Service;

@Service
public class PersonnelServiceImpl extends BaseServiceImpl<Personnel, PersonnelModel, PersonnelMapper> implements PersonnelService {

}
