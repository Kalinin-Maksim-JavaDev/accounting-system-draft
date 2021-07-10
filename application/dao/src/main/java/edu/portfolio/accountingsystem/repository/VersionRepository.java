package edu.portfolio.accountingsystem.repository;

import edu.portfolio.accountingsystem.entity.Version;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface VersionRepository extends JpaRepository<Version, Long> {

    @Query("select v from Version v order by v.date desc")
    Optional<Version> findLast(PageRequest page);

    default Version findLast(){
        return findLast(PageRequest.of(0,1)).get();
    }
}
