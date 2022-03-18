# Practica4

Práctica 4 de Entornos de Desarrollo 

## Índice
1. [Sube la Práctica3 a github como primera versión en la rama master.](https://github.com/Jordiop/Practica4#1-sube-la-pr%C3%A1ctica3-a-github-como-primera-versi%C3%B3n-en-la-rama-master)
2. [Crea una rama nueva para desarrollo, y actualiza la versión.](https://github.com/Jordiop/Practica4#2-crea-una-rama-nueva-para-desarrollo-y-actualiza-la-versi%C3%B3n)
3. [Realiza 2 refactorizaciones.](https://github.com/Jordiop/Practica4#3-realiza-2-refactorizaciones)
4. [Actualiza la rama master con la nueva versión estable.](https://github.com/Jordiop/Practica4#4-actualiza-la-rama-master-con-la-nueva-versi%C3%B3n-estable)
5. [Realiza 2 refactorizaciones más en la rama de desarrollo desde la versión anterior.](https://github.com/Jordiop/Practica4#5-realiza-2-refactorizaciones-m%C3%A1s-en-la-rama-de-desarrollo-desde-la-versi%C3%B3n-anterior)
6. [Sube a máster lo anterior y actualiza la versión](https://github.com/Jordiop/Practica4#6-sube-a-m%C3%A1ster-lo-anterior-y-actualiza-la-versi%C3%B3n)

## 1. Sube la Práctica3 a github como primera versión en la rama master.

![primer](https://user-images.githubusercontent.com/95173613/157343854-e10bc4e4-ec97-4d57-b8df-58190e4b8802.png)

Hemos usado `git init` sobre la carpeta de la práctica para que se iniciara como repositorio.

Posteriormente lo hemos conectado con `git remote add origin [link]` al repositorio creado previamente. 

Y finalmente se ha utilizado el comando `git push -u origin master`, dónde hemos subido el contenido del proyecto java y además hemos creado la rama master.


## 2. Crea una rama nueva para desarrollo, y actualiza la versión.

!![00-git clone repo link](https://user-images.githubusercontent.com/77643882/158163542-120287a1-1ac1-49e3-9e73-9cac77862898.png)

Clonamos el repositorio en un directorio mediante `git clone [repo link]`.

![01-git branch view and create](https://user-images.githubusercontent.com/77643882/158163892-46ae095a-3cf8-485a-8846-6d73caf3dfdc.png)

Una vez situados en la carpeta que contiene los archivos importados del repositorio remoto,
comprobamos si cuenta con más ramas mediante `git branch` y creamos una nueva `git branch development`.

![02-git checkout development - switch branch](https://user-images.githubusercontent.com/77643882/158164201-c20c3e78-d6c3-426c-ad05-5bdb7335dd22.png)
![03-git tag version ](https://user-images.githubusercontent.com/77643882/158164473-28caad85-19fd-47e1-89ab-98c9a9317eb6.png)

Navegamos entre ramas utilizando `git checkout development` donde posteriormente le añadiremos un tag actualizando a la versión 1.1 mediante `git tag Practica-v1.1 -m “mensaje descriptivo”` y comprobaremos su creación listando las etiquetas con `git tag -l`.

![04-git push tags](https://user-images.githubusercontent.com/77643882/158164644-51922b9f-865f-4718-89c9-7ed356ab9152.png)

Actualizamos las etiquetas mediante `git push –tags`.

![4 1-git push new branch (pull request on github)](https://user-images.githubusercontent.com/77643882/158164861-07fc9954-a767-4908-9d07-678e37c64f0e.png)

Actualizamos la nueva rama de local a remoto mediante `git push –all -u`.

## 3. Realiza 2 refactorizaciones.

### Mover clases a nuevo paquete

Abrimos el proyecto previamente descargado desde git en nuestro IDE, NetBeans para este ejemplo:
Seleccionamos las clases a mover.

![05-clases to move](https://user-images.githubusercontent.com/77643882/158165232-995f2254-07f0-4d7a-ad31-fcc331859b11.png)

Seleccionamos el package creado previamente como destino.

![06-newPackage](https://user-images.githubusercontent.com/77643882/158165274-407d5741-8b14-4678-a756-9669e25214ff.png)

Las clases han sido movidas al nuevo package, donde el IDE nos indica el color cian que los archivos han sido modificados y en verde archivos pendientes de agregar al *Staging Area*.

![07-refactored](https://user-images.githubusercontent.com/77643882/158165330-1c52388d-71ee-439b-9f6d-6e8a2fd9a838.png)

Podemos ver la iformación actual que nos da git utilizando el comando `git status -s [short]`.

![08-git status -s](https://user-images.githubusercontent.com/77643882/158165407-60ea091e-185f-4a2c-994c-0df04c7ef9af.png)

Agregamos los archivos al Stagin Area mediante `git add .` y comprobamos con `git status -s`.

![09-git add ](https://user-images.githubusercontent.com/77643882/158165500-3af7f368-938d-4e71-8121-ae15604f1fb1.png)

Realizamos captura mediante `git commit -m “message”` agregando cambios al *Working Directory*.

![10-git commit -m](https://user-images.githubusercontent.com/77643882/158165917-90e273c6-bf93-4e21-88ac-14eb12798360.png)

Comprobamos en el historial de ‘*commits*’ mediante `git log --oneline`.

![11-git log --online](https://user-images.githubusercontent.com/77643882/158166039-459554a0-4b4c-4b8c-8a36-151a039d49fa.png)

Agregamos una etiqueta de versión utilizando el comando `git tag -l` para listar los tags existentes y `git tag Practica-v1.2 -m “message”` para definir una etiqueta.

![12-git tags](https://user-images.githubusercontent.com/77643882/158166135-289d568f-1f11-4ea6-861c-91c3f2ebedb2.png)

Actualizamos los tags mediante `git push -–tags`.

![13-git push --tags](https://user-images.githubusercontent.com/77643882/158166221-38313ea5-5558-4e81-9839-7ff03724b052.png)

### Eliminar interfaz

Una vez localizadas las clases implicadas con el uso de la interfaz, teniendo en cuenta sus referencias, implementaciones y los métodos abstractos a sobre-escribir, se elimina la interfaz.

![14-modify clases](https://user-images.githubusercontent.com/77643882/158166659-683c3827-1de9-4ef7-b6c4-3b32ce98993c.png)
![15-Sfely delete](https://user-images.githubusercontent.com/77643882/158166678-9c297466-f789-48b4-816f-6e77f46ed627.png)

Comprobamos el estado del seguimiento de los archivos con `git status -s`.

![16-git status](https://user-images.githubusercontent.com/77643882/158166889-48338955-c957-40f3-9976-ceb81aaf88d8.png)

Agregamos los archivos modificados al *Stagin Area* mediante `git add .` y realizamos un commit con `git commit -m “message”` comprobando el resultado en el historial con `git log --oneline`.

![17-git add  + git commit + git log --oneline](https://user-images.githubusercontent.com/77643882/158167047-a2c44ef0-6e01-470a-bb47-ce1a26a462bb.png)

Actualizamos los tags para seguir un versionado semántico mediante `git tag -d Practica-v1.1` y `git tag v1.1.0 [commit hash-code]`.

![18-Actualizar tags semanticos](https://user-images.githubusercontent.com/77643882/158167417-d5c8e97d-6706-4fb9-bd7c-3dd4b70cbbca.png)

Subiendo cambio de local a remoto de la actualización de las etiquetas con `git push --tags`.

![18 1-git push --tags](https://user-images.githubusercontent.com/77643882/158167489-3047a013-ec5b-4bb3-bb62-cd04b3f8f457.png)

## 4. Actualiza la rama master con la nueva versión estable.

Antes de realizar un `git merge` para fusionar ramas, nos situamos en la rama principal *master* con `git checkout master`.

![19-git merge](https://user-images.githubusercontent.com/77643882/158167835-8cac8f78-3a1e-4b72-8edf-50ac389c31cf.png)

Una vez situados en la rama *master* con el comando `git merge development` fusionamos las ramas *master* y *development*, viendo por consola los cambios realizados.

![20-git merge summary](https://user-images.githubusercontent.com/77643882/158167947-e7514c57-720b-49e5-8d5e-58e16cd38188.png)

Actualizando los cambios del repositorio local al remoto mediante `git push`.

![22](https://user-images.githubusercontent.com/77643882/158168402-1c9baed8-7d44-4a9d-a5b2-bda163c0ba22.png)

## 5. Realiza 2 refactorizaciones más en la rama de desarrollo desde la versión anterior.

Volvemos a clonar a nuestro directorio local la rama de desarrollo con la última versión realizada.

![imatge](https://user-images.githubusercontent.com/95173613/158573667-60cf15fd-f86b-4c03-8007-19ea446f0a90.png)

Cambiamos la rama sobre la que trabajamos en GIT antes de realizar alguna acción.

![imatge](https://user-images.githubusercontent.com/95173613/158575191-55e6b154-8f1b-48a2-8dc1-c68d08ca87bb.png)

Después, usando NetBeans como IDE refactorizamos

![imatge](https://user-images.githubusercontent.com/95173613/158574108-ff7f6d96-a64a-4bbc-afda-5d14e298ff72.png)

En este caso hemos creado un paquete para las clases que o eran Motor, o hacen uso de el. Podemos apreciar que los archivos *Barco* y *Motor* están marcados en verde, pendientes de agregarse a la *Staging area*. Lo apreciamos con un `git status -s`

![imatge](https://user-images.githubusercontent.com/95173613/158575812-9c985ded-3f84-4c61-8030-bd4572f7af5c.png)

Cuando los cambios estén realizados, aplicaremos `git add .` y posteriormente `git status -s` para comprobar que esté todo correctamente.

![imatge](https://user-images.githubusercontent.com/95173613/158576319-0145515a-e4ed-4961-8bb0-52699edce714.png)

Ahora, le daremos una tag a la nueva versión. Primero listaremos las versiones con `git tag -l`

![imatge](https://user-images.githubusercontent.com/95173613/158576600-66bda8db-efba-4519-886d-932b68b31d98.png)

Y le daremos una versión con `git tag Practica-v.2.1 -m "2.1.0"`

![imatge](https://user-images.githubusercontent.com/95173613/158576747-760e672a-218b-4c89-bade-478fc7b713ef.png)

Y finalizamos con un `git push --all -u`

La segunda refactorización la realizaremos sobre los nombres de los paquetes. 

![imatge](https://user-images.githubusercontent.com/95173613/158584178-cc03b7d5-a091-4000-99ba-0e5ad644355c.png)

Una vez refactorizados, realizaremos los mismos pasos que anteriormente.

## 6. Sube a máster lo anterior y actualiza la versión.

Para subir a *master* nuestra última versión, realizaremos un `merge` con la rama *development* y realizaremos un `git push` para aplicar los cambios

![imatge](https://user-images.githubusercontent.com/95173613/158587311-75a0747a-1d86-4819-9433-f475695aad3e.png)

![imatge](https://user-images.githubusercontent.com/95173613/158587441-902ec753-3fdd-479e-92fd-249220224b83.png)



