drop table if exists tb_pessoa;
create table if not exists tb_pessoa (
    codigo bigint not null auto_increment, 
    id_tipo_pessoa bigint,
    nome varchar(255), 
    primary key (codigo)
) engine = InnoDB;