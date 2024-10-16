FROM openjdk:17
WORKDIR /api
COPY . .
CMD ["java","-jar","sample.jar"]