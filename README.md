# SWAPI GraphQL Java

#### 6. Modularizing the code

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
    eyeColor
    hairColor
    skinColor
    created
    edited
  }
  planet {
    id
    name
    diameter
    rotationPeriod
    orbitalPeriod
    gravity
    population
    climates
    terrains
    surfaceWater
    created
    edited
  }
  starship {
    id
    model
    manufacturers
    costInCredits
    length
    maxAtmospheringSpeed
    crew
    passengers
    cargoCapacity
    consumables
    hyperdriveRating
    MGLT
    starshipClass
    created
    edited
  }
  film {
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
      "eyeColor": "blue",
      "hairColor": "brown",
      "skinColor": "white",
      "created": "2 days ago",
      "edited": "1 hour ago"
    },
    "planet": {
      "id": "EA-101",
      "name": "Earth",
      "diameter": 12742,
      "rotationPeriod": 86164,
      "orbitalPeriod": 31600000,
      "gravity": "9.8 m/s2",
      "population": 759429990000,
      "climates": [
        "tropical",
        "temperate",
        "polar"
      ],
      "terrains": [
        "Mountains",
        "Plateaus",
        "Valleys",
        "Deserts",
        "Dunes",
        "Islands",
        "Plains",
        "Rivers"
      ],
      "surfaceWater": 0.75,
      "created": "4.54 billion years ago",
      "edited": "1 day ago"
    },
    "starship": {
      "id": "DS-101",
      "model": "DS-1 Orbital Battle Station",
      "manufacturers": [
        "Imperial Department of Military Research",
        "Sienar Fleet Systems"
      ],
      "costInCredits": 1000000000000,
      "length": 120000,
      "maxAtmospheringSpeed": 0,
      "crew": "342,953",
      "passengers": "843,342",
      "cargoCapacity": 1000000000000,
      "consumables": "3 years",
      "hyperdriveRating": 4,
      "MGLT": 10,
      "starshipClass": "Deep Space Mobile Battlestation",
      "created": "2014-12-10T16:36:50.509000Z",
      "edited": "2014-12-20T21:26:24.783000Z"
    },
    "film": {
      "id": "FI-106",
      "title": "Return of the Jedi",
      "episodeID": 6,
      "openingCrawl": "Luke Skywalker has returned to\r\nhis home planet of Tatooine in\r\nan attempt to rescue his\r\nfriend Han Solo from the\r\nclutches of the vile gangster\r\nJabba the Hutt.\r\n\r\nLittle does Luke know that the\r\nGALACTIC EMPIRE has secretly\r\nbegun construction on a new\r\narmored space station even\r\nmore powerful than the first\r\ndreaded Death Star.\r\n\r\nWhen completed, this ultimate\r\nweapon will spell certain doom\r\nfor the small band of rebels\r\nstruggling to restore freedom\r\nto the galaxy...",
      "director": "Richard Marquand",
      "producers": [
        "Howard G. Kazanjian",
        "George Lucas",
        "Rick McCallum"
      ],
      "releaseDate": "1983-05-25",
      "created": "2014-12-18T10:39:33.255000Z",
      "edited": "2014-12-20T09:48:37.462000Z"
    }
  }
}
```