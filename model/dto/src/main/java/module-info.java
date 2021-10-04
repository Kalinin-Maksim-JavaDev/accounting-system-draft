module dto {
    requires lombok;
    requires codehelp;

    exports edu.portfolio.accountingsystem.dto to service, api;
}