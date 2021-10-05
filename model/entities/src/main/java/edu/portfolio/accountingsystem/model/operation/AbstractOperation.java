package edu.portfolio.accountingsystem.model.operation;

import edu.portfolio.accountingsystem.entity.operation.BaseOperation;

import java.time.DayOfWeek;

public interface AbstractOperation extends BaseOperation {

    default DayOfWeek getDayOfWeek() {
        return $().getDate().getDayOfWeek();
    }
}
