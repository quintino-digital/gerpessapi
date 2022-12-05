drop table if exists tb_estado;
create table if not exists tb_estado ( 
    codigo bigint not null auto_increment, 
    id_pais bigint,
    nome varchar(255) unique,
    sigla varchar(255) unique,
    ddd varchar(255) unique,
    primary key (codigo)
) engine = InnoDB;

alter table tb_estado add constraint fk_pais foreign key (id_pais) references tb_pais (codigo);
