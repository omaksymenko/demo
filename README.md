to create an image was used 

```docker build --tag demo .```

to run the image use

``docker run --rm demo``

Build project in Gradle via execute  
``./gradlew build``

To launch the project run main application class of the module. 
In order to invoke Eureka Feign client:
1. Clone and run clone https://github.com/omaksymenko/eureka-server
2. Clone and run clone https://github.com/omaksymenko/eureka-client
3. Go to http://localhost:8080/address/say-yo and Feign Eureka client is invoked

