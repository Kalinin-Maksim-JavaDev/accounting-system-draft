create table VERSION
(
    ID    BIGINT not null
        primary key,
    DATE  DATE,
    TITLE VARCHAR(255)
);

INSERT INTO VERSION (ID, DATE, TITLE) VALUES (1, '2021-07-06', 'accounting-system0');
INSERT INTO VERSION (ID, DATE, TITLE) VALUES (2, '2021-07-09', 'accounting-system');