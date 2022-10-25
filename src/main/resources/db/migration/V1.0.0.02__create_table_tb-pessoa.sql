drop table if exists tb_pessoa;
create table if not exists tb_pessoa (
    codigo serial not null,
    id_tipo_pessoa integer not null,
    nome varchar(100) not null,
    constraint pk_pessoa primary key (codigo),
    constraint fk_tipo_pessoa foreign key (id_tipo_pessoa) references tb_tipo_pessoa (codigo)
);