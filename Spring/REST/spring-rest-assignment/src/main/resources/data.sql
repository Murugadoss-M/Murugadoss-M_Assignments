create table employee(
id int auto_increment primary key,
name varchar(50) not null,
department varchar(20) not null,
designation varchar(20) not null,
salary int not null
);
insert into employee (name,department,designation,salary) values('Doss','IT','Analyst','22000');
insert into employee (name,department,designation,salary) values('Adam','Admin','Accountant','16000');
insert into employee (name,department,designation,salary) values('Bob','IT','Manager','32000');
insert into employee (name,department,designation,salary) values('Carl','Sales','Senior Analyst','28000');
insert into employee (name,department,designation,salary) values('Dave','Marketing','Analyst','27000');