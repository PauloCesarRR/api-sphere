CREATE TABLE IF NOT EXISTS tb_user (
    id uuid not null primary key,
    name varchar(255),
    email varchar(255),
    password varchar(255),
    created_at datetime,
    updated_at datetime
)