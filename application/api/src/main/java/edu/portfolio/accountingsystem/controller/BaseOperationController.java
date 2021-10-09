package edu.portfolio.accountingsystem.controller;

import edu.portfolio.accountingsystem.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/operation")
public class BaseOperationController {

    @Autowired
    OperationService service;

    @GetMapping(value = "genOperation", produces = "application/json")
    public String genOperation() {
        service.createOperation();
        return "OK";
    }
}
