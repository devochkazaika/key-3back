CREATE TABLE images (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    data BYTEA -- тип данных для хранения бинарных данных
);

CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    descibe VARCHAR(255),
    status Varchar(30),
    category Varchar(50),
    linkForBuy Varchar(500),
    id_image int -- тип данных для хранения бинарных данных
);