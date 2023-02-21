package ir.pt.insurance.repository.impl;


import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.insurance.entity.City;
import ir.pt.insurance.entity.SentDocumentList;
import ir.pt.insurance.model.FilterModel;
import ir.pt.insurance.repository.CityDao;
import ir.pt.insurance.repository.SentDocumentListDao;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;


@Repository
public class SentDocumentListDaoImpl extends BaseDAOImpl<SentDocumentList> implements SentDocumentListDao {

    @Override
    public List<SentDocumentList> getList(FilterModel filter) {
        StringBuilder queryString = new StringBuilder("FROM SentDocumentList c WHERE c.name LIKE :name and c.dataState=:dataState ");

        Query q = getEm().createQuery(queryString.toString());
        q.setParameter("name", '%' + filter.getFilter().get("name").toString() + '%');
        q.setParameter("dataState", 0);

        return q.getResultList();
    }
}
