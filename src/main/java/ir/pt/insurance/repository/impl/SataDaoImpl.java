package ir.pt.insurance.repository.impl;


import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.entity.Sata;
import ir.pt.insurance.model.FilterModel;
import ir.pt.insurance.repository.CityDao;
import ir.pt.insurance.repository.SataDao;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;


@Repository
public class SataDaoImpl extends BaseDAOImpl<Sata> implements SataDao {

    @Override
    public List<Sata> getList(FilterModel filter) {
        StringBuilder queryString = new StringBuilder("FROM Sata c WHERE c.name LIKE :name and c.dataState=:dataState ");

        Query q = getEm().createQuery(queryString.toString());
        q.setParameter("name", '%' + filter.getFilter().get("name").toString() + '%');
        q.setParameter("dataState", 0);

        return q.getResultList();
    }
}
