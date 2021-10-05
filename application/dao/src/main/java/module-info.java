module dao {
    requires spring.data.jpa;
    requires spring.data.commons;
    requires java.persistence;
    requires codehelp;
    requires lombok;

    exports edu.portfolio.accountingsystem.entity to service;
    exports edu.portfolio.accountingsystem.repository to service;
    exports edu.portfolio.accountingsystem.entity.operation;
}