# IT-Academy-S4.01-Spring

Aquest exercici t'introduirà al framework SPRING. 
Començaràs a fer servir el protocol HTTP, a usar Postman, i a descobrir com gestionar dependències amb Maven i Gradle.

## Exercici Spring i Maven

Aquest exercici és un primer contacte amb Spring i Maven.
Accedeix a la pàgina ->https://start.spring.io/, i genera un projecte Spring boot amb les següents característiques:

PROJECT (gestor de dependències): Maven.
LANGUAGE: Java.
SPRING BOOT: La darrera versió estable.

PROJECT METADATA
Group: cat.itacademy.s04.t01.n01
Artifact: S04T01N01
Name: S04T01N01
Description: S04T01N01
Package name: cat.itacademy.s04.t01.n01

PACKAGIN: Jar
JAVA: Mínim versió 11 

Dependències:
- Spring Boot DevTools
- Spring Web

## Exercici Spring i Gradle

Veuràs que aquest nivell és quasi idèntic al nivell 1, però fent servir Gradle com a Gestor de dependències.
Accedeix a la pàgina ->https://start.spring.io/, i genera un projecte Spring boot amb les següents característiques:

PROJECT (gestor de dependències): Gradle.
LANGUAGE: Java.
SPRING BOOT: La darrera versió estable.

PROJECT METADATA
Group: cat.itacademy.s04.t01.n02
Artifact: S04T01N02
Name: S04T01N02
Description: S04T01N02
Package name: cat.itacademy.s04.t01.n02

PACKAGIN: Jar
JAVA: Mínim versió 11 

Dependències:
- Spring Boot DevTools
- Spring Web

## Enunciat

1. Obre el projecte amb IntelliJ.
2. A l’arxiu application.properties, configura la variable server.port amb el valor 9000.
3. Convertirem aquesta aplicació en una API REST: Depenent del package principal, crea un altre subpackage anomenat controller, i dins seu, afegeix la classe HelloWorldController.

Haurà de tenir dos mètodes:

String saluda
String saluda2

Aquests dos mètodes rebran un paràmetre String anomenat nom, i retornaran la frase:
“Hola, “ + nom + “. Estàs executant un projecte Maven”.

### String saluda
El primer mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com un RequestParam. El paràmetre "nom" tindrà el valor per defecte “UNKNOWN”.

Haurà de respondre a:

http://localhost:9000/HelloWorld
http://localhost:9000/HelloWorld?nom=El meu nom

 
### String saluda2
El segon mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com una PathVariable. El paràmetre "nom" serà opcional.

Haurà de respondre a:

http://localhost:9000/HelloWorld2
http://localhost:9000/HelloWorld2/elmeunom

## Exercici Postman

Es tracta de provar els anteriors projectes des de Postman.

Crea dos entorns:
- Projecte Maven
- Projecte Gradle

Ambdós entorns tindran dues variables:
1. Servidor, que en els dos casos tindrà el valor http://localhost
2. Port, que en el cas del projecte Maven tindrà el valor 9000, i en el cas del projecte Gradle, 9001.
