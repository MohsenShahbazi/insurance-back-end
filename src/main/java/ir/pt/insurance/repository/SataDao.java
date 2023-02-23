package ir.pt.insurance.repository;

import ir.pt.core.repository.BaseDAO;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.entity.Sata;
import ir.pt.insurance.model.FilterModel;

import java.util.List;

public interface SataDao extends BaseDAO<Sata> {
    List<Sata> getList(FilterModel filter);
}
