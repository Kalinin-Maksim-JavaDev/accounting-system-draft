package edu.portfolio.accountingsystem.controller;

import edu.portfolio.accountingsystem.service.AboutService;
import edu.portfolio.accountingsystem.view.AboutView;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("about")
public class AboutController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AboutService aboutService;

    @GetMapping(value = "", produces = "application/json")
    public AboutView about() {
        return modelMapper.map(aboutService.getAbout(), AboutView.class);
    }
}
