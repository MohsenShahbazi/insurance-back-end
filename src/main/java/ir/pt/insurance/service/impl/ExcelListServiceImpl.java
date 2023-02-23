package ir.pt.insurance.service.impl;
import ir.pt.core.service.BaseServiceImpl;
import ir.pt.insurance.entity.ExcelList;
import ir.pt.insurance.mapper.ExcelListMapper;
import ir.pt.insurance.model.ExcelListModel;
import ir.pt.insurance.service.ExcelListService;
import org.springframework.stereotype.Service;

@Service
public class ExcelListServiceImpl extends BaseServiceImpl<ExcelList, ExcelListModel, ExcelListMapper> implements ExcelListService {

}
