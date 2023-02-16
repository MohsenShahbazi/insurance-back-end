package ir.pt.insurance.repository;

import ir.pt.core.repository.BaseDAO;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.entity.Contract;
import ir.pt.insurance.model.FilterModel;

import java.util.List;

public interface ContractDao extends BaseDAO<Contract> {
    List<City> getList(FilterModel filter);
}
