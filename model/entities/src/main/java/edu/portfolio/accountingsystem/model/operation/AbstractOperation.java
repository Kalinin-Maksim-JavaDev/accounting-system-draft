package edu.portfolio.accountingsystem.model.operation;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public interface AbstractOperation {

    AbstractOperation $();

    LocalDateTime getDate();

    default DayOfWeek getDayOfWeek() {
        return $().getDate().getDayOfWeek();
    }
}
