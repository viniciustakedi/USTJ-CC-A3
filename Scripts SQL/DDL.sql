CREATE DATABASE db_imunizafacil;
USE db_imunizafacil;

#DDL
CREATE TABLE tb_cargo (
	id 		INT NOT NULL AUTO_INCREMENT,
    cargo	VARCHAR(155),
    PRIMARY KEY(id)
)ENGINE = innodb;

CREATE TABLE tb_vacinado (
	id 						INT NOT NULL AUTO_INCREMENT,
    vacinado				BOOLEAN,
    data_vacinacao			VARCHAR(155),
    responsavel_relatorio	VARCHAR(255),
    PRIMARY KEY(id)
)ENGINE = innodb;

CREATE TABLE tb_paciente (
    nome 			VARCHAR(255),
	endereco		VARCHAR(155),
    area_saude		BOOLEAN,
	idade			INT,
	id_vacinado		INT,
	FOREIGN KEY(id_vacinado)	REFERENCES tb_vacinado(id)
);

CREATE TABLE tb_usuario (
	id				INT NOT NULL AUTO_INCREMENT,
    nome 			VARCHAR(255),
	cpf				VARCHAR(255),	
	email			VARCHAR(255),	
    login			VARCHAR(255),
    senha			VARCHAR(255),
    data_nascimento VARCHAR(155),
    id_cargo		INT,
    PRIMARY KEY(id),
    FOREIGN KEY(id_cargo) REFERENCES tb_cargo(id)
);

#DML
INSERT tb_tipousuario(titulo)
VALUES ('administrador'),
	   ('funcionario'),
	   ('paciente');
    
#DQL
SELECT * FROM tb_tipousuario;

#DML
INSERT tb_usuario(nome, senha, email, estado, data_nascimento, area_saude, vacinado, data_vacinacao, idTipoUsuario)
VALUES ('Administrador', 'adm', 'adm@adm', 'São Paulo', '00/00/00', false, false, '00/00/00', 1);

#DQL
SELECT * FROM tb_usuario;

#DQL
SELECT nome, email, senha FROM tb_usuario WHERE idTipoUsuario = 1;

