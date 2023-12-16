create table Alumno (
id_Alumno int primary key,
Nombre char(20),
Apellidos char(20),
Cedula int,
Carrera char(20)

);
 
 INSERT INTO Alumno (id_Alumno, Nombre, Apellidos, Cedula, Carrera) VALUES (1, 'Emanuel', 'Sanchez', 27875496, 'Computacion');
 select * from Alumno;
 
UPDATE Alumno SET Nombre = 'Jose', Apellidos = 'olivares' WHERE Alumno.id_Alumno = 1;

DELETE FROM Alumno WHERE Alumno.id_Alumno = 1;
 

