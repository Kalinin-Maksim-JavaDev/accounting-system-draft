create table OPERATION_ROW
(
    NUMBER      BIGINT not null,
    OPERATIONID BIGINT not null,
    primary key (NUMBER, OPERATIONID),
    constraint FKIYKNOHGAE7WDYA631HH23V3E4
        foreign key (OPERATIONID) references BASE_OPERATION (ID)
);
