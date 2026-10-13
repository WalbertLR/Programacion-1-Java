# CalculadoraMatematica

`CalculadoraMatematica` es una clase en Java diseñada para realizar operaciones aritméticas básicas entre dos números de tipo `double`. Incluye validaciones básicas como el control de la división entre cero.

## Características

- Almacena y gestiona dos números (`numero1` y `numero2`).
- Permite asignar valores mediante un método específico.
- Operaciones soportadas:
  - **Suma** ($numero1 + numero2$)
  - **Resta** ($numero1 - numero2$)
  - **Multiplicación** ($numero1 \times numero2$)
  - **División** ($\frac{numero1}{numero2}$, con validación para evitar errores al dividir entre cero)

## Estructura de la Clase

### Atributos
- `private double numero1`
- `private double numero2`

### Constructores y Métodos Principales
- **`CalculadoraMatematica()`**: Constructor por defecto que inicializa ambos números en `0.0`.
- **`asignarNumeros(double num1, double num2)`**: Asigna valores a los atributos principales.
- **`sumar()`**: Retorna la suma de ambos números.
- **`restar()`**: Retorna la resta del segundo número al primero.
- **`multiplicar()`**: Retorna el producto de ambos números.
- **`division()`**: Retorna el cociente de la división entre el primer y el segundo número. Si el divisor es `0`, imprime un mensaje de error y retorna `0.0`.

## Ejemplo de Uso

```java
CalculadoraMatematica calc = new CalculadoraMatematica();
calc.asignarNumeros(10.5, 2.0);

double resultadoSuma = calc.sumar(); // 12.5
double resultadoDivision = calc.division(); // 5.25