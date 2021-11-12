CREATE SCHEMA IF NOT EXISTS ønske;
use ønske;
drop table IF EXISTS User;

CREATE TABLE ønske
(
    ID int auto_increment primary key,
    Title varchar(250),
    URL varchar (250),
    beskrivelse varchar (250)

);
