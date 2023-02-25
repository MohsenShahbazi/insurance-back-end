package ir.pt.insurance.controller;

import ir.pt.core.controller.BaseController;
import ir.pt.insurance.model.ContractModel;
import ir.pt.insurance.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/contract")
public class ContractController extends BaseController<ContractModel> {
    @Autowired
    ContractService contractService;

    protected ContractController(ContractService contractService) {
        super(contractService);
    }
}
