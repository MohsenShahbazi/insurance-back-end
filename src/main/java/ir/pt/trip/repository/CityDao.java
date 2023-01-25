package ir.pt.trip.repository;

import ir.pt.core.repository.BaseDAO;
import ir.pt.trip.entity.City;
import ir.pt.trip.model.FilterModel;

import java.util.List;

public interface CityDao extends BaseDAO<City> {
    List<City> getList(FilterModel filter);
}
