# Practica4

Práctica 4 de Entornos de Desarrollo 

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


## 6. Sube a máster lo anterior y actualiza la versión
