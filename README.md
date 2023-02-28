# cleanproject
Clean Spring Boot Projekt für DHBW

### Build
Im Hauptverzeichnis:
````
mvnw clean install
````

### Start
1. DB starten
````
cd docker/
docker-compose up
````
2. optional Daten seeden (siehe unten)
3. Anwendung starten (RunConfiguration CleanProjectApplication)

Danach im Browser http://localhost:8080/api/book aufrufen

### DB verwalten
Im Modul Plugins:
#### Clean
````
mvn properties:read-project-properties flyway:clean
````
oder über RunConfiguration "flyway: clean db"

#### Migrationen
````
mvn properties:read-project-properties flyway:migrate
````
oder über RunConfiguration "flyway: migrate db"

#### Seeding / Demo-Daten laden (führt dabei auch clean und migrations aus)
````
mvn properties:read-project-properties flyway:clean flyway:migrate sql:execute
````
oder über RunConfiguration "seed db"

