# Spring boot - Simple CRUD - GraphQL

### Start project

`./gradlew bootRun`

### Open Playground with

`http://localhost:8080/graphiql`

### Create Account

```graphql
mutation {
  createAccount(account: {name: "Diego Rosa", bank: "1", branch: "12", number: "12345"}) {
    id
  }
}
```

### Find Account

##### Request

```graphql
query {
  findAccount(number: "12345") {
    id
    name
    bank
    branch
    number
  }
}
```

##### Response
```json
{
  "data": {
    "findAccount": {
      "id": "1",
      "name": "Diego Rosa",
      "bank": "1",
      "branch": "12",
      "number": "12345"
    }
  }
}
```
