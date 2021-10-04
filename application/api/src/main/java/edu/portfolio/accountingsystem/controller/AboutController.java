package edu.portfolio.accountingsystem.controller;

import edu.portfolio.accountingsystem.map.Mapper;
import edu.portfolio.accountingsystem.service.AboutService;
import edu.portfolio.accountingsystem.view.AboutView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("about")
public class AboutController {

    @Autowired
    private Mapper mapper;

    @Autowired
    private AboutService aboutService;

    @GetMapping(value = "", produces = "application/json")
    public AboutView about() {
        return aboutService.getAbout().as(mapper, AboutView.class);
    }
}
