package ir.pt.insurance.repository;

import ir.pt.core.repository.BaseDAO;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.entity.Personnel;
import ir.pt.insurance.model.FilterModel;

import java.util.List;

public interface PersonnelDao extends BaseDAO<Personnel> {
    List<Personnel> getList(FilterModel filter);
}
