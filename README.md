# Api-spring_boot-universidad

## api de Univeridad con sprint-boot

📁universidad
    └── 📁config
        ├── CorsConfig.java
    └── 📁universidadModel
        ├── ResourceNotFoundException.java
        ├── Universidad.java
        ├── UniversidadController.java
        ├── UniversidadRepository.java
    └── UniversidadApplication.java

## Crear Imgenen con docker del api

docker build -t universidad .

## creacion de yml para Dockerización  de contenedores y tener dos servicios

Docker-compose.yml: para  orquestar los contenedores
Dockerfile : para la imagen del api iniversidad

## levanatar  contenedores en el  directorio 
 docker compose up 

