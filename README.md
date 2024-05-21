# Twowatch

Documentação para o backend da nossa aplicação de Biblioteca de Filmes. Este documento fornece uma visão geral dos diversos pontos finais e funcionalidades fornecidos pelo servidor backend.

## Visão Geral

O backend da Biblioteca de Filmes serve como o componente central de nossa aplicação, gerenciando a autenticação do usuário, armazenamento de filmes, funcionalidade de chat e salas privadas. Abaixo estão as principais entidades e funcionalidades fornecidas pelo backend:

- **Usuário**: Representa um usuário registrado da aplicação.
- **Sala de Chat**: Um espaço virtual onde os usuários podem discutir sobre filmes.
- **Mensagens de Chat**: Mensagens trocadas dentro de uma sala de chat.
- **Filmes**: Informações sobre os filmes adicionados à biblioteca.
- **Sala Privada**: Salas de chat privadas entre usuários específicos.

## Endpoints da API



### Gerenciamento de Usuários

- `GET /api/usuario`: Obter uma lista de todos os usuários.
- `POST /api/usuario/:id`: Criar usuário.
- `PUT /api/usuario/:id`: Atualizar detalhes do usuário.

 
 
## Modelos de Dados

### Usuário

```json
{
  "id": "string",
  "username": "string",
  "email": "string",
  "password": "string (criptografado)",
  "createdAt": "timestamp",
  "updatedAt": "timestamp"
}
