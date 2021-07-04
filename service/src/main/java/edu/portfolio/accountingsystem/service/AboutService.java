package edu.portfolio.accountingsystem.service;

import edu.portfolio.accountingsystem.model.About;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class AboutService {

    public About getAbout() {
        return About.get();
    }
}