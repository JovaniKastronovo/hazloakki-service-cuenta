FROM openjdk:8u171-jre-slim
MAINTAINER jovaniac@gmail.com"
COPY start.sh /start.sh
COPY wait-for-it.sh /wait-for-it.sh
COPY orderservice.jar /opt/orderservice.jar
RUN sh -c 'chmod +x *.sh'
EXPOSE 8085
ENTRYPOINT ["/wait-for-it.sh", "rabbitmq:15671", "postgres:5433", "--", "/start.sh"]
