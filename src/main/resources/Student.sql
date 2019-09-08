drop database if exists Student;
create database Student;
use Student;
CREATE TABLE  users (
   id INT AUTO_INCREMENT,
   firstname VARCHAR(255) NOT NULL,
   lastname VARCHAR(255) NOT NULL,
   created timestamp,
   primary key (id)
)  ENGINE=INNODB;
INSERT INTO users (firstname,lastname) VALUES ("Yuriy", "Voroshchuk");
INSERT INTO users (firstname,lastname) VALUES ("Adem", "Petrol");
