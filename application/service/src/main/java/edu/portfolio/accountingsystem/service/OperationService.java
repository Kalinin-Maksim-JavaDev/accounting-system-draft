package edu.portfolio.accountingsystem.service;

import edu.portfolio.accountingsystem.entity.operation.BaseOperation;
import edu.portfolio.accountingsystem.repository.operation.BaseOperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationService {

    @Autowired
    BaseOperationRepository repository;

    public void createOperation() {
        BaseOperation baseOperation = new BaseOperation();
        baseOperation.addRow();
        baseOperation.addRow();
        repository.save(baseOperation);
    }
}
