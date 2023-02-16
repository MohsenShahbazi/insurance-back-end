package ir.pt.insurance.controller;

import ir.pt.core.controller.BaseController;
import ir.pt.core.service.BaseService;
import ir.pt.insurance.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
public class ContractController extends BaseController {
@Autowired
    ContractService contractService;
    protected ContractController(ContractService contractService) {
        super(contractService);
    }

    @PostMapping
    public ResponseEntity findKarimi(@RequestBody Long id) {
        try {
            return this.jPresent.getResponse("");
        } catch (Exception var3) {
            return this.jPresent.getResponse(var3);
        }
    }
}
