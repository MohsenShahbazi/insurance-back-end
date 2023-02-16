package ir.pt.insurance.repository;

import ir.pt.core.repository.BaseDAO;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.entity.Document;
import ir.pt.insurance.model.FilterModel;

import java.util.List;

public interface DocumentDao extends BaseDAO<Document> {
    List<Document> getList(FilterModel filter);
}
