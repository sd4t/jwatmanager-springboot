-- create schema test_user_jwat;
-- use test_user_jwat;

-- create table users(
-- 	id int primary key AUTO_INCREMENT,
--     email varchar(64) not null,
--     password varchar(256) not null,
--     created_at date
-- );

-- create table token_users(
-- 	user_id int,
-- 	constraint fk_token_usersid foreign key (user_id) references users(id),
-- 	token varchar(512), 
-- 	expires_at date
-- );

-- insert into users(email, password, created_at) values ("tuan@gmail.com", "123", curdate());