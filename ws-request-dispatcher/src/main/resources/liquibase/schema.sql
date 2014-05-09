--   -------------------------------------------------- 
--   Generated by Enterprise Architect Version 8.0.864
--   Created On : Saturday, 11 May, 2013 
--   DBMS       : DB2 
--   --------------------------------------------------

--  Create Tables 
CREATE TABLE JobTitle ( 
	jobTitleID Integer NOT NULL,
	name VARCHAR(50) NOT NULL,
	profession INTEGER,
	reference_value_hh INTEGER,
	reference_value_monster INTEGER
)
;

CREATE TABLE JobTitleHH ( 
	jobTitleHHID Integer NOT NULL,
	name VARCHAR(50) NOT NULL
)
;

CREATE TABLE JobTitleMonster ( 
	jobTitleMonsterID Integer NOT NULL,
	name VARCHAR(50) NOT NULL
)
;

CREATE TABLE Profession ( 
	professionID Integer NOT NULL,
	name VARCHAR(50) NOT NULL,
	reference_value_monster INTEGER,
	reference_value_hh INTEGER
)
;

CREATE TABLE ProfessionHH ( 
	professionHHID Integer NOT NULL,
	name VARCHAR(50) NOT NULL
)
;

CREATE TABLE ProfessionMonster ( 
	professionMonsterID Integer NOT NULL,
	name VARCHAR(50) NOT NULL
)
;


--  Create Primary Key Constraints 
ALTER TABLE JobTitle ADD CONSTRAINT PK_JobTitle 
	PRIMARY KEY (jobTitleID)
;


ALTER TABLE JobTitleHH ADD CONSTRAINT PK_JobTitleHH 
	PRIMARY KEY (jobTitleHHID)
;


ALTER TABLE JobTitleMonster ADD CONSTRAINT PK_JobTitleMonster 
	PRIMARY KEY (jobTitleMonsterID)
;


ALTER TABLE Profession ADD CONSTRAINT PK_Profession 
	PRIMARY KEY (professionID)
;


ALTER TABLE ProfessionHH ADD CONSTRAINT PK_ProfessionHH 
	PRIMARY KEY (professionHHID)
;


ALTER TABLE ProfessionMonster ADD CONSTRAINT PK_ProfessionMonster 
	PRIMARY KEY (professionMonsterID)
;




--  Create Foreign Key Constraints 
ALTER TABLE JobTitle ADD CONSTRAINT FK_JobTitle_JobTitleHH 
	FOREIGN KEY (reference_value_hh) REFERENCES JobTitleHH (jobTitleHHID)
;

ALTER TABLE JobTitle ADD CONSTRAINT FK_JobTitle_JobTitleMonster 
	FOREIGN KEY (reference_value_monster) REFERENCES JobTitleMonster (jobTitleMonsterID)
;

ALTER TABLE JobTitle ADD CONSTRAINT FK_JobTitle_Profession 
	FOREIGN KEY (profession) REFERENCES Profession (professionID)
;

ALTER TABLE Profession ADD CONSTRAINT FK_Profession_ProfessionHH 
	FOREIGN KEY (reference_value_hh) REFERENCES ProfessionHH (professionHHID)
ON DELETE CASCADE
;

ALTER TABLE Profession ADD CONSTRAINT FK_Profession_ProfessionMonster 
	FOREIGN KEY (reference_value_monster) REFERENCES ProfessionMonster (professionMonsterID)
;