SELECT * FROM `dojos and ninjas`.ninja;

INSERT INTO ninja (first_name,last_name,age,dojo_id) 
VALUES('franki','deyong',26,1),('yohan','cryff',29,1),('ronald','aroujo',24,1);

INSERT INTO ninja (first_name,last_name,age,dojo_id) 
VALUES('cristiano','ronaldo',39,2),('eker','casillas',25,2),('lamin','yamal',16,2);

INSERT INTO ninja (first_name,last_name,age,dojo_id) 
VALUES('ronaldiho','gautcho',28,3),('lio','messi',27,3),('diego','maradona',25,3);

select *
from ninja where dojo_id = 1;

select *
from ninja where dojo_id = 3;

select * from ninja
join dojo on ninja.dojo_id = dojo.id
where ninja.id=156;

select * from ninja
join dojo on ninja.dojo_id = dojo.id ;


