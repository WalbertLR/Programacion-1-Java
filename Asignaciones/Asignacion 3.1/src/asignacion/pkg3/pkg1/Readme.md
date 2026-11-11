# 📁 Tarea 3.1 - Herencia y Encapsulación en Java

Este proyecto implementa un ejemplo práctico de los principios fundamentales de la Programación Orientada a Objetos (POO) en Java: **Encapsulación**, **Herencia** y **Sobrescritura de Métodos (`@Override`)**.

---

## 🔍 Objetivos de Aprendizaje

- **Encapsulación:** Proteger los datos de las clases haciendo uso de atributos privados (`private`) y permitiendo un acceso controlado mediante métodos públicos (*getters* y *setters*).
- **Herencia:** Crear relaciones "es-un" mediante la palabra clave `extends`, permitiendo que subclases reutilicen comportamiento y atributos de una clase base.
- **Sobrescritura (`@Override`):** Redefinir la implementación de métodos heredados para personalizar la funcionalidad en la clase hija.

---

## 🛠️ Estructura del Proyecto

El código está dividido en tres clases principales:

1. **`AutoMovil.java` (Clase Base / Padre):**
   - **Atributos privados:** `marca`, `modelo`, `año`, `color`.
   - **Encapsulación:** Métodos `get` y `set` para cada atributo.
   - **Constructor:** Imprime `"Constructor de AutoMóvil"`.
   - **Métodos:** `encender()`, `apagar()`, `acelerar()`, `frenar()`.

2. **`HondaCivic.java` (Clase Derivada / Hija):**
   - Hereda de `AutoMovil` usando `extends`.
   - **Constructor:** Invoca al constructor del padre con `super()` e imprime `"Constructor de HondaCivic"`.
   - **Sobrescritura:** Incluye la anotación `@Override` en los métodos `encender()` y `acelerar()` con comportamientos específicos.

3. **`Main.java` (Clase Principal de Pruebas):**
   - Instancia objetos de ambas clases.
   - Demuestra la asignación de valores mediante *setters* y lectura mediante *getters*.
   - Ejecuta los métodos para visualizar el polimorfismo y la ejecución en orden de los constructores.

---

