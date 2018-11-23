# integration
Google geocoding API integration

# Objectives
The goal is to expose a JSON-based RESTful API, that will accept address as a single string and use this address
parameter to query Google API, that should be consumed using XML format. The JSON response should contain the
formatted address, as well as latitude and longitude of the address.

## Stack used
1. Spring Boot Integration Micro-services
2. Apache Camel for building the actual integration
3. Maven for compiling and building the application
