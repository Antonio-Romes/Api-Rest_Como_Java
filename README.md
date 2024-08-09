
<h1 align="center">Criação de API </h1>
<p align="center">Este projeto utiliza o framework Spring Boot para criar uma API RESTful que permite realizar operações CRUD (Create, Read, Update, Delete) para cadastro de alunos, desenvolvida em Java. A API segue as boas práticas de desenvolvimento de APIs RESTful, com controllers responsáveis por lidar com as requisições HTTP, serviços que encapsulam a lógica de negócios, repository que lida com a persistência dos dados e entidades que representam os dados a serem persistidos, oferecendo endpoints para criar, ler, atualizar e deletar alunos, como /alunos para criar um novo aluno e /alunos/{id} para ler, atualizar ou deletar um aluno existente. A API utilizar o formato JSON para transitar os dados do cliente para o servidor e do servidor para o cliente.</p>

<h1 align="center">
    <a href="https://pt-br.reactjs.org/">🔗 Spring Boot e Java</a>
</h1>
<p align="center">🚀 Usado spring boot e java para desenvolver a API.</p>
<p align="center">
 <a href="#objetivo">Objetivo</a> •
 <a href="#roadmap">Roadmap</a> • 
 <a href="#tecnologias">Tecnologias</a> • 
 <a href="#contribuicao">Contribuição</a> • 
 <a href="#licenc-a">Licença</a> • 
 <a href="#autor">Autor</a>
</p>

<h4 align="center"> 
	🚧  API 🚀 Em construção...  🚧
</h4>

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com),[java](https://www.oracle.com/br/java/technologies/downloads/#java21) 21 ou acima. 
Além disto é bom ter um editor para trabalhar com o código como  [Spring Tools 4 para Eclipse](https://spring.io/tools) nas pode escolher o editor da sua preferência.

### 🎲 Rodando o Back End (servidor)

```bash
# Clone este repositório
$ git clone <https://github.com/tgmarinho/nlw1>

# Acesse a pasta do projeto no terminal/cmd
$ cd nlw1

# Vá para a pasta server
$ cd server

# Instale as dependências
$ npm install

# Execute a aplicação em modo de desenvolvimento
$ npm run dev:server

# O servidor inciará na porta:3333 - acesse <http://localhost:3333>
