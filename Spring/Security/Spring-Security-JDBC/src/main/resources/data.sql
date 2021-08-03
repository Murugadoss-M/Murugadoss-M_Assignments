insert into users (username,password,enabled) values (
'mmdoss','password',true);
insert into users (username,password,enabled) values (
'admin','password',true);
insert into authorities (username,authority) values (
'mmdoss','ROLE_USER');
insert into authorities (username,authority) values (
'admin','ROLE_ADMIN');