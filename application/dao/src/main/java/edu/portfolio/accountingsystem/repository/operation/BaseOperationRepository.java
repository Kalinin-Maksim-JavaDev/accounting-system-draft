package edu.portfolio.accountingsystem.repository.operation;

import edu.portfolio.accountingsystem.entity.operation.BaseOperationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseOperationRepository extends JpaRepository<BaseOperationEntity, Long> {


}
