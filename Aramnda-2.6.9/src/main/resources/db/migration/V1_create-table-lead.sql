CREATE TABLE tblead(
   id BIGINT NOT NULL auto_increment,
   nome VARCHAR(100) NOT NULL,   
   email VARCHAR(100) NOT NULL UNIQUE,
   telefone VARCHAR(100) NOT NULL UNIQUE,   
   PRIMARY KEY(id)
);