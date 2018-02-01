drop database if exists Rubrica;

create database Rubrica
	   default character set latin1
       default collate latin1_general_ci;
       
use Rubrica;

ALTER DATABASE Rubrica					
	DEFAULT CHARACTER SET utf8
    DEFAULT COLLATE utf8_unicode_ci;

DROP TABLE IF EXISTS country;				

CREATE TABLE country (
	code VARCHAR(2) NOT NULL,
	name VARCHAR(32) NOT NULL,
    PRIMARY KEY(code)
);

DROP TABLE IF EXISTS brand;

CREATE TABLE brand (
	id INT(11) NOT NULL AUTO_INCREMENT,
	name VARCHAR(32) NOT NULL,
	country VARCHAR(2) NOT NULL,
	CONSTRAINT pk_id PRIMARY KEY(id),
    CONSTRAINT fk_country FOREIGN KEY (country) REFERENCES country(code)
);

DROP TABLE IF EXISTS opsys;				

CREATE TABLE opsys (
	id INT(11) NOT NULL AUTO_INCREMENT,
	description VARCHAR(64) NOT NULL,
	company VARCHAR(64) NOT NULL,
	openSource TINYINT(1) NOT NULL,
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS smartphone;

CREATE TABLE smartphone(
	id INT(11) NOT NULL AUTO_INCREMENT,
	name VARCHAR(64) NOT NULL,
	ram VARCHAR(5) NOT NULL,
	cpu VARCHAR(64) NOT NULL,
	displayPpi INT (11) NOT NULL,
	displaySize VARCHAR(12) NOT NULL,
	displayResolution VARCHAR(64) NOT NULL,
	size VARCHAR(64) NOT NULL,
	weight INT(4) NOT NULL,
	notes VARCHAR(1024) NOT NULL,
	brand INT(11) NOT NULL,
	opsys INT(11) NOT NULL,
	CONSTRAINT pk_id PRIMARY KEY(id),
	CONSTRAINT fk_brand FOREIGN KEY (brand) REFERENCES brand(id),
	CONSTRAINT fk_opSys FOREIGN KEY (opsys) REFERENCES opsys(id)
);

DROP TABLE IF EXISTS user;

CREATE TABLE user(
	id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(64) NOT NULL,
    surname VARCHAR(64) NOT NULL,
    eta int(3),
    telNumber VARCHAR(13) NOT NULL,
    email VARCHAR(64),
    smartphone INT(11) NOT NULL,
    CONSTRAINT fk_smartphone FOREIGN KEY (smartphone) REFERENCES Smartphone(id)
);