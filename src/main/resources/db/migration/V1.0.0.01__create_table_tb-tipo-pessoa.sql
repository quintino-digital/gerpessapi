drop table if exists tb_tipo_pessoa;
create table if not exists tb_tipo_pessoa (
    codigo serial not null,
    descricao varchar(100) not null,
    constraint pk_tipo_pessoa primary key (codigo)
);