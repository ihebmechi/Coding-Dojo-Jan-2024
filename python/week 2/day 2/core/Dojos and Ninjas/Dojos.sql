SELECT * FROM `dojos and ninjas`.dojo;
INSERT INTO dojo (name) 
VALUES('leo'),('cristiano'),('felix');

SET SQL_SAFE_UPDATES = 0;
DELETE FROM dojo;

INSERT INTO dojo (name) 
VALUES('pike'),('ramos'),('maldini');