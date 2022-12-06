drop table if exists tb_pessoa;
create table if not exists tb_pessoa (
    codigo binary(255) not null,
    id_tipo_pessoa bigint,
    nome varchar(255) unique, 
    primary key (codigo)
) engine = InnoDB; 