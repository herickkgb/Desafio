-- Participants
INSERT INTO Participante (id, nome, email) VALUES (1, 'José Silva', 'jose@gmail.com');
INSERT INTO Participante (id, nome, email) VALUES (2, 'Maria do Rosario', 'maria@gmail.com');
INSERT INTO Participante (id, nome, email) VALUES (3, 'Thiago Faria', 'Thiago@gmail.com');
INSERT INTO Participante (id, nome, email) VALUES (4, 'Teresa Campos', 'Teresa@gmail.com');

-- Blocks
INSERT INTO Bloco (id, inicio, fim) VALUES (1, '2017-09-25 08:00:00', '2027-09-25 11:00:00');
INSERT INTO Bloco (id, inicio, fim) VALUES (2, '2017-09-25 14:00:00', '2027-09-25 18:00:00');
INSERT INTO Bloco (id, inicio, fim) VALUES (3, '2017-09-25 13:00:00', '2027-09-25 22:00:00');

-- Categories
INSERT INTO Categoria (id, descricao) VALUES (1, 'Aprenda HTML de forma prática');
INSERT INTO Categoria (id, descricao) VALUES (2, 'Controle versões GITHUB de seus projetos');

-- Activities
INSERT INTO Atividade (id, nome, descricao, preco) VALUES (1, 'Curso de HTML', 'Aprenda HTML de forma prática', 80.00);
INSERT INTO Atividade (id, nome, descricao, preco) VALUES (2, 'Oficina GitHub', 'Controle versões GITHUB de seus projetos', 50.00);
