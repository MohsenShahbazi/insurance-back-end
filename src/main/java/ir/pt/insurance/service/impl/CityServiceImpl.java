package ir.pt.insurance.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.mapper.CityMapper;
import ir.pt.insurance.model.CityModel;
import ir.pt.insurance.service.CityService;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl extends BaseServiceImpl<City, CityModel, CityMapper> implements CityService {

}
