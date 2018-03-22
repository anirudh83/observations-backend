# Observations Backend
The backend and apis for configuring the default observation charts.

### Objective
The objective of this spike is to have a local docker instance of MSSQL 2017 database working with the spring boot app,
So each local dev environment can independently run unit tests (also do TDD) and do dev testing.

#### Tech stack
1. Spring boot
2. Spring WebServices API
3. Spring Data (JPA)
4. MSSQL 2017 developer edition (docker image)
5. Docker & gradle


#### Getting Started

##### Local MSSQL Database setup
1. Install Docker. (https://docs.docker.com/install/)
2. Pull MSSQL 2017 developer edition docker image and start the server.
    - (https://www.microsoft.com/en-au/sql-server/sql-server-downloads)

##### Follow the steps here :
 - https://docs.microsoft.com/en-us/sql/linux/quickstart-install-connect-docker
3. Install any MSSQL client (eg SQLPro) and connect it to the localhost:1401.
4. Create an empty database with name "observations"
5. Hibernate property "spring.jpa.hibernate.ddl-auto " will set up the local database schema.

##### Build the project
1. extract/clone the project in a directory.
2. Run gradle build (if gradle is installed) or ./gradlew build

##### Start the server
The spring boot server can be started by using
  -gradle bootRun
  or
  - java -jar build/libs/observations-backend.jar

##### Test
There is integration test which sets up an observation chart in the database using the service

##### Testing the API
Using postman an observation chart can be loaded

Example :
endpoint : localhost:8080/observationChart
Request JSON :

```javascript
{
   "location":{
      "name":"ED1"
   },
   "observationSets":[
      {
         "name":"heartRate",
         "description":"test",
         "observationItems":[
            {
               "callingCriterias":[
                  {
                     "name":"RED",
                     "observationRanges":[
                        {
                           "name":"UPPER_BOUND_MAX",
                           "value":"120"
                        }
                     ]
                  }
               ]
            }
         ]
      }
   ]
}





