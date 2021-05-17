CREATE DATABASE db_imunizafacil;
USE db_imunizafacil;

CREATE TABLE tb_tipousuario (
	id 		INT NOT NULL AUTO_INCREMENT,
    titulo 	VARCHAR(155),
    PRIMARY KEY(id)
)ENGINE = innodb;

CREATE TABLE tb_usuario (
	id				INT NOT NULL AUTO_INCREMENT,
    nome 			VARCHAR(255),
    senha			VARCHAR(255),
    email			VARCHAR(255),
    estado			VARCHAR(155),
    data_nascimento VARCHAR(155),
    area_saude		BOOLEAN,
    vacinado		BOOLEAN,
    data_vacinacao 	VARCHAR(155),
    idTipoUsuario	INT,
    PRIMARY KEY(id),
    FOREIGN KEY(idTipoUsuario) 	REFERENCES tb_tipousuario(id)
);

#DDL

INSERT tb_tipousuario(titulo)
VALUES ('administrador'),
	   ('funcionario'),
	   ('paciente');
       
SELECT * FROM tb_tipousuario;

INSERT tb_usuario(nome, senha, email, estado, data_nascimento, area_saude, vacinado, data_vacinacao, idTipoUsuario)
VALUES ('Administrador', 'adm', 'adm@adm', 'São Paulo', '00/00/00', false, false, '00/00/00', 1);

SELECT * FROM tb_usuario;

SELECT nome, email, senha FROM tb_usuario WHERE idTipoUsuario = 1;

