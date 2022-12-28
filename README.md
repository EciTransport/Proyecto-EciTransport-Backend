# ECITransport
# Integrantes
* Carlos Orduz
* Yesid Mora
* Laura Alvarado

# :bulb: Video del demo ECITransport [Demo](https://www.youtube.com/watch?v=xhnizmNPevw)

# Resumen
Durante la realización del proyecto se trabajará una red social para la comunidad de la Escuela Colombiana de Ingeniería Julio Garavito, con el fin de reportar los diferentes accidentes que sucedan dentro de la ciudad de Bogotá. Esto permitirá que los estudiantes sepan el grado de congestión de tráfico en una fecha y hora específica. 
# Descripción
## Antecedentes
Actualmente este tipo de problemas se vienen comunicando a través de una cuenta en Instagram, tratando de reportar los diferentes accidentes que hay en las vías. Sin embargo, muchos estudiantes no cuentan con este medio de comunicación o no están interactuando con la red social. También, al ser sólo el administrador de la cuenta que mantiene informada a la comunidad no logran mantenerse informados del estado de la autopista en tiempo real.
## Problema que se resuelve
Debido a que los estudiantes de la Escuela Colombiana de Ingeniería Julio Garavito transitan en la autopista norte para llegar a la universidad se ven afectados por los incidentes que suceden en esta. Pues, por cada incidente hay pérdida de tiempo por el trancón que se realiza, lo que ocasiona llegadas tarde a la universidad o a sus hogares. Sin embargo, no hay un medio que mantenga a los estudiantes actualizados en tiempo real del estado de la autopista norte, por eso, se decidió crear una red social para esta comunidad donde los estudiantes, puedan ir informando los incidentes de la autopista norte, con el fin de que otros estudiantes, realicen su viaje de manera precavida y cumplir con las llegadas en la universidad en horas estimadas. También, contarán con un acceso directo para comunicarse con ambulancias, policías entre otras entidades necesarias para los accidentes.

:dart: Definition of Done

-    Cada componente de la plataforma debe tener test aprobados.
-    Cada funcionalidad debe tener una prueba de aceptación.
-    Documentación realizada.
-    Debe ser software funcional.
-    Debe aportar valor al cliente.
-    Terminado en el tiempo estimado.
-    Aprobado por el cliente y el Product Owner.

:pushpin: Definition of Ready

-    Tener definido los puntos de historia y esfuerzo requerido para cada historia de usuario.
-    No tener dependencias para realizar un componente.
-    Historias de Usuario deben incluir una descripción y criterios de aceptación
-    Historias de Usuario aprobada por el cliente.
-    Software requerido listo.
-    Cada miembro del grupo debe tener claro su responsabilidad.

### :bulb: Diagrama de Componentes

![imagen](https://user-images.githubusercontent.com/98195579/209863155-16d53e2e-2d38-4774-b78c-4f312ecb1139.png)

:star:Las CDN de imágenes se especializan en la transformación, optimización y entrega de imágenes. Se puede pensar en ellas como API para acceder y manipular las imágenes utilizadas en ecitransport.

### :round_pushpin: Diagrama de despliegue

![imagen](https://user-images.githubusercontent.com/98195579/209863230-bd737514-82ec-49be-a9a8-8d9c5840d1e8.png)

### :paperclip:Diagrama de actividades

![imagen](https://user-images.githubusercontent.com/98195579/209863297-5cbcf22e-7714-4e59-abd0-053ec43e53b5.png)

### 📜 Diagrama de casos de uso

![imagen](https://user-images.githubusercontent.com/98195579/209863343-c296c4ac-cad0-4229-9493-cd17e4740d1a.png)

### 🎯 Diagrama de clases

![imagen](https://user-images.githubusercontent.com/98195579/209863402-12eaae3e-4ca7-47fd-be93-41752d5762f4.png)

### 🎯 Atributos de Calidad
 
|Atributo|Fuente|Estimulo|Ambiente|Respuesta|Medida de respuesta|
|--|--|--|--|--|--|
|Disponibilidad|Externo al sistema|Despliegue en azure se averió|Operaciones normales |Realizar nuevamente el despliegue|3 horas|  
|Mantenibilidad|Interno al sistema|Código con malas práticas|Producción|evaluar código fuente y realizar correcciones|1 hora |  
|Seguridad|Usuario no loggeado|Intenta loggearsw al sistema|Bajo operaciones normales  |No permitir al usuario loggearse |menos de 30 minutos|
|Escalabilidad |externo al sistema|servidor muy lento|operaciones normales  |escalabilidad horizontal| menos de 2 minutos|

## Mantenibilidad

![imagen](https://user-images.githubusercontent.com/98195579/209863562-c459164f-deaa-4834-a584-714b458ee797.png)

## Mantenibilidad backend

![imagen](https://user-images.githubusercontent.com/98195579/209863596-1e6ac776-764f-4a70-b104-5e596a31aa21.png)

## Mantenibilidad frontend

![imagen](https://user-images.githubusercontent.com/98195579/209863628-c19e2660-a5ec-4894-877e-ddd6f9424a16.png)

## Escalabilidad

![imagen](https://user-images.githubusercontent.com/98195579/209863663-5487cba5-dc36-4dc9-90a6-932cfa4a05d7.png)

# :calendar:Sprint

## :round_pushpin: Objetivos

- Crear y visulizar los reportes de los accidentes junto a su respectivo autor.
- Loggear a los usuarios en la aplicación.
- visulizar los reportes de los accidentes en el mapa.
- Tener la plataforma multiusuario por medio de STOMP.
- Aplicar Atributos de Calidad.

### Sprint 1 Fechas
:pushpin: Fecha de inicio: octubre 5 de 2022.
:pushpin: Fecha de finalización: noviembre 21 de 2022.

### Sprint 2 Fechas

:pushpin:Fecha de inicio: Noviembre21de 2022.
:pushpin:Fecha de finalización: Diciembre7de 2022.

![imagen](https://user-images.githubusercontent.com/98195579/209863839-dd3f0811-2f32-465f-9b97-45455785e6a2.png)

## Sprint 1- Ceremonias

### Sprint planning meeting

# :calendar:Sprint 1 

## :round_pushpin: Objetivos
- Crear y visulizar los reportes de los accidentes junto a su respectivo autor.
- Loggear a los usuarios en la aplicación.

:pushpin: Fecha de inicio: octubre 5 de 2022.
:pushpin: Fecha de finalización: noviembre 21 de 2022.

![imagen](https://user-images.githubusercontent.com/98195579/209863913-2cb41e28-77aa-404e-a9af-239f0bac885d.png)

### Sprint Review Meeting

## :soon: Incremento del producto

![imagen](https://user-images.githubusercontent.com/98195579/209863992-26cc293c-1a6d-4402-a5bd-1c07c08835d4.png)

## :pushpin: Burndown chart

![imagen](https://user-images.githubusercontent.com/98195579/209864012-69bd1ab2-ff08-4026-91f5-4e5a0cabe2f7.png)

### Sprint retrospective

## :chart_with_upwards_trend: aprendizajes
- Construir y llevar a cabo un plan de acción para cumplir con los objetivos propuestos del sprint.
- Comunicar errores y recomendaciones para cumplir con la calidad del proyecto. 
- Aprender nuevas tecnologías como React y Mongo.
## :zap: retos
- Ser más frecuentes con el taskboard del sprint para mantenerlo actualizado.
- Mantener una comunicación constante de los adelantos independientes del proyecto.
- Programar reuniones más seguidos para revisar el estado del sprint.

## Sprint 2- Ceremonias

### Sprint planning meeting

## :calendar: Sprint 2
## :round_pushpin: Objetivos

- visulizar los reportes de los accidentes en el mapa.
- Tener la plataforma multiusuario por medio de STOMP.

:pushpin:Fecha de inicio: Noviembre21de 2022.
:pushpin:Fecha de finalización: Diciembre7de 2022.

![imagen](https://user-images.githubusercontent.com/98195579/209864221-d3ea9ed1-974e-467b-9063-b6c0af8cb73e.png)

### Sprint Review meeting

## :soon: Incremento del producto
![imagen](https://user-images.githubusercontent.com/98195579/209864338-50013c6c-1b80-45b7-b0fb-acab773f1b64.png)
![imagen](https://user-images.githubusercontent.com/98195579/209864362-f257da29-49d2-45da-87fc-eb6ea0c02950.png)

## :pushpin: Burndown chart

![imagen](https://user-images.githubusercontent.com/98195579/209864410-ad709bd1-5624-40d9-9b9e-7b46bedbc7a7.png)

### Sprint retrospective

## :chart_with_upwards_trend: aprendizajes
- Construir y llevar a cabo un plan de acción para cumplir con los objetivos propuestos del sprint.
- Lograr implementar STOMP dentro del proyecto. 
- Lograr el despliegue en azure por medio de web app.
- Lograr implementar los diferentes atributos de calidad.
## :zap: retos
- Ser más frecuentes con el taskboard del sprint para mantenerlo actualizado.
- Programar reuniones más seguidos para revisar el estado del sprint.
- Tomar en cuenta las observaciones y avances de los demás compañeros.












