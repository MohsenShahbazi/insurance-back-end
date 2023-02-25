package ir.pt.insurance.controller;


import ir.pt.core.controller.BaseController;

import ir.pt.insurance.model.PersonnelModel;
import ir.pt.insurance.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/personnel")
public class PersonnelController extends BaseController<PersonnelModel> {
    @Autowired
    PersonnelService personnelService;


    protected PersonnelController(PersonnelService personnelService) {
        super(personnelService);
    }

}
