
drop table Produtos;

create table Produtos (
	 id_produto serial primary key
	,nome varchar(50) not null
	,preço real not null
);

INSERT INTO Produtos (nome, preço)
VALUES ('Produto A', 19.99);

INSERT INTO Produtos (nome, preço)
VALUES ('Produto B', 29.99);

INSERT INTO Produtos (nome, preço)
VALUES ('Produto C', 14.95);

INSERT INTO Produtos (nome, preço)
VALUES ('Produto D', 9.99);

INSERT INTO Produtos (nome, preço)
VALUES ('Produto E', 39.99);

select * from Produtos;