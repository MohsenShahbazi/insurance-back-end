package ir.pt.insurance.controller;

import ir.pt.core.controller.BaseController;
import ir.pt.insurance.model.CityModel;
import ir.pt.insurance.service.CityService;
import ir.pt.insurance.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "/city")
public class CityController extends  BaseController<CityModel> {
    @Autowired
    CityService cityService;

    protected CityController(CityService cityService) {
        super(cityService);
    }
}
