SELECT * FROM friendships.users;

INSERT INTO users (first_name, last_name) 
VALUES ('Amy', 'Giver'),('Eli', 'Byers'),('Big', 'Bird'),('Kermit', 'The Frog'),('Marky', 'Mark'),('Another', 'User');

INSERT INTO friendships (user_id, friend_id) 
VALUES(1, 2),(1, 4),(1, 6);

INSERT INTO friendships (user_id, friend_id) 
VALUES(2, 1),(2, 3),(2, 5);

INSERT INTO friendships (user_id, friend_id) 
VALUES(3, 2),(3, 5);

INSERT INTO friendships (user_id, friend_id) 
VALUES (4, 3);

INSERT INTO friendships (user_id, friend_id) 
VALUES(5, 1),(5, 6);

INSERT INTO friendships (user_id, friend_id) 
VALUES(6, 2),(6, 3);

select users.first_name as first_name,users.last_name as last_name,friend.first_name as friend_first_name,friend.last_name as friend_last_name
from users
join friendships on users.id = friendships.user_id
join users as friend on friend.id = friendships.friend_id;
