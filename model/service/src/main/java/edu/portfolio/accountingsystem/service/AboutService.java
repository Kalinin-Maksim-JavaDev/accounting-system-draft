package edu.portfolio.accountingsystem.service;

import edu.portfolio.accountingsystem.model.About;
import edu.portfolio.accountingsystem.repository.VersionRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.portfolio.accountingsystem.dto.AboutDto;

@Service
@Data
public class AboutService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private VersionRepository versionRepository;

    public AboutDto getAbout() {
        return modelMapper.map(modelMapper.map(versionRepository.findLast(), About.class), AboutDto.class);
    }
}