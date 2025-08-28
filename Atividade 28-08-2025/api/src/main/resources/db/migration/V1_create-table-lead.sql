CREATE TABLE lead(
id BIGINT NOT NULL auto_increment primary key,
nome varchar(100) not null,
email varchar(100) not null,
telefone varchar(100) not null
);

CREATE TABLE genero(
    id BIGINT NOT NULL auto_increment primary key,
    nome varchar(100) not null
);