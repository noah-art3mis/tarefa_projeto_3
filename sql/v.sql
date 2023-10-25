CREATE TABLE Vendas (
    id_venda SERIAL PRIMARY KEY,
    cliente INT REFERENCES Clientes(cpf),
    produto INT REFERENCES Produtos(id_produto),
	hora TIMESTAMP
);

INSERT INTO Vendas (cliente, produto, hora)
VALUES (123, 3, NOW());

INSERT INTO Vendas (cliente, produto, hora)
VALUES (456, 2, NOW());

INSERT INTO Vendas (cliente, produto, hora)
VALUES (789, 1, NOW());

select * from Vendas;