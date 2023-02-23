package ir.pt.insurance.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.insurance.entity.Document;
import ir.pt.insurance.entity.Sata;
import ir.pt.insurance.model.DocumentModel;
import ir.pt.insurance.model.SataModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SataMapper extends BaseMapper<Sata, SataModel> {
}
