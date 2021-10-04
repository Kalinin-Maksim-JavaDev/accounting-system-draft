module entities {
    requires lombok;
    requires spring.beans;
    requires codehelp;

    exports edu.portfolio.accountingsystem.model to service;
}