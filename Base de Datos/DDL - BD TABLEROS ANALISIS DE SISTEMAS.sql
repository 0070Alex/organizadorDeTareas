create table bd_tablero.bd_tablero (
	codigo_tablero serial not null,
	nombre_tablero varchar(100) null,
	descripcion varchar(100) null,
	usuario_asignacion  varchar(12) null,
	es_publico varchar(100) null,
	estado varchar(1) null,
	CONSTRAINT codigo_tablero_pKey PRIMARY KEY (codigo_tablero)
);

create table bd_tablero.bd_lista_tarea (
	codigo_lista serial not null,
	codigo_tablero int4 null,
	nombre_lista varchar(125) null,
	fecha_creacion timestamp not null,
	usuario_adiciono varchar(12) null,
	estado varchar(1) null,
	CONSTRAINT codigo_lista_pKey PRIMARY KEY (codigo_lista),
	CONSTRAINT codigo_tablero_fKey FOREIGN KEY (codigo_tablero) REFERENCES bd_tablero.bd_tablero(codigo_tablero)
);

create table bd_tablero.bd_tarea (
	codigo_tarea serial not null,
	codigo_lista int4 null,
	nombre_tarea varchar(125) null,
	descripcion varchar(100) null,
	fecha_creacion timestamp not null,
	fecha_inicio timestamp not null,
	fecha_fin timestamp not null,
	usuario_adiciono varchar(12) null,
	estado varchar(1) null,
	CONSTRAINT codigo_tarea_pKey PRIMARY KEY (codigo_tarea),
	CONSTRAINT codigo_lista_fKey FOREIGN KEY (codigo_lista) REFERENCES bd_tablero.bd_lista_tarea(codigo_lista)
);

create table bd_tablero.bd_etiqueta (
	codigo_etiqueta serial not null,
	codigo_tablero int4 not null,
	nombre_etiqueta varchar(125) null,
	descripcion varchar(125) null,
	fecha_creacion timestamp not null,
	usuario_adiciono varchar(12) null,
	estado varchar(1) null,
	CONSTRAINT codigo_etiqueta_pKey PRIMARY KEY (codigo_etiqueta),
	CONSTRAINT codigo_tablero_etiqueta_fKey FOREIGN KEY (codigo_tablero) REFERENCES bd_tablero.bd_tablero(codigo_tablero)
);

CREATE TABLE DB_USUARIOS.ROLES(
	ID_ROL BIGSERIAL PRIMARY KEY NOT NULL,
	ROL_NOMBRE VARCHAR(25),
	FECHA_REGISTRO TIMESTAMP,
	ESTADO VARCHAR(1)
);

CREATE TABLE  DB_USUARIOS.USUARIOS (
  ID_USUARIO BIGSERIAL PRIMARY KEY NOT NULL,
  USERNAME VARCHAR(12),
  PASSWORD VARCHAR(15),
  NOMBRE VARCHAR(50),
  APELLIDO VARCHAR(50),
  EMAIL VARCHAR (75),
  TELEFONO VARCHAR(12),
  FECHA_REGISTRO TIMESTAMP,
  ESTADO VARCHAR(1)
);

CREATE TABLE DB_USUARIOS.USUARIO_ROL(
	ID_USUARIO_ROL BIGSERIAL PRIMARY KEY NOT NULL,
	ID_USUARIO BIGINT,
	ID_ROL BIGINT,
	FECHA_ADICION TIMESTAMP,
	ESTADO VARCHAR(1),
	
	
	CONSTRAINT USER_FK FOREIGN KEY (ID_USUARIO) REFERENCES GESTOR_USUARIOS.USUARIOS (ID_USUARIO),
	CONSTRAINT ROL_FK FOREIGN KEY (ID_ROL) REFERENCES GESTOR_USUARIOS.ROLES (ID_ROL)
);

CREATE OR REPLACE TABLE ORG_T.TABLEROS(
	ID_TABLERO BIGSERIAL PRIMARY KEY NOT NULL,
	NOMBRE_TABLERO VARCHAR(75),
	DESCRIPCION VARCHAR(125),
	ES_PUBLICO VARCHAR(1),
	FECHA_REGISTRO TIMESTAMP,
	USUARIO_ADICIONO VARCHAR(12),
	ESTADO VARCHAR(1)
);

CREATE TABLE ORG_T.USUARIO_TABLERO(
	ID_ASIGNACION BIGSERIAL PRIMARY KEY NOT NULL,
	ID_USUARIO BIGINT,
	ID_TABLERO BIGINT,
	FECHA_ADICION TIMESTAMP,
	USUARIO_ADICIONO VARCHAR(12),
	ESTADO VARCHAR(1),
	
	CONSTRAINT USER_ASIG_TAB_FK FOREIGN KEY (ID_USUARIO) REFERENCES ORG_T.USUARIOS (ID_USUARIO),
	CONSTRAINT TAB_ASIG_FK FOREIGN KEY (ID_TABLERO) REFERENCES ORG_T.TABLEROS (ID_TABLERO)
);


CREATE TABLE ORG_T.TAREAS(
	ID_TAREA BIGSERIAL PRIMARY KEY NOT NULL,
	ID_TABLERO BIGINT,
	NOMBRE VARCHAR(125),
	DESCRIPCION VARCHAR(700),
	FECHA_CREACION TIMESTAMP,
	USUARIO_ASIGNACION VARCHAR(12),
	FECHA_INICIO TIMESTAMP,
	FECHA_FIN TIMESTAMP,
	USUARIO_ADICIONO VARCHAR(12),
	ESTADO VARCHAR(1),
	
	CONSTRAINT TAB_ASIG_TA_FK FOREIGN KEY (ID_TABLERO) REFERENCES ORG_T.TABLEROS (ID_TABLERO)
);

CREATE TABLE DB_COMENTARIOS.COMENTARIOS(
	ID_COMENTARIO BIGSERIAL PRIMARY KEY NOT NULL,
	ID_TAREA BIGINT,
	COMENTARIO VARCHAR(700),
	FECHA_ADICION TIMESTAMP,
	USUARIO_ADICIONO VARCHAR(12),
	ESTADO VARCHAR(1)
);

CREATE TABLE ORG_T.ETIQUETAS(
	ID_ETIQUETA BIGSERIAL PRIMARY KEY NOT NULL,
	NOMBRE_ETIQUETA VARCHAR(100),
	DESCRIPCION VARCHAR(500),
	FECHA_CREACION TIMESTAMP,
	USUARIO_ADICIONO VARCHAR(12),
	ESTADO VARCHAR(1)
);

CREATE TABLE ORG_T.ETIQUETA_TAREA(
	ID_ASIGNACION BIGSERIAL PRIMARY KEY NOT NULL,
	ID_TAREA BIGINT,
	ID_ETIQUETA BIGINT,
	FECHA_ADICION TIMESTAMP,
	USUARIO_ADICIONO VARCHAR(12),
	ESTADO VARCHAR(1),
	
	CONSTRAINT ETI_ASIG_TAB_FK FOREIGN KEY (ID_ETIQUETA) REFERENCES ORG_T.TAREAS (ID_ETIQUETA),
	CONSTRAINT TAB_ASIG_ETI_FK FOREIGN KEY (ID_TAREA) REFERENCES ORG_T.TABLEROS (ID_TAREA)
);





CREATE TABLE DB_ACTIVIDADES.LISTA_ACTIVIDAD(

	ID_LISTA BIGSERIAL PRIMARY KEY NOT NULL,
	ID_TAREA BIGINT,
	NOMBRE_LISTA VARCHAR(125),	
	FECHA_ADICION TIMESTAMP,
	USUARIO_ADICIONO VARCHAR(12),	
	ESTADO BOOLEAN
	
);

CREATE TABLE DB_ACTIVIDADES.ACTIVIDADES(
	ID_ACTIVIDAD BIGSERIAL PRIMARY KEY NOT NULL,
	ID_LISTA BIGINT,
	NOMBRE_ACTIVIDAD VARCHAR(100),
	DESCRIPCION VARCHAR(500),
	FECHA_CREACION TIMESTAMP,
	USUARIO_ADICIONO VARCHAR(12),
	ESTADO BOOLEAN,
	
	CONSTRAINT TAB_LISTA_ACT_FK FOREIGN KEY (ID_LISTA) REFERENCES DB_ACTIVIDADES.LISTA_ACTIVIDAD (ID_LISTA)

);

