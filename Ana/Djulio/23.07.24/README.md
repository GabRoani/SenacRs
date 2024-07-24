# Atividade de Aula - Criação do Banco de Dados "biblioteca"

## Descrição da Atividade

Na aula de hoje, criamos um banco de dados chamado **"biblioteca"** utilizando o DBeaver e SQL. O objetivo desta atividade foi praticar a criação e manipulação de bancos de dados relacionais, bem como a execução de comandos SQL para estruturar e gerenciar os dados.

## Ferramentas Utilizadas

- **DBeaver**: Um cliente SQL universal e uma ferramenta de administração de bancos de dados.
- **SQL**: Linguagem de consulta estruturada para manipulação de bancos de dados relacionais.

## Passos Realizados

1. **Configuração do Ambiente**
   - Instalamos e configuramos o DBeaver.
   - Configuramos a conexão com o servidor de banco de dados.

2. **Criação do Banco de Dados**
   - Utilizamos o seguinte comando SQL para criar o banco de dados:
     ```sql
     CREATE DATABASE biblioteca;
     ```

3. **Criação das Tabelas**
   - Dentro do banco de dados "biblioteca", criamos as tabelas necessárias utilizando comandos SQL. Por exemplo:
     ```sql
     CREATE TABLE livros (
         id INT PRIMARY KEY,
         titulo VARCHAR(100),
         autor VARCHAR(100),
         ano_publicacao INT
     );
     ```
   - Criamos outras tabelas como `autores`, `editoras`, e `emprestimos` conforme necessário para a modelagem do banco de dados.

4. **Inserção de Dados**
   - Inserimos alguns dados de exemplo nas tabelas para fins de teste e validação:
     ```sql
     INSERT INTO livros (id, titulo, autor, ano_publicacao) VALUES
     (1, 'O Senhor dos Anéis', 'J.R.R. Tolkien', 1954),
     (2, '1984', 'George Orwell', 1949),
     (3, 'Cem Anos de Solidão', 'Gabriel Garcia Marquez', 1967);
     ```

5. **Consultas e Manipulações**
   - Realizamos consultas para verificar os dados inseridos:
     ```sql
     SELECT * FROM livros;
     ```
   - Atualizamos e deletamos dados conforme necessário para praticar comandos DML (Data Manipulation Language).

## Conclusão

A atividade de hoje nos proporcionou uma compreensão prática da criação e manipulação de bancos de dados utilizando DBeaver e SQL. Ficamos mais confortáveis com a execução de comandos SQL
