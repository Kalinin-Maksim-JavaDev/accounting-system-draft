package edu.portfolio.accountingsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Setter
@Getter
public class Version {
    @Id
    private Long id;
    private LocalDate date;
    private String title;
}
