package edu.portfolio.accountingsystem.entity.operation;

import java.time.LocalDateTime;

public interface BaseOperation {

    BaseOperation $();

    LocalDateTime getDate();
}
