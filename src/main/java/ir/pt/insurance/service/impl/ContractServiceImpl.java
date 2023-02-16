package ir.pt.insurance.service.impl;//package ir.pt.insurance.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.insurance.entity.Contract;
import ir.pt.insurance.mapper.ContractMapper;
import ir.pt.insurance.model.ContractModel;
import ir.pt.insurance.service.ContractService;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl extends BaseServiceImpl<Contract, ContractModel, ContractMapper> implements ContractService {

}
