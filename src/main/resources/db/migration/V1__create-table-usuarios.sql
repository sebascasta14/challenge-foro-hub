create table autores(
    id bigint not null auto_increment,
    name varchar(100) not null,
    username varchar(100) not null,
    password varchar(300) not null,
    primary key(id)
);