/*
Created: 23/06/2015
Modified: 29/06/2015
POSTGRESQL
*/


-- Create tables section -------------------------------------------------

-- Table CIAS

CREATE TABLE CIAS
(
  CiaCod SERIAL UNIQUE,
  CiaNom Char(60),
  CiaRUC Char(11),
  CiaEstReg Char(1)
)
;
-- Modify initial value and increment
ALTER SEQUENCE CIAS_CiaCod_seq RESTART WITH 110010 INCREMENT BY 1;


-- Table CLIENTES

CREATE TABLE CLIENTES
(
  CliCod SERIAL UNIQUE,
  CliNom Char(60),
  CliDir Char(60),
  CliEstReg Char(1)
)
;

-- Modify initial value and increment
ALTER SEQUENCE CLIENTES_CliCod_seq RESTART WITH 150010;
--for default the sequence increment by 1

-- Table ARTICULOS

CREATE TABLE ARTICULOS
(
  ArtNum SERIAL UNIQUE,
  ArtDes Char(50),
  ArtPrecUnit Decimal(11,3),
  ArtEstReg Char(1),
  SucCod Int,
  CiaCod Int
)
;

CREATE INDEX IX_Relationship2 ON ARTICULOS (SucCod,CiaCod)
;

-- Modify initial value and increment
ALTER SEQUENCE ARTICULOS_ArtNum_seq RESTART WITH 16010010;
--for default the sequence increment by 1

-- Table VENDEDORES

CREATE TABLE VENDEDORES
(
  VenCod SERIAL UNIQUE,
  VenNom Char(60),
  VenTel Int,
  VenEmail Char(40),
  VenEstReg Char(1)
)
;

-- Modify initial value and increment
ALTER SEQUENCE VENDEDORES_VenCod_seq RESTART WITH 170010;
--for default the sequence increment by 1

-- Table SUCURSALES

CREATE TABLE SUCURSALES
(
  SucCod SERIAL UNIQUE,
  SucDes Char(50),
  SucEstReg Char(1),
  CiaCod Int NOT NULL
)
;

-- Modify initial value and increment
ALTER SEQUENCE SUCURSALES_SucCod_seq RESTART WITH 100;
--for default the sequence increment by 1

ALTER TABLE SUCURSALES ADD  PRIMARY KEY (SucCod,CiaCod)
;

-- Table COTIZACION_CAB

CREATE TABLE COTIZACION_CAB
(
  CotCabNum SERIAL UNIQUE,
  CotCabFecEmi Date,
  CotCabGar Char(60),
  CotCabPlazEnt Char(60),
  CotCabForPag Char(20),
  CotCabEstReg Char(1),
  CliCod Int,
  VenCod Int,
  SucCod Int,
  CiaCod Int
)
;

CREATE INDEX IX_Relationship3 ON COTIZACION_CAB (CliCod)
;

CREATE INDEX IX_Relationship4 ON COTIZACION_CAB (VenCod)
;

CREATE INDEX IX_Relationship7 ON COTIZACION_CAB (SucCod,CiaCod)
;

-- Modify initial value and increment
ALTER SEQUENCE COTIZACION_CAB_CotCabNum_seq RESTART WITH 181010;
--for default the sequence increment by 1

-- Table COTIZACION_DET

CREATE TABLE COTIZACION_DET
(
  CotDetCant Int,
  CotDetEstReg Char(1),
  ArtNum Int NOT NULL,
  CotCabNum Int NOT NULL
)
;

ALTER TABLE COTIZACION_DET ADD  PRIMARY KEY (ArtNum,CotCabNum)
;

-- Create relationships section ------------------------------------------------- 

ALTER TABLE SUCURSALES ADD CONSTRAINT Relationship1 FOREIGN KEY (CiaCod) REFERENCES CIAS (CiaCod) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE ARTICULOS ADD CONSTRAINT Relationship2 FOREIGN KEY (SucCod, CiaCod) REFERENCES SUCURSALES (SucCod, CiaCod) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE COTIZACION_CAB ADD CONSTRAINT Relationship3 FOREIGN KEY (CliCod) REFERENCES CLIENTES (CliCod) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE COTIZACION_CAB ADD CONSTRAINT Relationship4 FOREIGN KEY (VenCod) REFERENCES VENDEDORES (VenCod) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE COTIZACION_DET ADD CONSTRAINT Relationship5 FOREIGN KEY (ArtNum) REFERENCES ARTICULOS (ArtNum) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE COTIZACION_DET ADD CONSTRAINT Relationship6 FOREIGN KEY (CotCabNum) REFERENCES COTIZACION_CAB (CotCabNum) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE COTIZACION_CAB ADD CONSTRAINT Relationship7 FOREIGN KEY (SucCod, CiaCod) REFERENCES SUCURSALES (SucCod, CiaCod) ON DELETE NO ACTION ON UPDATE NO ACTION
;


