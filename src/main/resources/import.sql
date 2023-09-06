INSERT INTO tb_categoria(descricao) VALUES ('Curso');
INSERT INTO tb_categoria(descricao) VALUES ('Oficina');


INSERT INTO tb_atividade (categoria_id,nome,descricao,preco) VALUES (1,'Curso de HTML','Aprenda HTML de forma pratica',80.00);
INSERT INTO tb_atividade (categoria_id,nome,descricao,preco) VALUES (2,'Oficina de Github','Controle de versoes de seus projetos',50.00);


INSERT INTO tb_bloco (atividade_id,inicio, fim) VALUES (1,TIMESTAMP WITH TIME ZONE '2017-09-25T08:00:00Z',TIMESTAMP WITH TIME ZONE '2017-09-25T11:00:00Z')
INSERT INTO tb_bloco (atividade_id,inicio, fim) VALUES (2,TIMESTAMP WITH TIME ZONE '2017-09-25T14:00:00Z',TIMESTAMP WITH TIME ZONE '2017-09-25T18:00:00Z')
INSERT INTO tb_bloco (atividade_id,inicio, fim) VALUES (2,TIMESTAMP WITH TIME ZONE '2017-09-26T08:00:00Z',TIMESTAMP WITH TIME ZONE '2017-09-26T11:00:00Z')

INSERT INTO tb_participante(email, name) VALUES ('Jose Silva','jose@gmail.com');
INSERT INTO tb_participante(email, name) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participante(email, name) VALUES ('Maria do Rosario','maria@gmail.com');
INSERT INTO tb_participante(email, name) VALUES ('Teresa Silva','teresa@gmail.com');