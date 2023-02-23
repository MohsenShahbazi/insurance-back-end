package ir.pt.insurance.controller;


import ir.pt.core.controller.BaseController;
import ir.pt.insurance.model.SataModel;
import ir.pt.insurance.model.SentDocumentListModel;
import ir.pt.insurance.service.SataService;
import ir.pt.insurance.service.SentDocumentListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sentDocument")
public class SentDocumentController extends BaseController<SentDocumentListModel> {
    @Autowired
    SentDocumentListService sentDocumentListService;


    protected SentDocumentController(SentDocumentListService service) {
        super(service);
    }

}
