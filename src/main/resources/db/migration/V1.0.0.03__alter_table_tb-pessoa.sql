alter table tb_pessoa add constraint fk_tipo_pessoa foreign key (id_tipo_pessoa) references tb_tipo_pessoa (codigo);
