# SWAPI GraphQL Java

#### 3. Using Immutables for GraphQLRequest

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