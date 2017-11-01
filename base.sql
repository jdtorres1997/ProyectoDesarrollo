
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



INSERT INTO usuarios (login, password, tipo, estado, telefono, nombre, apellido)
		VALUES ('admin', 'admin', 'administrador', 'activo', 3104166431, 'Juan David', 'Torres Cañon');
INSERT INTO usuarios (login, password, tipo, estado, telefono, nombre, apellido)
		VALUES ('gerente', 'gerente', 'gerente', 'activo', 3105473831, 'Juan Jose', 'Vargas Vargas');
INSERT INTO usuarios (login, password, tipo, estado, telefono, nombre, apellido)
		VALUES ('operario1', 'operario1', 'operario', 'activo', 31557748312, 'Carlos', 'Tovar Ceron');
INSERT INTO usuarios (login, password, tipo, estado, telefono, nombre, apellido)
		VALUES ('operario2', 'operario2', 'operario', 'inactivo', 31145364591, 'Alexandra', 'Lopez Obando');

