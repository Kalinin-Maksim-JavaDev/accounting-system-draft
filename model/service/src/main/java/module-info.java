module service {
    requires spring.beans;
    requires modelmapper;
    requires lombok;
    requires spring.context;
    requires entities;
    requires dto;
    requires dao;

    exports edu.portfolio.accountingsystem.service to api;
}