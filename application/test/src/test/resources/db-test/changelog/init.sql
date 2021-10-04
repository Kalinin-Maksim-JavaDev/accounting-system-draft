create table VERSION
(
    ID    BIGINT not null
        primary key,
    DATE  DATE,
    TITLE VARCHAR(255)
);
INSERT INTO Version (id, date, title)
VALUES (0, '2222-01-01', 'accounting-system-test');