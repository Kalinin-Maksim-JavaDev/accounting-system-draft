package edu.portfolio.accountingsystem.dto;

import edu.portfolio.accountingsystem.map.Convertible;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AboutDto implements Convertible {

    public String title;
}
