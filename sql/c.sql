drop table Clientes;

create table Clientes (
	 id_cliente serial primary key
	,cpf bigint unique
	,nome varchar(50)
);

-- Insert Clientes
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

select * from Clientes;