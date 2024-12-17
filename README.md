# labseq-rest

Built using Quarkus

Implement a REST API service for a Labseq Sequence. Then endpoint `/labseq/{n}` returns the calculated number for the corresponding index (n). The response is formatted in JSON.

## REST API Documentation

Using 'SamllRye OpenAPI' extension, with the resquest to endpoint:

`/q/openapi`

it return the current API specification

`/q/openapi?format=json`

for JSON formatting.
