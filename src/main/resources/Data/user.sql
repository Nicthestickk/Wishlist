CREATE SCHEMA IF NOT EXISTS database;
use database;
drop table IF EXISTS User;

CREATE TABLE User
(
    Username varchar(250),
    Password varchar(250)
);
