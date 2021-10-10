package edu.portfolio.accountingsystem.service;

import edu.portfolio.accountingsystem.entity.operation.BaseOperationEntity;
import edu.portfolio.accountingsystem.entity.operation.OperationRow;
import edu.portfolio.accountingsystem.repository.operation.BaseOperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class OperationService {

    @Autowired
    BaseOperationRepository repository;

    public void createOperation() {
        BaseOperationEntity baseOperation = new BaseOperationEntity();
        baseOperation.setOperationOperationRows(Arrays.asList(new OperationRow(), new OperationRow()));
        repository.save(baseOperation);
    }
}
