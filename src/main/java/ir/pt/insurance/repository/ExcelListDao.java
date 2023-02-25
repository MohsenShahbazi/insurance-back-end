package ir.pt.insurance.repository;

import ir.pt.core.repository.BaseDAO;
import ir.pt.insurance.entity.ExcelList;
import ir.pt.insurance.entity.Personnel;
import ir.pt.insurance.model.FilterModel;

import java.util.List;

public interface ExcelListDao extends BaseDAO<ExcelList> {
    List<ExcelList> getList(FilterModel filter);
}
