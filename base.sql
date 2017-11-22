
DROP TABLE IF EXISTS usuarios CASCADE;
CREATE TABLE usuarios (
	login VARCHAR(20) PRIMARY KEY,
	password VARCHAR(20),
	tipo VARCHAR(20),
	estado VARCHAR(10),
	telefono BIGINT,
	nombre VARCHAR(20),
	apellido VARCHAR(20)
);
DROP TABLE IF EXISTS sedes CASCADE;
CREATE TABLE sedes (

	identificacion VARCHAR(20) PRIMARY KEY,
        nombre VARCHAR(20),
        informacion VARCHAR(50),
        ubicacion VARCHAR(20),
        estado VARCHAR(20)
);
DROP TABLE IF EXISTS clientes CASCADE;
CREATE TABLE clientes (

	identificacion VARCHAR(20) PRIMARY KEY,
	nombre VARCHAR(30),
	apellido VARCHAR(30),
	direccion VARCHAR(30),
	email VARCHAR(20),
	telefono BIGINT
);
DROP TABLE IF EXISTS eventos CASCADE;
CREATE TABLE eventos (

	identificacion VARCHAR(20) PRIMARY KEY,
        nombre VARCHAR(50),
        sede VARCHAR(20),
        fecha date,
        hora time,
        ubicacion VARCHAR(50),
        costo BIGINT,
        capacidad int,
        estado VARCHAR(10),
        foreign key(sede) references sedes (identificacion)
);
DROP TABLE IF EXISTS inscripciones CASCADE;
CREATE TABLE inscripciones (
	id_cliente VARCHAR(20),
	id_evento VARCHAR(20),
	pago VARCHAR(2),
	PRIMARY KEY (id_cliente, id_evento),
	FOREIGN KEY (id_cliente) REFERENCES clientes (identificacion),
	FOREIGN KEY (id_evento) REFERENCES eventos(identificacion)
);

INSERT INTO usuarios (login, password, tipo, estado, telefono, nombre, apellido)
		VALUES ('admin', 'admin', 'administrador', 'activo', 3104166431, 'Juan David', 'Torres Cañon');
INSERT INTO usuarios (login, password, tipo, estado, telefono, nombre, apellido)
		VALUES ('gerente', 'gerente', 'gerente', 'activo', 3105473831, 'Juan Jose', 'Vargas Vargas');
INSERT INTO usuarios (login, password, tipo, estado, telefono, nombre, apellido)
		VALUES ('operario1', 'operario1', 'operario', 'activo', 31557748312, 'Carlos', 'Tovar Ceron');
INSERT INTO usuarios (login, password, tipo, estado, telefono, nombre, apellido)
		VALUES ('operario2', 'operario2', 'operario', 'inactivo', 31145364591, 'Alexandra', 'Lopez Obando');

INSERT INTO sedes (identificacion, nombre, informacion, ubicacion, estado)
		VALUES ('sede1', 'Campestre', 'Sede fuera de la ciudad', 'Pance', 'activa');
INSERT INTO sedes (identificacion, nombre, informacion, ubicacion, estado)
		VALUES ('sede2', 'Principal', 'Sede principal empresa', 'Jardin plaza', 'activa');

INSERT INTO eventos (identificacion, nombre, sede, fecha, hora, ubicacion, costo, capacidad, estado)
		VALUES ('evento5', 'Color fest', 'sede2', '2017/12/24', '13:00', 'Cañasgordas', 13000, 200, 'activo');

INSERT INTO clientes (identificacion, nombre, apellido, direccion, email, telefono)
		VALUES ('1144099304', 'Jhon', 'Angulo', 'Calle 3N #4-54', 'jhonA@gmail.com', 3146691618);

INSERT INTO clientes (identificacion, nombre, apellido, direccion, email, telefono)
		VALUES ('1144099305', 'Daniela', 'Becerra', 'Calle 87 #24-64', 'DaniBK@gmail.com', 3115467422);

INSERT INTO inscripciones (id_cliente, id_evento, pago)
		VALUES ('1144099304', 'evento3', 'no');
INSERT INTO inscripciones (id_cliente, id_evento, pago)
		VALUES ('1144099305', 'evento3', 'no');