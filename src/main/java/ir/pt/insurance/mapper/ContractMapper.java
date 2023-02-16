package ir.pt.insurance.mapper;//package ir.pt.insurance.mapper;

import ir.pt.core.mapper.BaseMapper;

import ir.pt.insurance.entity.Contract;

import ir.pt.insurance.model.ContractModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContractMapper extends BaseMapper<Contract, ContractModel> {
}
