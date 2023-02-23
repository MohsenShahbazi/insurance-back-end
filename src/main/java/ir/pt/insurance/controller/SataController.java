package ir.pt.insurance.controller;


import ir.pt.core.controller.BaseController;
import ir.pt.insurance.model.DocumentModel;
import ir.pt.insurance.model.SataModel;
import ir.pt.insurance.service.DocumentService;
import ir.pt.insurance.service.SataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sata")
public class SataController extends BaseController<SataModel> {
    @Autowired
    SataService sataService;


    protected SataController(SataService service) {
        super(service);
    }

}
