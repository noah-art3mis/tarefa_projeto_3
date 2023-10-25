--
create table Clientes (
	 id_cliente serial primary key
	,cpf bigint unique
	,nome varchar(50)
);

INSERT INTO Clientes (cpf, nome)
VALUES (12345678901, 'Alice Johnson');

INSERT INTO Clientes (cpf, nome)
VALUES (23456789012, 'Bob Smith');

INSERT INTO Clientes (cpf, nome)
VALUES (34567890123, 'Charlie Brown');

INSERT INTO Clientes (cpf, nome)
VALUES (45678901234, 'David Lee');

INSERT INTO Clientes (cpf, nome)
VALUES (56789012345, 'Eva Davis');

INSERT INTO Clientes (cpf, nome)
VALUES (67890123456, 'Frank Wilson');

INSERT INTO Clientes (cpf, nome)
VALUES (78901234567, 'Grace Taylor');

INSERT INTO Clientes (cpf, nome)
VALUES (89012345678, 'Hugo Martinez');

INSERT INTO Clientes (cpf, nome)
VALUES (90123456789, 'Isabella Garcia');

INSERT INTO Clientes (cpf, nome)
VALUES (12345678900, 'John Anderson');

--
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

--
CREATE TABLE Vendas (
    id_venda SERIAL PRIMARY KEY,
    cliente INT REFERENCES Clientes(id_cliente),
    produto INT REFERENCES Produtos(id_produto),
	hora TIMESTAMP
);

INSERT INTO Vendas (cliente, produto, hora)
VALUES (1, 3, NOW());

INSERT INTO Vendas (cliente, produto, hora)
VALUES (2, 2, NOW());

INSERT INTO Vendas (cliente, produto, hora)
VALUES (3, 1, NOW());
