package ir.pt.insurance.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.insurance.entity.Personnel;
import ir.pt.insurance.entity.SentDocumentList;
import ir.pt.insurance.model.PersonnelModel;
import ir.pt.insurance.model.SentDocumentListModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SentDocumentListMapper extends BaseMapper<SentDocumentList, SentDocumentListModel> {
}
