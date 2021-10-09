module service {
    requires spring.beans;
    requires lombok;
    requires spring.context;
    requires entities;
    requires dto;
    requires dao;
    requires codehelp;

    exports edu.portfolio.accountingsystem.service to api;
}