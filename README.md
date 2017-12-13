# LyfeCycle
Una Activity es un componente de la aplicación que contiene una pantalla con la que los usuarios pueden interactuar para realizar 
una acción, como marcar un número telefónico, tomar una foto, enviar un correo electrónico o ver un mapa. A cada actividad se le 
asigna una ventana en la que se puede dibujar su interfaz de usuario. La ventana generalmente abarca toda la pantalla, pero en ocasiones 
puede ser más pequeña que esta y quedar "flotando" encima de otras ventanas.

Una aplicación generalmente consiste en múltiples actividades vinculadas de forma flexible entre sí. Normalmente, una actividad en una
aplicación se especifica como la actividad "principal" que se presenta al usuario cuando este inicia la aplicación por primera vez. 
Cada actividad puede a su vez iniciar otra actividad para poder realizar diferentes acciones. Cada vez que se inicia una actividad nueva,
se detiene la actividad anterior, pero el sistema conserva la actividad en una pila (la "pila de actividades"). Cuando se inicia una 
actividad nueva, se la incluye en la pila de actividades y capta el foco del usuario. La pila de actividades cumple con el mecanismo de 
pila "el último en entrar es el primero en salir", por lo que, cuando el usuario termina de interactuar con la actividad actual y presiona 
el botón Atrás, se quita de la pila (y se destruye) y se reanuda la actividad anterior. (La pila de actividades se explica más 
detalladamente en el documento Tareas y pila de actividades).
