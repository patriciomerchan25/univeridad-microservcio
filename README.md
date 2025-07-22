# Api-spring_boot-universidad


## api de Univeridad con sprint-boot


universidad/
├── config/
│   └── CorsConfig.java
├── universidadModel/
│   ├── ResourceNotFoundException.java
│   ├── Universidad.java
│   ├── UniversidadController.java
│   └── UniversidadRepository.java
└── UniversidadApplication.java

#   Ejecutar el proyecto

## Requisitos

tener docker instalado 

## clonar el proyecto

git clone https://github.com/patriciomerchan25/univeridad-microservcio.git
    
## crear el jar del proyecto ;

mvn clean package -DskipTests

## crear Dockerfile

Dockerfile : para la imagen del api iniversidad

## Crear Imagen con docker del api universidad 


docker build -t universidad .


## creacion de yml para Dockerización  de contenedores y tener dos servicios


Docker-compose.yml: para  orquestar los contenedores


## levanatar  contenedores en el  directorio 

 docker compose up 


## probar api con posman

Endpoints en http://localhost:8082/api/universidades

GET /    listar universidades

GET /{id}   obtener universidad por ID

POST /   crear nueva universidad

PUT /{id}   actualizar universidad existente

DELETE /{id}  eliminar universidad

# imagenes

###  Crear universidad (POST)
![Crear universidad](img/crear-universidad.png)

###  Listar todas las universidades (GET)
![Listar universidades](img/listar-universidades.png)

###  Buscar universidad por ID (GET)
![Universidad por ID](img/listar-universidades-por-id.png)

###  Editar universidad (PUT)
![Editar universidad](img/editar-universidad.png)

###  Ver universidades luego de edición
![Universidades editadas](img/listar-universidades-editadas.png)

###  Eliminar universidad por ID (DELETE)
![Eliminar universidad](img/eliminar-universidad-id-2.png)

###  Confirmar eliminación
![Verificar eliminación](img/verificar-eliminar-universidad-id2.png)




