FROM adoptopenjdk/openjdk11
EXPOSE 8081
RUN mkdir /app
COPY build/libs/msd_project_day3-0.0.1-SNAPSHOT.jar /app/auth.jar

ENV APIHOST=172.17.0.1:8080
ENTRYPOINT ["java","-jar","/app/auth.jar"]
