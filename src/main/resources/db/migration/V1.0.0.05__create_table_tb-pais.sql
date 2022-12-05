drop table if exists tb_pais;
create table if not exists tb_pais ( 
    codigo bigint not null auto_increment, 
    nome varchar(255) unique,
    primary key (codigo)
) engine = InnoDB;