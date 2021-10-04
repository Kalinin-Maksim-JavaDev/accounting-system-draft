package edu.portfolio.accountingsystem.entity;

import edu.portfolio.accountingsystem.map.Convertible;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Version implements Convertible {
    @Id
    private Long id;
    private LocalDate date;
    public String title;
}
