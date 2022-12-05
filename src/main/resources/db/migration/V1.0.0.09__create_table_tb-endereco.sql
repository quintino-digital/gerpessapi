drop table if exists tb_endereco;
create table if not exists tb_endereco (
    codigo bigint not null auto_increment,
    id_tipo_endereco bigint,
    id_cidade bigint,
    id_pessoa bigint,
    logradouro varchar(255) not null,
    complemento varchar(255),
    numero varchar(255) not null,
    bairro varchar(255),
    e_principal boolean not null,
    e_ativo boolean not null,
    
    primary key (codigo)
) engine = InnoDB;

alter table tb_endereco add constraint fk_tipo_endereco foreign key (id_tipo_endereco) references tb_tipo_endereco (codigo);

alter table tb_endereco add constraint fk_cidade foreign key (id_cidade) references tb_cidade (codigo);

alter table tb_endereco add constraint fk_pessoa foreign key (id_pessoa) references tb_pessoa (codigo);
