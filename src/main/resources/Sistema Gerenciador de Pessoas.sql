drop database dbd_gerpess;
create database dbd_gerpess;

use dbd_gerpess;

drop table flyway_schema_history cascade;

select * from tb_tipo_pessoa;
select * from tb_pessoa;
select * from tb_cidade;
select * from tb_estado;
select * from tb_pais;
select * from tb_tipo_endereco;
select * from tb_endereco;

select * from flyway_schema_history;
select * from tb_tipo_pessoa;
select * from tb_pessoa;
select * from tb_cidade;
select * from tb_estado;
select * from tb_pais;
select * from tb_tipo_endereco;
select * from tb_endereco;

select * from tb_pais;

select * from tb_estado;

select * from tb_cidade;

-- Alterar nome da tabela
rename table pais to tb_pais;

-- Alterar nome de coluna
alter table tb_pais change id codigo bigint;
alter table tb_pais change nome nome_portugues varchar(255);

-- Remover Coluna
alter table tb_pais drop column bacen;
alter table tb_pais drop column nome_portugues;

-- Alterar nome da tabela
rename table estado to tb_estado;

-- Alterar nome de coluna
alter table tb_estado change id codigo bigint;
alter table tb_estado change pais id_pais integer;
alter table tb_estado change uf sigla varchar(2);

-- Remover Coluna
alter table tb_estado drop column ibge;

-- Alterar nome da tabela
rename table cidade to tb_cidade;

-- Alterar nome de coluna
alter table tb_cidade change id codigo bigint;
alter table tb_cidade change uf id_estado bigint;

-- Remover Coluna
alter table tb_cidade drop column ibge;

-- Teste

/*
	Criar Pessoa
	Criar Endereço
	Associar Pessoa com Endereços
*/

