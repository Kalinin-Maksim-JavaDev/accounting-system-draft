package edu.portfolio.accountingsystem.model;

import lombok.Data;

@Data
public class About {
    private String title = "accounting-system";

    public static About get() {
        return new About();
    }
}
