package edu.portfolio.accountingsystem.entity.operation;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class OperationRow {

    @EmbeddedId
    ID key=new ID();

    @ManyToOne
    @MapsId("operationID")
    private BaseOperationEntity operation;

    @Embeddable
    @Data
    private static class ID implements Serializable {

        long operationID;
    }
}
