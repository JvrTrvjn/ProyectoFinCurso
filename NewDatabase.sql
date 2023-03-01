CREATE DATABASE newdatabase;
USE newdatabase;
CREATE TABLE Libros (LibroID int, Titulo varchar(200),Autor varchar(200),ISBN varchar(200),Precio int);
CREATE TABLE Usuarios (UsuarioID int, DNI varchar(200), Nombre varchar(200), Apellido varchar(200), Email varchar(200));
CREATE TABLE Pedidos (LibroID int, UsuarioID int, Cantidad int);
SELECT * FROM newdatabase.Libros;
ALTER TABLE libros add primary key(LibroID);
SELECT * FROM newdatabase.Usuarios;
ALTER TABLE Usuarios add primary key(UsuarioID);
SELECT * FROM Pedidos;
ALTER TABLE Pedidos add PedidoID int;
ALTER TABLE Pedidos add primary key(PedidoID);
ALTER TABLE pedidos modify column PedidoID int auto_increment;
ALTER TABLE libros modify column LibroID int auto_increment;
ALTER TABLE Usuarios modify column UsuarioID int auto_increment;
ALTER TABLE Pedidos add foreign key(LibroID) references libros(LibroID), add foreign key(UsuarioID) references Usuarios(UsuarioID);
INSERT INTO Libros VALUES (1,'El Quijote','Miguel de Cervantes','12096754', 20);
INSERT INTO Libros VALUES (2,'El vieto nos llevará','Monica Carrillo','12096734', 17);
INSERT INTO Libros VALUES (3,'Azami','Aki Shimazaku','12096712', 15);
INSERT INTO Libros VALUES (4,'La huella de infierno','Leigh Bardugo','12096721', 18);
INSERT INTO Libros VALUES (5,'El cuco de cristal','Jvier Castillo','12096743', 21);
INSERT INTO Usuarios VALUES (1,'1','Administrador','Admin', 'javier.trevijano@outlook.com');
INSERT INTO Usuarios VALUES (2,'12345678','Juan','Campanario', 'juanito@gmail.com');
UPDATE Libros SET Titulo = 'El viento nos llevará' WHERE LibroID = 2;
UPDATE Libros SET Autor = 'Javier Castillo' WHERE LibroID = 5;















