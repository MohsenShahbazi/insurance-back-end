package ir.pt.insurance.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.insurance.entity.Document;
import ir.pt.insurance.entity.Personnel;
import ir.pt.insurance.model.DocumentModel;
import ir.pt.insurance.model.PersonnelModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonnelMapper extends BaseMapper<Personnel, PersonnelModel> {
}
