CREATE DATABASE Jaegers;

\c jaegers;

CREATE TABLE Jaegers (
    ID SERIAL PRIMARY KEY,
    modelName VARCHAR,
    mark VARCHAR,
    height REAL,
    weight REAL,
    status VARCHAR,
    origin VARCHAR,
    launch DATE,
    kaijuKill INTEGER
    );