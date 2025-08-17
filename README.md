# Universidad de la Sabana

## Diseño y Arquitectura de Software

## Space War 2D – Refactoring con Fábrica Abstracta

Este proyecto es una adaptación del juego [spacewar-2d](https://github.com/ekaputra07/spacewar-2d), modificada como ejercicio académico para aplicar **Patrones de Diseño Creacionales** (especialmente _Fábrica Abstracta_) y el principio de **Inversión de Dependencias**.

El objetivo es desacoplar la lógica del juego de su estilo de visualización, permitiendo intercambiar fácilmente entre diferentes estilos gráficos.

---

![Diagrama UML](/uml.png)

## Estilos visuales disponibles

Actualmente, el juego soporta **tres estilos de visualización**:

1. **Sprite (por defecto):**  
   Utiliza imágenes para representar al jugador, las balas y el fondo.

2. **Vectorial:**  
   Usa primitivas gráficas (líneas, óvalos, polígonos) en blanco y negro, simulando un estilo retro.

3. **Colorful Vectorial:**  
   Similar al vectorial, pero con colores para dar más dinamismo.

---

## Cómo cambiar el estilo del juego

El estilo se selecciona modificando una constante en el archivo [`Game.java`](src/main/java/com/balitechy/spacewar/main/Game.java):

### Opciones válidas:

- `"sprite"` → Estilo basado en imágenes.
- `"vectorial"` → Estilo vectorial retro en blanco y negro.
- `"colorful"` → Estilo vectorial a color.

// Línea 33 aprox. en Game.java
Ejemplo:

- private static final String VISUAL_STYLE = "colorful";
- private static final String VISUAL_STYLE = "vectorial";

Trabajado junto con Juan Pablo Parrado

## Licencia

<a rel="license" href="http://creativecommons.org/licenses/by-nc/4.0/">
  <img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-nc/4.0/88x31.png" />
</a><br />
Este proyecto está licenciado bajo la
<a rel="license" href="http://creativecommons.org/licenses/by-nc/4.0/">
  Creative Commons Attribution-NonCommercial 4.0 International License
</a>.


```

```
