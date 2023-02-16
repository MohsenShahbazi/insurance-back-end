package ir.pt.insurance.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.model.CityModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper extends BaseMapper<City, CityModel> {
}
