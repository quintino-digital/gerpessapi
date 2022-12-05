drop table if exists tb_tipo_pessoa;
create table if not exists tb_tipo_pessoa ( 
    codigo bigint not null auto_increment, 
    descricao varchar(255) unique,
    primary key (codigo)
) engine = InnoDB;