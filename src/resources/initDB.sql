CREATE TABLE DEVELOPER (
id         INTEGER  NOT NULL AUTO_INCREMENT,
first_name  VARCHAR(45)     NOT NULL,
last_name   VARCHAR(45)     NOT NULL,
specialty  VARCHAR(45)     NOT NULL,
experience INTEGER         NOT NULL,
salary     INTEGER         NOT NULL,
PRIMARY KEY (id)
)Engine = InnoDB;

CREATE TABLE SKILL (
id INTEGER NOT NULL AUTO_INCREMENT,
skill_name VARCHAR(45) NOT NULL,
PRIMARY KEY (id)
)Engine = InnoDB;


CREATE TABLE DEVELOPER_SKILL (
developer_id INTEGER NOT NULL,
skill_id INTEGER NOT NULL,
PRIMARY KEY (developer_id, skill_id),
CONSTRAINT FK_DEVELOPER FOREIGN KEY (developer_id) REFERENCES DEVELOPER(id),
CONSTRAINT FK_SKILL FOREIGN KEY (skill_id) REFERENCES SKILL(id)
)Engine = InnoDB;

##################################################################

CREATE TABLE TEAM (
id INTEGER NOT NULL AUTO_INCREMENT,
team_name VARCHAR(45)  NOT NULL,
PRIMARY KEY(id)
)Engine = InnoDB;


CREATE TABLE PROJECT (
id INTEGER NOT NULL AUTO_INCREMENT,
project_name VARCHAR(45) NOT NULL,
PRIMARY KEY(id),
CONSTRAINT team_project FOREIGN KEY (id) 
REFERENCES TEAM (id)
 ON DELETE CASCADE
 ON UPDATE CASCADE
)Engine = InnoDB;



###############################################################

CREATE TABLE COMPANY (
id INTEGER NOT NULL AUTO_INCREMENT,
PRIMARY KEY(id), 
company_name VARCHAR(45)       NOT NULL
)Engine = InnoDB;

CREATE TABLE CUSTOMER (
id          INTEGER         NOT NULL AUTO_INCREMENT,
first_name  VARCHAR(45)     NOT NULL,
last_name   VARCHAR(45)     NOT NULL,
address  VARCHAR(45)     NOT NULL,
PRIMARY KEY(id)
)Engine = InnoDB;

CREATE TABLE CUSTOMER_COMPANY (
customer_id INTEGER NOT NULL,
company_id INTEGER NOT NULL,
CONSTRAINT FK_CUSTOMER FOREIGN KEY (customer_id) REFERENCES CUSTOMER(id),
CONSTRAINT FK_COMPANY FOREIGN KEY (company_id) REFERENCES COMPANY(id),
UNIQUE (customer_id, company_id)
)Engine = InnoDB;