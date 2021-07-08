# Oauth2-Jwt Server
 
# Build 
> ### mvn clean install
## Then you can find authorization-server-jwt-0.0.1-SNAPSHOT.jar file that is in ../target folder.

# Run command
> ### java -jar target/authorization-server-jwt-0.0.1-SNAPSHOT.jar --server.port=80 

# Postman example: get Token using username and password
> ### key-> Authorization value-> Basic Y2xpZW50OnNlY3JldA==
![alt text](https://github.com/Crouching-Tiger-Hidden-Dragon/Authorization-Server-JWT/blob/master/images/add-header.png?raw=true)

## Metadata: 
> http://localhost:8081/oauth/token?grant_type=password&username=john1&password=123456&scope=read

![alt text](https://github.com/Crouching-Tiger-Hidden-Dragon/Authorization-Server-JWT/blob/master/images/postman-Oauth-authenticate-demo.png?raw=true)

## Resourse Sever: 

![alt text](https://github.com/Crouching-Tiger-Hidden-Dragon/Authorization-Server-JWT/blob/master/images/Resource-server.png?raw=true)
