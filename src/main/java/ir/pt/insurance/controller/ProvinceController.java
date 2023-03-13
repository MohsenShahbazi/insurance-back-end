package ir.pt.insurance.controller;

import ir.pt.core.controller.BaseController;
import ir.pt.insurance.model.CityModel;
import ir.pt.insurance.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/province")
public class ProvinceController extends  BaseController<CityModel> {
    @Autowired
    CityService cityService;

    protected ProvinceController(CityService cityService) {
        super(cityService);
    }


 /*   @PostMapping(value = "/get")
    public ResponseEntity<JPresent> select(@RequestParam("id") Long id) {
        try {
            return jPresent.getResponse(new JDataModel(service.get(id)));
        } catch (BusinessException sx) {
            return jPresent.getResponse(sx);
        } catch (Exception ex) {
            return jPresent.getResponse(ex);
        }
    }*/
}
