DROP TABLE IF EXISTS "Account";
CREATE TABLE "Account" ("Username" CHAR PRIMARY KEY  NOT NULL , "FirstName" CHAR NOT NULL , "LastName" CHAR NOT NULL , "Password" CHAR NOT NULL , "Security_Q" CHAR NOT NULL , "Answer" CHAR NOT NULL );
INSERT INTO "Account" VALUES('mulvaney08','aaron','mulvaney','hello123','Where were you born?','ireland');
INSERT INTO "Account" VALUES('Admin','aaron','m','admin1','What is your childhood Nickname?','admin');
INSERT INTO "Account" VALUES('sdv','sdv','sdv','sdv','What is your childhood Nickname?','sdv');
