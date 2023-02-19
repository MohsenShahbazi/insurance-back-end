package ir.pt.insurance.controller;


import ir.pt.core.controller.BaseController;
import ir.pt.core.service.BaseService;
import ir.pt.insurance.model.DocumentModel;
import ir.pt.insurance.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ir.pt.core.BusinessException;
import ir.pt.core.JPresent;
import ir.pt.core.model.JDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/document")
public class DocumentController extends BaseController<DocumentModel> {
    @Autowired
    DocumentService documentService;


    protected DocumentController(DocumentService service) {
        super(service);
    }

}
