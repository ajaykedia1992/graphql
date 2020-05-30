--- create a database named as graphql ---

create database graphql;

\c graphql;

--create table book ---
create table book (isn BIGINT Primary key, title varchar(255), publisher varchar(255), authors varchar(255), publisher_date varchar(255));