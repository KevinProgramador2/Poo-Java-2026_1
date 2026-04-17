create table cliente(
    id_cliente primary key,
    nome varchar(60) not null,
    email VARCHAR(50) NOT NULL UNIQUE
);

INSERT INTO CLIENTE(nome, email)
VALUES ('Marcos','marcos@gmail.com');