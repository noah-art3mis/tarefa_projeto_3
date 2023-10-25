drop table Clientes;

create table Clientes (
	 cpf int primary key 
	,nome varchar(50)
	,telefone int
	,endereço varchar(50)
	,numero int 
	,cidade varchar(50)
	,estado varchar(50) 
);


INSERT INTO Clientes (nome, cpf, telefone, endereço, numero, cidade, estado)
VALUES ('Freya', '123', '1111111111', 'Rua A', '302', 'Brasilia', 'DF');

INSERT INTO Clientes (nome, cpf, telefone, endereço, numero, cidade, estado)
VALUES ('Shiffman', '456', '2222222222', 'Rua A', '302', 'Brasilia', 'DF');

INSERT INTO Clientes (nome, cpf, telefone, endereço, numero, cidade, estado)
VALUES ('Alice', '789', '3333333333', 'Rua B', '303', 'Brasilia', 'DF');

INSERT INTO Clientes (nome, cpf, telefone, endereço, numero, cidade, estado)
VALUES ('Bob', '101', '4444444444', 'Rua C', '304', 'Brasilia', 'DF');

INSERT INTO Clientes (nome, cpf, telefone, endereço, numero, cidade, estado)
VALUES ('Charlie', '202', '5555555555', 'Rua D', '305', 'Brasilia', 'DF');

INSERT INTO Clientes (nome, cpf, telefone, endereço, numero, cidade, estado)
VALUES ('David', '303', '6666666666', 'Rua E', '306', 'Brasilia', 'DF');

INSERT INTO Clientes (nome, cpf, telefone, endereço, numero, cidade, estado)
VALUES ('Eva', '404', '7777777777', 'Rua F', '307', 'Brasilia', 'DF');

INSERT INTO Clientes (nome, cpf, telefone, endereço, numero, cidade, estado)
VALUES ('Frank', '505', '8888888888', 'Rua G', '308', 'Brasilia', 'DF');

INSERT INTO Clientes (nome, cpf, telefone, endereço, numero, cidade, estado)
VALUES ('Grace', '606', '9999999999', 'Rua H', '309', 'Brasilia', 'DF');

INSERT INTO Clientes (nome, cpf, telefone, endereço, numero, cidade, estado)
VALUES ('Hugo', '707', '1010101010', 'Rua I', '310', 'Brasilia', 'DF');

select * from Clientes;