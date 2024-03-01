SELECT * FROM books_sql.books;

insert into books (title) 
values('C Sharp'),('Java'),('Python'),('PHP'),('Ruby');

update books
set title ='C#'
where id = 1;

insert into Favorates(users_id,books_id)
values  ( 1,1), (1,2);

insert into Favorates(users_id,books_id)
values  ( 2,1), (2,2), (2,3);

insert into Favorates(users_id,books_id)
values  ( 3,1), (3,2), (3,3), (3,4);

insert into Favorates(users_id,books_id)
values  ( 4,1), (4,2), (4,3), (4,4), (4,5);

insert into Favorates(users_id,books_id)
values  ( 4,1), (4,2), (4,3), (4,4), (4,5);






