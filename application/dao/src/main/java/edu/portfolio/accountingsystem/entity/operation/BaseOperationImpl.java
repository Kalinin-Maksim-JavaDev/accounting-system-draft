package edu.portfolio.accountingsystem.entity.operation;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "BaseOperation")
@Data

public class BaseOperationImpl implements BaseOperation {
    @Id
    private Long id;

    private LocalDateTime date;

    @Override
    public BaseOperation $() {
        return this;
    }
}
