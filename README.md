# SWAPI GraphQL Java

#### 7. Adding JSON data source for all types

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
  allFilms {
    id
    title
    episodeID
    openingCrawl
    director
    producers
    releaseDate
    created
    edited
  }
}
```