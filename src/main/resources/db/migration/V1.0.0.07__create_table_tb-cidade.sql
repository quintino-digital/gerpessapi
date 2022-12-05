drop table if exists tb_cidade;
create table if not exists tb_cidade ( 
    codigo bigint not null auto_increment, 
    id_estado bigint,
    nome varchar(255),
    primary key (codigo)
) engine = InnoDB;

alter table tb_cidade add constraint fk_estado foreign key (id_estado) references tb_estado (codigo);
