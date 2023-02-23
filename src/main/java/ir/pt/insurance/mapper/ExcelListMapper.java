package ir.pt.insurance.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.insurance.entity.ExcelList;
import ir.pt.insurance.entity.Personnel;
import ir.pt.insurance.model.ExcelListModel;
import ir.pt.insurance.model.PersonnelModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExcelListMapper extends BaseMapper<ExcelList, ExcelListModel> {
}
