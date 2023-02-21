package ir.pt.insurance.repository;

import ir.pt.core.repository.BaseDAO;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.entity.SentDocumentList;
import ir.pt.insurance.model.FilterModel;

import java.util.List;

public interface SentDocumentListDao extends BaseDAO<SentDocumentList> {
    List<SentDocumentList> getList(FilterModel filter);
}
