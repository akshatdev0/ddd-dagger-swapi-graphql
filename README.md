# SWAPI GraphQL Java

#### 2. GraphQL Hello World

- Base GraphQL setup
- GraphQL Schema Definition Language
- GraphQL Query Resolver

---
#### Steps to run:
Build SAM & start local API
```
sam build
sam local start-api
```

Send below GraphQL Request with Postman or Postwoman
```
{
    hello
}
```

Response should be as follows
```
{
  "data": {
    "hello": "world"
  }
}
```