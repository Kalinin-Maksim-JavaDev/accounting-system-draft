package edu.portfolio.accountingsystem.entity.operation;

import edu.portfolio.accountingsystem.model.operation.AbstractOperation;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class BaseOperation implements AbstractOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @OneToMany(mappedBy = "operation", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Row> rows = new ArrayList<>();

    private LocalDateTime date;

    @Override
    public AbstractOperation $() {
        return this;
    }

    public void addRow() {
        Row row = new Row();
        row.setOperation(this);
        row.setNumber(rows.size());
        rows.add(row);
    }

    @Entity
    @Data
    private static class Row {

        @EmbeddedId
        private ID key = new ID();

        @ManyToOne
        @MapsId("operationID")
        private BaseOperation operation;

        private void setNumber(int number) {
            key.setNumber(number);
        }

        @Embeddable
        @Data
        private static class ID implements Serializable {

            private long operationID;

            private long number;

        }
    }
}
