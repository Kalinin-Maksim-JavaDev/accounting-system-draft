module dao {
    exports edu.portfolio.accountingsystem.entity.operation;
    exports edu.portfolio.accountingsystem.repository;
    exports edu.portfolio.accountingsystem.repository.operation;
    exports edu.portfolio.accountingsystem.entity;
    requires spring.data.jpa;
    requires spring.data.commons;
    requires java.persistence;
    requires codehelp;
    requires lombok;

}