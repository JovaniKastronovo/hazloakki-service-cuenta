#FROM mysql:8
#MAINTAINER jovaniac@gmai.com
#ENV MYSQL_DATABASE=hazloakki \
#    MYSQL_ROOT_PASSWORD=root
    
#ADD ./schema.sql /docker-entrypoint-initdb.d
#EXPOSE 3306

FROM mysql

ENV MYSQL_ROOT_PASSWORD="root"
ENV MYSQL_DATABASE="hazloakki"

ADD schema.sql /tmp/schema.sql

RUN "mysql -u root --password="root" hazloakki < /tmp/schema.sql"