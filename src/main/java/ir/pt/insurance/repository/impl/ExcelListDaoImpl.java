package ir.pt.insurance.repository.impl;


import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.insurance.entity.ExcelList;
import ir.pt.insurance.entity.Sata;
import ir.pt.insurance.model.FilterModel;
import ir.pt.insurance.repository.ExcelListDao;
import ir.pt.insurance.repository.SataDao;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;


@Repository
public class ExcelListDaoImpl extends BaseDAOImpl<ExcelList> implements ExcelListDao {

    @Override
    public List<ExcelList> getList(FilterModel filter) {
        StringBuilder queryString = new StringBuilder("FROM ExcelList c WHERE c.name LIKE :name and c.dataState=:dataState ");

        Query q = getEm().createQuery(queryString.toString());
        q.setParameter("name", '%' + filter.getFilter().get("name").toString() + '%');
        q.setParameter("dataState", 0);

        return q.getResultList();
    }
}
