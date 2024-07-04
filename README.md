# Twowatch

Documentação para o backend da nossa aplicação de Biblioteca de Filmes. Este documento fornece uma visão geral dos diversos pontos finais e funcionalidades fornecidos pelo servidor backend.

## Visão Geral

O backend da Biblioteca de Filmes serve como o componente central de nossa aplicação, gerenciando a autenticação do usuário, armazenamento de filmes, funcionalidade de chat e salas privadas. Abaixo estão as principais entidades e funcionalidades fornecidas pelo backend:

- **Usuário**: Representa um usuário registrado da aplicação. 
- **Sala de Chat**: Um espaço virtual onde os usuários podem discutir sobre filmes.
- **Filmes**: Informações sobre os filmes adicionados à biblioteca.

<br/>

- **Mensagens de Chat**: Mensagens trocadas dentro de uma sala de chat. [Sendo implementado]
- **Sala Privada**: Salas de chat privadas entre usuários específicos. [Futuro]

## Endpoints da API
![img.png](docs/img.png) 
 
## Domínio

### Filme

```ts
{
    id: number;
    tmdb_id: string;
    original_title: string;
    title: string;
    backdrop_path: string;
    imdb_id: string;
    original_language: string;
    overview: string;
    popularity: number;
    poster_path: string;
    release_date: string;
    revenue: number;
    runtime: number;
    status: string;
    tagline: Filme;
}
```

### SalaChat

```ts
 {
  id: number;
  nome: string;
  filme: Filme;
  usuarios: Usuario[];
  }

```

### Usuário

```ts
 {
  id: number;
  nome: string;
  email: string;
  senha: string;
  salaChats: SalaChat[];
  }
```