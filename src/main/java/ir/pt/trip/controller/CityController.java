package ir.pt.trip.controller;

import ir.pt.core.BusinessException;
import ir.pt.core.JPresent;
import ir.pt.core.controller.BaseController;
import ir.pt.core.model.JDataModel;
import ir.pt.core.service.BaseService;
import ir.pt.trip.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/city")
public class CityController extends BaseController {
    protected CityController(CityService service,CityService service1) {
        super(service);
    }
}
