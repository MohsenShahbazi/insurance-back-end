package ir.pt.insurance.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.insurance.entity.Document;
import ir.pt.insurance.entity.Sata;
import ir.pt.insurance.mapper.DocumentMapper;
import ir.pt.insurance.mapper.SataMapper;
import ir.pt.insurance.model.DocumentModel;
import ir.pt.insurance.model.SataModel;
import ir.pt.insurance.service.DocumentService;
import ir.pt.insurance.service.SataService;
import org.springframework.stereotype.Service;

@Service
public class SataServiceImpl extends BaseServiceImpl<Sata, SataModel, SataMapper> implements SataService {

}
