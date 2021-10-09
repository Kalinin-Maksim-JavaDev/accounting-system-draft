package edu.portfolio.accountingsystem.entity.operation;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "BaseOperation")
@Data
public class BaseOperationEntity implements BaseOperation {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;

    @OneToMany
    @JoinColumn(name = "operationID", referencedColumnName = "id")
    private List<OperationRow> operationRows;

    public LocalDateTime getDate() {
        return date;
    }

    private LocalDateTime date;

    @Override
    public BaseOperation $() {
        return this;
    }

    public void setOperationRows_(List<OperationRow> asList) {
    }
}
