SELECT * FROM users_schema.users;

INSERT INTO table_name (first_name, last_name, email) 
VALUES('leo','messi','lio@gmail;com'),('cristiano','ronaldo','ronaldo@gmail.com'),('jouo','felix','felix@gmail.com');

SELECT * FROM users;

SELECT email FROM users
Where id=1;

select * from users 
order by first_name;

select * from users 
order by first_name DESC;


select * from users 
order by id DESC
limit 1;

UPDATE users
SET  last_name = 'Pancakes' 
WHERE id = 3;

set SQL_SAFE_UPDATES = 0;
delete from users 
where id = 2;



