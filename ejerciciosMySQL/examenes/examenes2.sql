CREATE DATABASE IF NOT EXISTS examenes;
USE examenes;

-- Creamos las tablas

CREATE TABLE IF NOT EXISTS estudiante 
(
matricula smallint primary key auto_increment,
dni varchar(9) unique not null,
nombre varchar(45) not null,
ape1 varchar(45) not null,
ape2 varchar(45) not null,
fecha date not null
);

CREATE TABLE IF NOT EXISTS examen
(
matricula smallint,
modulo varchar(30),
trimestre enum('1','2','3'),
nota decimal(4,2) not null
);

CREATE USER IF NOT EXISTS examen IDENTIFIED BY 'examen';
GRANT ALL ON examenes.* to examen;
FLUSH PRIVILEGES;

ALTER TABLE examen ADD CONSTRAINT pk_examen
PRIMARY KEY(matricula,modulo,trimestre);

ALTER TABLE examen ADD CONSTRAINT fk_examen_estudiante
FOREIGN KEY(matricula) 
REFERENCES estudiante(matricula)
ON UPDATE CASCADE
