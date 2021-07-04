package edu.portfolio.accountingsystem.service;

import edu.portfolio.accountingsystem.dto.AboutDto;
import edu.portfolio.accountingsystem.model.About;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class AboutService {

    public AboutDto getAbout() {
        return AboutDto.builder()
                .title(About.get().getTitle())
                .build();
    }
}