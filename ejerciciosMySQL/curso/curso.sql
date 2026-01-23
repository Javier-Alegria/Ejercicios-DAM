drop database if exists curso;
create database curso;
use curso;

-- TABLAS

drop table if exists estudiante;
create table estudiante
(
matricula integer primary key,
dni varchar(9) unique not null,
nombre varchar(20) not null,
apellidos varchar(35) not null,
fecha date not null
);

drop table if exists examen;
create table examen
(
matricula integer,
modulo varchar(30),
trimestre enum('1','2','3'),
nota decimal(4,2) not null,

constraint pk_examen
primary key(matricula,modulo,trimestre),
constraint fk_examen_estudiante
foreign key(matricula)
references estudiante(matricula)
on update cascade
on delete cascade,
constraint ck_nota check(nota>=0 and nota<=10)
);

DROP ROLE IF EXISTS tutor;
CREATE ROLE tutor;
GRANT all ON curso.* TO tutor;
GRANT create user ON *.* TO tutor;
GRANT grant option ON *.* TO tutor;

DROP ROLE IF EXISTS profesor;
CREATE ROLE profesor;
GRANT all ON curso.examen TO profesor;
GRANT SELECT ON curso.estudiante TO profesor;

DROP USER IF EXISTS us1;
CREATE USER us1 IDENTIFIED BY 'us1';
GRANT tutor TO us1;
SET DEFAULT ROLE tutor TO us1;

DROP USER IF EXISTS us2;
CREATE USER us2 IDENTIFIED BY 'us2';
GRANT profesor TO us2;
SET DEFAULT ROLE profesor TO us2;
FLUSH PRIVILEGES;