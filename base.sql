DROP TABLE IF EXISTS usuarios CASCADE;
CREATE TABLE usuarios (
	login VARCHAR(100) PRIMARY KEY,
	password VARCHAR(100),
	tipo VARCHAR(100),
	estado VARCHAR(100),
	telefono BIGINT,
	nombre VARCHAR(100),
	apellido VARCHAR(100)
); 
DROP TABLE IF EXISTS sedes CASCADE;
CREATE TABLE sedes (

	identificacion VARCHAR(100) PRIMARY KEY,
        nombre VARCHAR(100),
        informacion VARCHAR(100),
        ubicacion VARCHAR(100),
        estado VARCHAR(100)
);
DROP TABLE IF EXISTS clientes CASCADE;
CREATE TABLE clientes (

	identificacion VARCHAR(100) PRIMARY KEY,
	nombre VARCHAR(100),
	apellido VARCHAR(100),
	direccion VARCHAR(100),
	email VARCHAR(100),
	telefono BIGINT
);
DROP TABLE IF EXISTS eventos CASCADE;
CREATE TABLE eventos (

	identificacion VARCHAR(100) PRIMARY KEY,
        nombre VARCHAR(100),
        sede VARCHAR(100),
        fecha date,
        hora time,
        ubicacion VARCHAR(100),
        costo BIGINT,
        capacidad int,
        estado VARCHAR(100),
        foreign key(sede) references sedes (identificacion)
);
DROP TABLE IF EXISTS inscripciones CASCADE;
CREATE TABLE inscripciones (
	id_cliente VARCHAR(100),
	id_evento VARCHAR(100),
	pago VARCHAR(10),
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
INSERT INTO clientes (identificacion, nombre, apellido, direccion, email, telefono)
		VALUES ('1144099304', 'Jhon', 'Angulo', 'Calle 3N #4-54', 'jhonA@gmail.com', 3146691618);

INSERT INTO clientes (identificacion, nombre, apellido, direccion, email, telefono)
		VALUES ('1144099305', 'Daniela', 'Becerra', 'Calle 87 #24-64', 'DaniBK@gmail.com', 3115467422);
INSERT INTO clientes (identificacion, nombre, apellido, direccion, email, telefono)
		VALUES ('1107512569', 'Alexandra', 'lopez', 'Calle 27 #19-112', 'alexa@gmail.com', 3217458938);


INSERT INTO sedes (identificacion, nombre, informacion, ubicacion, estado)
		VALUES ('sede1', 'Campestre', 'Sede fuera de la ciudad', 'Pance', 'activa');
INSERT INTO sedes (identificacion, nombre, informacion, ubicacion, estado)
		VALUES ('sede2', 'Principal', 'Sede principal empresa', 'Jardin plaza', 'activa');

INSERT INTO eventos (identificacion, nombre, sede, fecha, hora, ubicacion, costo, capacidad, estado)
		VALUES ('evento5', 'Color fest', 'sede2', '2017/12/24', '13:00', 'Cañasgordas', 13000, 200, 'activo');
INSERT INTO eventos (identificacion, nombre, sede, fecha, hora, ubicacion, costo, capacidad, estado)
		VALUES ('evento3', 'fest', 'sede1', '2017/12/24', '14:00', 'centro', 16000, 2, 'activo');


INSERT INTO inscripciones (id_cliente, id_evento, pago)
		VALUES ('1144099304', 'evento3', 'no');
 INSERT INTO inscripciones (id_cliente, id_evento, pago)
		VALUES ('1107512569', 'evento5', 'no');

ALTER TABLE inscripciones ADD fecha_preinscripcion DATE;
ALTER TABLE inscripciones ADD fecha_pago DATE;
 
