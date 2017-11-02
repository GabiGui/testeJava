create database testeValemobi

use testeValemobi

create table tb_customer_account (
id_customer int identity(1500,1) not null,
cpf_cnpj varchar(14) not null,
nm_customer varchar(80) not null,
is_active bit not null,
vl_total money not null)

insert into tb_customer_account values (64124732384, 'Mirella Lívia Monteiro', 1, 12.60)
insert into tb_customer_account values (17578549081, 'Cauã Heitor Oliveira', 1, 560.20)
insert into tb_customer_account values (23596734320, 'Gabriel João de Paula', 1, 3700.00)
insert into tb_customer_account values (41329335201, 'Laura Isadora Ribeiro', 1, 5720.0)
insert into tb_customer_account values (93684644722, 'Laís Gabrielly Pereira', 1, 500.00)
insert into tb_customer_account values (67061405546, 'André Isaac Freitas', 1, 70.00)
insert into tb_customer_account values (57175848579, 'Bárbara Silva Costa', 1, 956.00)
insert into tb_customer_account values (20902468000189, 'Maitê Gabril Castro', 1, 6025.00)
