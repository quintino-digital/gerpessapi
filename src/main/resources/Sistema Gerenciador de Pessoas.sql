drop database dbd_gerpess;
create database dbd_gerpess;

use dbd_gerpess;
show tables;

select * from flyway_schema_history;
select * from tb_tipo_pessoa;
select * from tb_pessoa;
select * from tb_cidade;
select * from tb_estado;
select * from tb_pais;
select * from tb_tipo_endereco;
select * from tb_endereco;

select * from tb_pais;

-- Alterar nome da tabela
rename table pais to tb_pais;

-- Alterar nome de coluna
alter table tb_pais change id codigo bigint;

alter table tb_pais change nome nome_portugues varchar(255);

alter table tb_pais change nome nome_portugues varchar(255);

alter table tb_pais change nome_ingles nome varchar(255);

alter table tb_pais drop column bacen;

alter table tb_pais drop column nome_portugues;