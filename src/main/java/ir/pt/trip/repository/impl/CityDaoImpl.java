package ir.pt.trip.repository.impl;


import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.trip.entity.City;
import ir.pt.trip.model.FilterModel;
import ir.pt.trip.repository.CityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;


@Repository
public class CityDaoImpl extends BaseDAOImpl<City> implements CityDao {

    @Override
    public List<City> getList(FilterModel filter) {
        StringBuilder queryString = new StringBuilder("FROM City c WHERE c.name LIKE :name and c.dataState=:dataState ");

        Query q = getEm().createQuery(queryString.toString());
        q.setParameter("name", '%' + filter.getFilter().get("name").toString() + '%');
        q.setParameter("dataState", 0);

        return q.getResultList();
    }
}
