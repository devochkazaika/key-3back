CREATE TABLE IF NOT EXISTS images  (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    link Varchar(255)
);

CREATE TABLE IF NOT EXISTS products (
      id SERIAL PRIMARY KEY,
      name VARCHAR(255),
      describe VARCHAR(255),
      status Varchar(30),
      category Varchar(50),
      link_for_buy Varchar(500),
      id_image int -- тип данных для хранения бинарных данных
);