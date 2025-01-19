create table topicos(
    id bigint not null auto_increment,
    titulo varchar(255) not null unique,
    mensaje varchar(255) not null unique,
    fecha_creacion datetime not null,
    status tinyint not null,
    autor varchar(255) not null,
    curso varchar(255) not null,
    primary key(id)
);