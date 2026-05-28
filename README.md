![Entrega de TPs](https://img.shields.io/badge/github-entrega_de_TPs-red)

# Actividad Práctica: Introducción a Interfaces (POO) y Flujo de Trabajo con Git (Fork + PR)

## 1. Desafío de Programación: Crear la Interface faltante
En este repositorio se encuentra la estructura inicial de un sistema geométrico compuesto por tres clases dentro del paquete Geometria.

Si clonan el proyecto e intentan compilarlo en su IDE, notaran que el compilador arroja un error inmediato. Esto sucede porque tanto la clase Circulo como la clase Rectangulo declaran explícitamente que implementan una interfaz llamada Figura, pero dicha interfaz no existe actualmente en el proyecto.

Tu Tarea de Código:
Deberás crear el archivo faltante Figura.java dentro del paquete Geometria y definir la interfaz Figura con las firmas de los métodos abstractos necesarios para que el proyecto compile correctamente y respete el comportamiento polimórfico diseñado en el método main.

## Código Base del Proyecto:

### Figura.java
```java
public interface Figura {
    public double calcularArea();
    public double calcularPerimetro();
}
```
### Geometria.java
```java
package geometria;

public class Geometria {
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(5);
        Rectangulo miRectangulo = new Rectangulo(4, 5);
        
        Figura figura1 = miCirculo;
        Figura figura3 = miRectangulo;

        System.out.println("Área del círculo: " + figura1.calcularArea());
        System.out.println("Perímetro del círculo: " + figura1.calcularPerimetro());

        System.out.println("Área rectangulo: " + figura3.calcularArea());
        System.out.println("Perimetro rectangulo: " + figura3.calcularPerimetro());                
    }
}
```
### Rectangulo.java
```java
package geometria;

public class Rectangulo implements Figura {   
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }
    
    @Override
    public double calcularPerimetro() {
        return this.base * 2 + this.altura * 2;
    }
}
```
### Circulo.java
```java
package geometria;

public class Circulo implements Figura {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }    
}
```

## 2. Protocolo de Entrega con Git (Paso a Paso)
Sigan rigurosamente esta secuencia de comandos para efectuar la entrega de la actividad de manera correcta:

**Paso 1:** Realizar el Fork
Dado que el repositorio de la materia está protegido, deben trabajar sobre una copia personal.

Diríjanse a la esquina superior derecha de esta página web y hagan clic en el botón Fork.

Seleccionen su perfil personal de GitHub como destino. Ahora disponen de una copia idéntica del proyecto en sus cuentas de usuario (ej. github.com/tu-usuario/nombre-del-repo).

**Paso 2:** Clonar localmente TU Fork
Abran la terminal de su sistema operativo y clonen su copia modificada (no la del docente). Reemplacen la URL del comando con sus datos:

```bash
git clone https://github.com/TU-USUARIO/NOMBRE-DEL-REPO.git
```

Luego, ingresen al directorio del proyecto:

```bash
cd NOMBRE-DEL-REPO
```

**Paso 3:** Crear una Rama de Trabajo
Para mantener un historial organizado, está prohibido subir modificaciones directamente sobre la rama main. Creen una rama local dedicada utilizando su apellido para identificarla:

```bash
git checkout -b feature/TU-APELLIDO
```
(Ejemplo concreto: git checkout -b feature/maldonado)

**Paso 4:** Programar la Solución
Abran la carpeta clonada con su Entorno de Desarrollo (IDE) de preferencia.

Creen el archivo Figura.java en el paquete Geometria.

Definan la interfaz con las estructuras adecuadas. Verifiquen que compile y que las salidas por consola coincidan con los cálculos matemáticos correspondientes.

**Paso 5:** Registrar los Cambios (Commit)
Una vez validado el funcionamiento del programa, guarden el estado en el historial de Git:

```bash
git add .
git commit -m "crear interfaz Figura para resolver el contrato de Geometria"
```
**Paso 6:** Publicar la Rama en GitHub
Suban su rama local hacia su repositorio remoto hospedado en sus cuentas:

```bash
git push origin feature/solucion-TU-APELLIDO
```

**Paso 7:** Apertura del Pull Request (La Entrega Formal)
Ingresen a la interfaz web de su propio Fork en GitHub.

Verán un aviso en pantalla con un botón que dice **"Compare & pull request"**. Hagan clic allí.

Asegúrense de que las cabeceras de la comparación apunten de la siguiente forma:

base repository: El repositorio del Profesor (main).

head repository: Su repositorio propio (feature/solucion-TU-APELLIDO).

Configuren el título de la solicitud con el formato: "Entrega Actividad Interfaces - Apellido Alumno".

Concluyan haciendo clic en Create pull request.

>**Nota:** El docente utilizará el espacio del Pull Request para revisar el código presentado y registrar las devoluciones o correcciones oportunas. La solicitud permanecerá abierta o se cerrará formalmente como constancia de la evaluación sin fusionarse directamente al código raíz de la materia.
