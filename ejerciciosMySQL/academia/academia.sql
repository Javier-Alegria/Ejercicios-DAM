drop database if exists academia;
create database academia;
use academia;

-- TABLAS

drop table if exists curso;
create table curso
(
cod_curso integer primary key auto_increment,
curso varchar(30) unique not null,
horas integer not null
);

drop table if exists estudiante;
create table estudiante
(
matricula integer primary key auto_increment,
dni varchar(9) unique not null,
nombre varchar(15) not null,
ape1 varchar(15) not null,
ape2 varchar(15) not null,
fecha date not null,
mail varchar(45) unique not null,
cod_curso integer not null,
modalidad varchar(15),
precio_p decimal(6,2),
precio_ad decimal(6,2),
usuario varchar(15),
contrasenia varchar(15),

constraint fk_estudiante_curso
foreign key(cod_curso)
references curso(cod_curso),

constraint ck_modalidad_precio_p_precio_ad_usuario_contraseña
check((modalidad='presencial' and precio_p is not null and precio_ad is null and usuario is null and contrasenia is null) or 
(modalidad='a distancia' and precio_p is null and precio_ad is not null and usuario is not null and contrasenia is not null))
);

drop table if exists representa;
create table representa
(
mat_representado integer,
mat_representa integer,

constraint fk_representa_estudiante
foreign key(mat_representa)
references estudiante(matricula)
);

insert into curso (curso,horas) values ('gestión de base de datos',200);

select * from curso;

insert into estudiante (dni,nombre,ape1,ape2,fecha,mail,cod_curso,modalidad,precio_p) values
('99999999J','Javier','Alegria','Sobrados','2000-02-12','mailJavier@gmail.com',1,'presencial',1205.99);

insert into estudiante (dni,nombre,ape1,ape2,fecha,mail,cod_curso,modalidad,precio_ad,usuario,contrasenia) values
('44444444M','Miguel','Gonzalez','Lopez','2000-07-12','mailMiguel@gmail.com',1,'a distancia',1180.95,'miguel','miguel1234');

select * from estudiante;