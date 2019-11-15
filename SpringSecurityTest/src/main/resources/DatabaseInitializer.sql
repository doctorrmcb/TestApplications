CREATE TABLE SECURITY (
user_id serial primary key,
email text not null unique,
password text not null,
roles text
)

drop table "security";

insert into "security" values (1, 'test@test.com', 'pass', null);
insert into "security" values (2, 'user@user.com', 'pass', 'USER');
insert into "security" values (3, 'admin@admin.com', 'pass', 'ADMIN');