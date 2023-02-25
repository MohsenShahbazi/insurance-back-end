package ir.pt.insurance.controller;

import ir.pt.core.BusinessException;
import ir.pt.core.JPresent;
import ir.pt.core.controller.BaseController;
import ir.pt.core.model.JDataModel;
import ir.pt.insurance.model.CityModel;
import ir.pt.insurance.model.FilterModel;
import ir.pt.insurance.service.CityService;
import ir.pt.insurance.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "/city")
public class CityController extends  BaseController<CityModel> {
    @Autowired
    CityService cityService;

    protected CityController(CityService cityService) {
        super(cityService);
    }


    @PostMapping(value = "/get")
    public ResponseEntity<JPresent> select(@RequestParam("id") Long id) {
        try {
            return jPresent.getResponse(new JDataModel(service.get(id)));
        } catch (BusinessException sx) {
            return jPresent.getResponse(sx);
        } catch (Exception ex) {
            return jPresent.getResponse(ex);
        }
    }
}
