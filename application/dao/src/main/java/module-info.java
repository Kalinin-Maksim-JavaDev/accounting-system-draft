module dao {
    requires spring.data.jpa;
    requires spring.data.commons;
    requires java.persistence;
    requires lombok;

    exports edu.portfolio.accountingsystem.repository to service;
}