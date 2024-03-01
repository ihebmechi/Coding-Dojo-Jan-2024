SELECT * FROM books_sql.users;

insert into users (first_name, last_name) 
values('jan','amsden'),('emily','dexon'),('theodore','dostoevsky'),('william','shapiro'),('lao','xiu');

update users
set first_name ='bill'
where id = 4;

SELECT *
FROM books
JOIN favorates ON users.id = favorates.user_id
JOIN books_id ON books.id = favorates.book_id
WHERE favorates.id = 3;

SET SQL_SAFE_UPDATES = 0;
DELETE FROM favorates WHERE users_id = 1 AND books_id = 3;

INSERT INTO favorates (users_id, books_id) 
VALUES (5, 2);

select * from favorates
where books_id=3;

select * from favorates;
where books_id=5;

