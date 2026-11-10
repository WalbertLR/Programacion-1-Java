# 🎓 Sistema de Registro Académico (Java Swing)

Aplicación de escritorio desarrollada en Java con Swing que permite registrar los datos personales de un estudiante, capturar sus calificaciones por rubro, calcular la nota final sobre 100 puntos y determinar de forma automática su estado académico (Aprobado o Reprobado).

---

## 📌 Características Principales

* **Captura de Datos Personales:** Permite ingresar Nombre completo, Matrícula y Carrera.
* **Control de Calificaciones por Rubros:**
  * **Prácticas:** Máximo 40 puntos.
  * **Parciales:** Máximo 20 puntos.
  * **Asignaciones:** Máximo 20 puntos.
  * **Examen Final:** Máximo 20 puntos.
* **Validación de Entradas:**
  * Bloqueo de caracteres alfanuméricos/numéricos en tiempo de escritura (`keyTyped`).
  * Validación estricta de campos vacíos y de rangos numéricos por categoría al momento del cálculo.
  * Manejo seguro de excepciones (`NumberFormatException`).
* **Cálculo Automático de Estado:**
  * **APROBADO:** Nota total $\ge 60$ puntos.
  * **REPROBADO:** Nota total $< 60$ puntos.

---

## 🚀 Requisitos del Sistema

* **JDK (Java Development Kit):** Versión 17 o superior.
* **IDE Recomendado:** NetBeans IDE 17+, Apache NetBeans o VS Code con Java Extension Pack.

---

## 🛠️ Estructura del Proyecto

```text
src/
└── RegistroAcademicoGUI/
    ├── Imagenes/
    │   └── self-assessment_18141887.png
    ├── Main.java
    └── RegistroAcademicoGUI.java

| Interfaz Principal | Validación de Errores | Cálculo de Resultado |
| :---: | :---: | :---: |
| ![Interfaz Principal](imagenes/pantalla_principal.png) | ![Validación](imagenes/validacion_error.png) | ![Resultado](imagenes/resultado_calculado.png) |
