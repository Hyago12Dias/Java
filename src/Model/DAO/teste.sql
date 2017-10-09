CREATE TABLE IF NOT EXISTS Classe
(
    ID serial primary key not null unique,
    Nome char (20),
    Descricao char(100),
    Tipo char (10),
    AtributoAgilidade double precision not null,
    AtributoForca double precision not null,
    AtributoInteligencia double precision not null
);

INSERT INTO Classe(
Nome,
Descricao,
Tipo ,
AtributoAgilidade,
AtributoForca,
AtributoInteligencia )
Values ('Teste', 'asd', 'Range', 10.1, 7.2, 5.3);