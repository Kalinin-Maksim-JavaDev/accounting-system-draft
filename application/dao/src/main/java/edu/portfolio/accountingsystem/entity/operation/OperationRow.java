package edu.portfolio.accountingsystem.entity.operation;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
public class OperationRow {

    @EmbeddedId
    ID key=new ID();

    @Embeddable
    @Data
    private static class ID implements Serializable {

        long operationID;
    }
}
