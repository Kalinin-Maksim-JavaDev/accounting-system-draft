package edu.portfolio.accountingsystem.entity.operation;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class OperationRow {

    @EmbeddedId
    private ID key = new ID();

    @ManyToOne
    @MapsId("operationID")
    private BaseOperationEntity operation;

    @Embeddable
    @Data
    static class ID implements Serializable {

        private long operationID;
        private long number;

        public void setNumber(long number) {
            this.number = number;
        }
    }

    public void setOperation(BaseOperationEntity operation) {
        this.operation = operation;
    }
}
