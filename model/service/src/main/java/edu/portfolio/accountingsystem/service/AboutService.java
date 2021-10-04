package edu.portfolio.accountingsystem.service;

import edu.portfolio.accountingsystem.dto.AboutDto;
import edu.portfolio.accountingsystem.map.Mapper;
import edu.portfolio.accountingsystem.model.About;
import edu.portfolio.accountingsystem.repository.VersionRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class AboutService {

    @Autowired
    private Mapper mapper;

    @Autowired
    private VersionRepository versionRepository;

    public AboutDto getAbout() {

        return versionRepository.findLast()
                .as(mapper, About.class)
                .as(mapper, AboutDto.class);
    }
}