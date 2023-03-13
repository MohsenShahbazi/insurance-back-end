package ir.pt.insurance.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.entity.Province;
import ir.pt.insurance.mapper.CityMapper;
import ir.pt.insurance.mapper.ProvinceMapper;
import ir.pt.insurance.model.CityModel;
import ir.pt.insurance.model.ProvinceModel;
import ir.pt.insurance.service.CityService;
import ir.pt.insurance.service.ProvinceService;
import org.springframework.stereotype.Service;

@Service
public class ProvinceServiceImpl extends BaseServiceImpl<Province, ProvinceModel, ProvinceMapper> implements ProvinceService {

}
