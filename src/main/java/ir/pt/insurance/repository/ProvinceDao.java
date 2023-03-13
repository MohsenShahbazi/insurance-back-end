package ir.pt.insurance.repository;

import ir.pt.core.repository.BaseDAO;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.entity.Province;
import ir.pt.insurance.model.FilterModel;

import java.util.List;

public interface ProvinceDao extends BaseDAO<Province> {
    List<Province> getList(FilterModel filter);
}
