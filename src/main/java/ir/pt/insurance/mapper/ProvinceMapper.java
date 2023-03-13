package ir.pt.insurance.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.insurance.entity.Province;
import ir.pt.insurance.model.ProvinceModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProvinceMapper extends BaseMapper<Province, ProvinceModel> {
}
