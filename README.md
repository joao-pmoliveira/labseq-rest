# labseq-rest

Built using Quarkus

Implement a REST API service for a Labseq Sequence. Then endpoint `/labseq/{n}` returns the calculated number for the corresponding index (n). The response is formatted in JSON.

## Buil and Run (Docker)

Using maven, to create a docker image:

`./mvnw install -Dquarkus.container-image.build=true`

Run the docker image:

`docker run -i -t labseq-rest:1.0.0-SNAPSHOT`

check `docker images` to match the image's name

Visiting, for example, `localhost:8080/labseq/10` should result in a JSON response with the value '3'.

## REST API Documentation

Using 'SamllRye OpenAPI' extension, with the resquest to endpoint:

`/q/openapi`

it return the current API specification

`/q/openapi?format=json`

for JSON formatting.
