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

select * from Vendas;