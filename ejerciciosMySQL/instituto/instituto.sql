CREATE DATABASE IF NOT EXISTS instituto;
USE instituto;

CREATE TABLE IF NOT EXISTS nivel
(
nivel varchar(20) primary key
);

CREATE TABLE IF NOT EXISTS grupo
(
nivel varchar(20),
grupo char(1),
total tinyint not null
);

CREATE TABLE IF NOT EXISTS profesorado
(
dni varchar(12) primary key,
nombre varchar(30),
ape1 varchar(30),
ape2 varchar(30),
especialidad varchar(30)
);

CREATE TABLE IF NOT EXISTS asignatura
(
nivel varchar(20),
grupo char(1),
asignatura varchar(25),
dni_profe varchar(12) not null,
horas tinyint unsigned not null
);

CREATE TABLE IF NOT EXISTS estudiante
(
matricula smallint primary key auto_increment,
dni varchar(12) unique not null,
nombre varchar(30) not null,
ape1 varchar(30) not null,
ape2 varchar(30) not null,
fecha_nac date not null
);

CREATE TABLE IF NOT EXISTS aula
(
aula varchar(30) primary key,
capacidad smallint unsigned not null
);

CREATE TABLE IF NOT EXISTS cursa
(
nivel varchar(20),
grupo char(1),
asignatura varchar(25),
matricula smallint
);

CREATE TABLE IF NOT EXISTS se_imparte
(
nivel varchar(20),
grupo char(1),
asignatura varchar(25),
dia char(1),
hora time,
aula varchar(30)
);

-- Tabla de grupo

ALTER TABLE grupo ADD CONSTRAINT pk_grupo
PRIMARY KEY(nivel, grupo);

ALTER TABLE grupo ADD CONSTRAINT fk_grupo_nivel 
FOREIGN KEY(nivel) 
REFERENCES nivel(nivel) 
ON UPDATE CASCADE
ON DELETE CASCADE;

ALTER TABLE grupo ADD CONSTRAINT ck_grupo CHECK(total>0);

-- Tabla de asignatura

ALTER TABLE asignatura ADD CONSTRAINT pk_asignatura
PRIMARY KEY(nivel, grupo, asignatura);

ALTER TABLE asignatura ADD CONSTRAINT fk_asignatura_grupo
FOREIGN KEY(nivel, grupo)
REFERENCES grupo(nivel, grupo)
ON UPDATE CASCADE
ON DELETE CASCADE;

ALTER TABLE asignatura ADD CONSTRAINT fk_asignatura_profesorado
FOREIGN KEY(dni_profe)
REFERENCES profesorado(dni);

-- Tabla cursa

ALTER TABLE cursa ADD CONSTRAINT pk_cursa
PRIMARY KEY(nivel, grupo, asignatura, matricula);

ALTER TABLE cursa ADD CONSTRAINT fk_cursa_asignatura
FOREIGN KEY(nivel, grupo, asignatura)
REFERENCES asignatura(nivel, grupo, asignatura)
ON UPDATE CASCADE
ON DELETE CASCADE;

ALTER TABLE cursa ADD CONSTRAINT fk_cursa_estudiante
FOREIGN KEY(matricula)
REFERENCES estudiante(matricula);

-- Tabla se_imparte

ALTER TABLE se_imparte ADD CONSTRAINT pk_se_imparte
PRIMARY KEY(nivel, grupo, asignatura, dia, hora, aula);

ALTER TABLE se_imparte ADD CONSTRAINT fk_se_imparte_asignatura
FOREIGN KEY(nivel, grupo, asignatura)
REFERENCES asignatura(nivel, grupo, asignatura)
ON UPDATE CASCADE
ON DELETE CASCADE;

ALTER TABLE se_imparte ADD CONSTRAINT fk_se_imparte_aula
FOREIGN KEY(aula)
REFERENCES aula(aula);

ALTER TABLE se_imparte ADD CONSTRAINT ck_dia CHECK(dia IN('L','M','X','J','V'));

ALTER TABLE se_imparte ADD CONSTRAINT ck_hora CHECK(hora IN('8:30','9:25','10:20','11:40','12:30','13:25'));

-- Crear usuario 'tutor' con contraseña tutor que se conecte desde cualquier IP

CREATE USER 'tutor'@'%' IDENTIFIED BY 'tutor';

-- Le damos todos los privilegios sobre todos los objetos de la base de datos 'instituto'

GRANT ALL ON instituto.* TO 'tutor'@'%';

-- Cambiar nombre al usuario 'tutor' para ponerle nuestro nombre (Javier) (RENAME USER)

RENAME USER 'tutor'@'%' TO 'javier'@'%';
