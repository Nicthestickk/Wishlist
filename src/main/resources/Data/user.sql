CREATE SCHEMA IF NOT EXISTS Wishes;
use Wishes;
drop table IF EXISTS User;

CREATE TABLE User
(
    id int auto_increment primary key,
    name varchar(250),
    link varchar (250),
    description varchar (250)
);
