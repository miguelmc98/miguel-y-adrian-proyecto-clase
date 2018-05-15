DROP TABLE producto CASCADE CONSTRAINT;
DROP TABLE categoria CASCADE CONSTRAINT;
DROP TABLE comandas CASCADE CONSTRAINT;
DROP TABLE mesa CASCADE CONSTRAINT;
DROP TABLE ticket CASCADE CONSTRAINT;

CREATE TABLE categoria(id_categoria NUMBER(9) PRIMARY KEY,
    nombre VARCHAR2(255));

CREATE TABLE producto(id_producto NUMBER(9) PRIMARY KEY,
    id_categoria NUMBER(9),
    nombre VARCHAR2(255),
    precio NUMBER(9),
    CONSTRAINT id_categoria_fk FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria) ON DELETE CASCADE);
  
CREATE TABLE mesa (id_mesa NUMBER(9) PRIMARY KEY
 );

CREATE TABLE comandas (id_comanda NUMBER(9) PRIMARY KEY,
    cantidad NUMBER(9),
    id_mesa NUMBER(9),
    id_producto number(9),
CONSTRAINT id_mesa_fk FOREIGN KEY(id_mesa) REFERENCES mesa(id_mesa) ON DELETE CASCADE,
CONSTRAINT id_producto_fk FOREIGN KEY(id_producto) REFERENCES producto(id_producto) ON DELETE CASCADE);


CREATE TABLE ticket (id_ticket NUMBER(9) PRIMARY KEY,
    precio NUMBER(9),
    id_comanda NUMBER(9),
 CONSTRAINT id_comanda_fk FOREIGN KEY(id_comanda) REFERENCES comandas(id_comanda) ON DELETE CASCADE);
