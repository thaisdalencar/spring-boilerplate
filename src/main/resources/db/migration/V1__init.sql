DROP TABLE if exists book;

CREATE TABLE book (
	id serial NOT NULL,
	created_at timestamp NULL,
	modified_at timestamp NULL,
	finished_read_at timestamp NULL,
	title varchar(255) NOT NULL
);