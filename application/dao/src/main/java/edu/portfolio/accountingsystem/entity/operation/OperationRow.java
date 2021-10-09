package edu.portfolio.accountingsystem.entity.operation;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class OperationRow {

    @EmbeddedId
    ID key;

    @ManyToOne
    @MapsId("operationID")
    @JoinColumn(name = "publisher_id")
    private BaseOperationEntity operation;

    @Embeddable
    @Data
    private static class ID implements Serializable {

        long operationID;
        @Generated
        long number;
    }
}
