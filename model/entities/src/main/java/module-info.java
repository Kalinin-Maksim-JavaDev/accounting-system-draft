module entities {
    requires lombok;
    requires spring.beans;
    requires codehelp;
    requires dao;

    exports edu.portfolio.accountingsystem.model to service;
}