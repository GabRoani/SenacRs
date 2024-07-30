create table biblioteca_livros (
Livro_ID int auto_increment primary key,
Titulo varchar(100),
Autor varchar(50),
Data_Publicacao date,
Genero varchar (50)
);

insert into biblioteca_livros  (Titulo, Autor, Data_Publicacao, Genero)
values ('Minha Historia', 'Gabriel Roani', '2024-03-13', 'Autobiografia'),
('Biografia de Usain Bolt', 'Jorge Washington', '2021-06-15', 'Biografia'),
('Viagem a Lua', 'Charles Geroge', '2011-11-20', 'Ficçao');

describe biblioteca_livros ;

alter table autores
add column Nacionalidade varchar(50);

create table Autores(
Autor_ID int auto_increment primary key,
Nome varchar (100),
Nacionalidade varchar(50)
);


insert into autores  (Nome, Nacionalidade)
values ('Gabriel Roani', 'Brasileiro'),
('Jorge Washington', 'Americano'),
('Charles Geroge', 'Russo');

create table nacionalidade_Favoritas (
Nacionalidade varchar(50)
);

insert into nacionalidade_Favoritas (Nacionalidade)
values ('Brasileiro'), ('Americano'), ('Russo');















