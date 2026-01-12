create database if not exists ajedrez;
use ajedrez;

create table if not exists hotel
(
id_hotel integer unsigned primary key auto_increment,
hotel varchar(30) unique not null,
direccion varchar(30) not null,
telefono varchar(12) not null
);

create table if not exists pais
(
id_pais integer unsigned primary key auto_increment,
nombre varchar(30) unique not null
);

create table if not exists participante
(
id_socio integer unsigned primary key auto_increment,
dni varchar(12) unique not null,
nombre varchar(30) not null,
ape1 varchar(30) not null,
ap2 varchar(30) not null,
tipo varchar(15) not null,
nivel varchar(30),
colegio varchar(30),
pais integer unsigned not null,

constraint ck_tipo_colegio_nivel check((tipo='jugador' and colegio is null and nivel is not null) or 
(tipo='árbitro' and colegio is not null and nivel is null)),

constraint fk_participante_pais
foreign key(pais)
references pais(id_pais)
);

create table if not exists aloja
(
id_hotel integer unsigned,
id_socio integer unsigned,
fecha_e date,
fecha_s date,
constraint pk_aloja
primary key(id_hotel,id_socio,fecha_e,fecha_s),
constraint fk_aloja_hotel
foreign key(id_hotel)
references hotel(id_hotel),
constraint fk_aloja_participante
foreign key(id_socio)
references participante(id_socio),
constraint ck_fecha_e_fecha_s check(fecha_s > fecha_e)
);