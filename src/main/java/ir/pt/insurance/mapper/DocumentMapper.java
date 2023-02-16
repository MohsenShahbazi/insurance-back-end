package ir.pt.insurance.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.entity.Document;
import ir.pt.insurance.model.CityModel;
import ir.pt.insurance.model.DocumentModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocumentMapper extends BaseMapper<Document, DocumentModel> {
}
