create database db_fatec;

use db_fatec;

create table tb_funcionario(
	id int primary key auto_increment,
	nome varchar(100) not null,
	cargo varchar(30) not null,
	email varchar(50) not null unique,
	salario decimal(8,2) not null
	);
	
create table tb_dependente(
	id int primary key auto_increment,
	id_func int,
	constraint fk_id_func foreign key (id_func) references tb_funcionario(id),
	nome varchar(100) not null,
	idade int not null
	);

insert into tb_funcionario (id, nome, cargo, email, salario) values
(default, 'Maria Silva', 'Analista de Sistemas', 'maria.silva@example.com', 4500.00),
(default, 'Carlos Oliveira', 'Engenheiro de Software', 'carlos.oliveira@example.com', 16000.00),
(default, 'Ana Paula Costa', 'Gerente de Projetos', 'ana.costa@example.com', 2000.00),
(default, 'Pedro Henrique Alves', 'Analista de Sistemas', 'pedro.alves@example.com', 4000.00),
(default, 'Fernanda Lima', 'Designer Gráfico', 'fernanda.lima@example.com', 3500.00),
(default, 'Ricardo Santos', 'Analista de Dados', 'ricardo.santos@example.com', 5000.00),
(default, 'Juliana Pereira', 'Designer Gráfico', 'juliana.pereira@example.com', 3500.00),
(default, 'Lucas Mendes', 'Administrador de Redes', 'lucas.mendes@example.com', 4800.00),
(default, 'Patricia Rocha', 'Gerente de Projetos', 'patricia.rocha@example.com', 2500.00),
(default, 'Roberto Nunes', 'Analista de Sistemas', 'roberto.nunes@example.com', 7000.00),
(default, 'Camila Fernandes', 'Psicóloga Organizacional', 'camila.fernandes@example.com', 3800.00),
(default, 'Gustavo Barbosa', 'Analista de Marketing', 'gustavo.barbosa@example.com', 4100.00),
(default, 'Sandra Martins', 'Engenheiro de Software', 'sandra.martins@example.com', 1200.00),
(default, 'Marcos Vinicius', 'Desenvolvedor Back-end', 'marcos.vinicius@example.com', 4700.00),
(default, 'Tatiane Souza', 'Gerente de Vendas', 'tatiane.souza@example.com', 6800.00);
 



 /* select * from tb_funcionario
 order by salario desc;

select * from tb_funcionario
order by nome;

select * from tb_funcionario
order by salario desc
limit 1

select * from tb_funcionario;
select * from tb_dependente;
  
 select*from tb_funcionario
 where cargo = 'Analista de Sistemas' and salario>5000;

select * from tb_funcionario
where cargo = 'Gerente de Projetos'
order by salario desc
limit 1;

select * from tb_funcionario
where cargo = 'Analista de Sistemas' or cargo = 'Gerente de Projetos';

select * from tb_funcionario
where  cargo like 'Analista%';

select * from tb_funcionario
where nome like '% Silva%';

select avg(salario) as 'Média salarial' from tb_funcionario;

select sum(salario) as 'Soma salarial' from tb_funcionario
where cargo like 'Analista%';

select nome, salario, salario * 13.3 as 'Salário anual' from tb_funcionario*/
select cargo, avg(salario) as media from tb_funcionario
group by cargo
order by media desc;


insert into tb_dependente (id_func, nome, idade) values

(1, 'João Silva', 10),
(1, 'Lucas Silva', 8),
(2, 'Ana Oliveira', 5),
(2, 'Carlos Oliveira Jr.', 2),
(3, 'Felipe Costa', 15),
(3, 'Juliana Costa', 12),
(4, 'Rafael Alves', 4),
(4, 'Maria Alves', 6),
(5, 'Eduardo Lima', 7),
(5, 'Laura Lima', 5),
(6, 'Felipe Santos', 3),
(6, 'Camila Santos', 1),
(7, 'Lucas Pereira', 9),
(7, 'Fernanda Pereira', 11),
(8, 'Pedro Mendes', 14),
(8, 'Gustavo Mendes', 6),
(9, 'Bruna Rocha', 16),
(9, 'Tiago Rocha', 18),
(10, 'Sofia Nunes', 10),
(10, 'Isabella Nunes', 7);

SELECT tb_funcionario.id, tb_funcionario.nome, tb_dependente.nome AS nome_dependente
FROM tb_funcionario
INNER JOIN tb_dependente 
ON tb_dependente.id_func = tb_funcionario.id;

SELECT tb_funcionario.id, tb_funcionario.nome, tb_dependente.nome AS nome_dependente
FROM tb_funcionario
LEFT JOIN tb_dependente 
ON tb_dependente.id_func = tb_funcionario.id;

SELECT tb_funcionario.id, tb_funcionario.nome, tb_dependente.nome AS nome_dependente
FROM tb_funcionario
RIGHT JOIN tb_dependente 
ON tb_dependente.id_func = tb_funcionario.id;




