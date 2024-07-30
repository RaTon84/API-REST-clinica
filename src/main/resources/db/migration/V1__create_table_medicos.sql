create table medicos(
	id bigint not null PRIMARY key,
	nombre varchar not null,
	email varchar not null,
	documento VARCHAR not null UNIQUE,
	especialidad VARCHAR not null,
	calle VARCHAR not null,
	ciudad VARCHAR not null,
	numero VARCHAR not null
);