CREATE TABLE users (
	user_id integer primary key,
	name varchar(50) not null,
	surname varchar(100) not null,
	age int
);

INSERT INTO users(user_id, name, surname) VALUES (1, 'Alex', 'Shevtsov');