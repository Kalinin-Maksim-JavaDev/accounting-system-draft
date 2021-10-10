package edu.portfolio.accountingsystem.entity.operation;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity(name = "BaseOperation")
public class BaseOperationEntity implements BaseOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @OneToMany(mappedBy = "key", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OperationRow> operationRows;

    public LocalDateTime getDate() {
        return date;
    }

    private LocalDateTime date;

    @Override
    public BaseOperation $() {
        return this;
    }

    public void setOperationOperationRows(List<OperationRow> operationRows) {
        this.operationRows = operationRows;
    }
}
