 FROM adoptopenjdk/openjdk11
WORKDIR /
ADD Microservices-0.0.1-jar-with-dependencies.jar Microservices-0.0.1-jar-with-dependencies.jar
CMD Microservices-0.0.1-jar-with-dependencies.jar