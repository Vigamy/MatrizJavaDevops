FROM openjdk:latest
WORKDIR salaf 
COPY . .
CMD ["java", "src/NumAleatorios.java"]
