SELECT * FROM Pedidos;
ALTER TABLE Pedidos add foreign key(LibroID) references libros(LibroID), add foreign key(UsuarioID) references Usuarios(UsuarioID);






