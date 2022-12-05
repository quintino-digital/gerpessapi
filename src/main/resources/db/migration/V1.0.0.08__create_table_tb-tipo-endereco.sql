drop table if exists tb_tipo_endereco;
create table if not exists tb_tipo_endereco ( 
    codigo bigint not null auto_increment, 
    descricao varchar(255) unique,
    primary key (codigo)
) engine = InnoDB;