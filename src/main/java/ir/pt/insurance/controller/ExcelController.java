package ir.pt.insurance.controller;


import ir.pt.core.controller.BaseController;
import ir.pt.insurance.model.DocumentModel;
import ir.pt.insurance.model.ExcelListModel;
import ir.pt.insurance.service.DocumentService;
import ir.pt.insurance.service.ExcelListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/excelFile")
public class ExcelController extends BaseController<ExcelListModel> {
    @Autowired
    ExcelListService excelListService;


    protected ExcelController(ExcelListService service) {
        super(service);
    }

}
