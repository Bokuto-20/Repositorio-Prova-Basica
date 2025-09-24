CREATE TABLE operador (
    id bigint primary Key auto_increment,
    name varchar(255) not null,
    email varchar(255) not null unique,
    password varchar(255) not null
    setor varchar(255) not null
)