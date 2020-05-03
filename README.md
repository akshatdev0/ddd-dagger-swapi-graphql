# SWAPI GraphQL Java

#### 4. Adding 'Person' query 

---
#### Steps to run:
Build SAM & start local API
```
sam build
sam local start-api
```

Send below GraphQL Requests with Postman or Postwoman
```
{
  person {
    id
    name
    birthYear
    gender
    height
    mass
    created
    edited
  }
}
```

Response should be as follows
```
{
  "data": {
    "person": {
      "id": "33",
      "name": "John",
      "birthYear": "1980",
      "gender": "male",
      "height": 180,
      "mass": 80.88,
      "created": "2 days ago",
      "edited": "1 hour ago"
    }
  }
}
```