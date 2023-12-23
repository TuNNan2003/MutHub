# Base image
FROM ubuntu:latest

# JDK install
RUN apt-get update && apt install -y wget openjdk-11-jre

# mysql
RUN apt-get update && apt-get install -y mysql-server mysql-client
RUN service mysql start && mysql -e "ALTER USER 'root'@'localhost' IDENTIFIED BY '12345678';"
EXPOSE 3306

# Kafka
RUN wget https://downloads.apache.org/kafka/3.6.1/kafka_2.13-3.6.1.tgz && \
    tar -xzf kafka_2.13-3.6.1.tgz && \
    mv kafka_2.13-3.6.1.tgz /opt/kafka
ENV PATH="/opt/kafka/bin:${PATH}"

# nodejs
RUN curl -fsSL https://deb.nodesource.com/setup_20.x | bash -
RUN apt install -y nodejs
RUN apt-get update && apt-get install -y ca-certificates curl gnupg
RUN curl -fsSL https://deb.nodesource.com/gpgkey/nodesource-repo.gpg.key | gpg --dearmor -o /usr/share/keyrings/nodesource.gpg
ARG NODE_MAJOR=20
RUN echo "deb [signed-by=/usr/share/keyrings/nodesource.gpg] https://deb.nodesource.com/node_$NODE_MAJOR.x nodistro main" | tee /etc/apt/sources.list.d/nodesource.list
RUN apt-get update && apt-get install -y nodejs

# Vue
RUN npm install -g @vue/cli

# Redis
RUN apt install -y redis-server

# Nginx
RUN apt install -y nginx