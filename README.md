![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Sumativa 2 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Jose Carrillo
- **Carrera:** Analista Programador Computacional

---

## 📘 Descripción general del sistema
Este proyecto tiene como objetivo gestionar los empleados de una empresa de turismo (Llanquihue Tours), aplicando los principios aprendidos en clases.

El sistema carga los datos desde un archivo .txt, los almacena en una lista y permite:

- Listar todos los empleados.
- Filtrar empleados por rol.
- Filtrar empleados por la ciudad de su dirección.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── app/         # Clase principal con el método main (Main.java)
├── model/       # Clases de dominio (Empleado, Direccion)
├── service/     # Lógica de gestión (GestorEmpleados)
├── util/        # Lectura de archivos (LectorArchivo)
└── resources/   # Archivo de datos (empleados.txt)
```

---

## 📄 Formato del archivo de datos

Cada línea de `empleados.txt` tiene 8 campos separados por `;`:

```plaintext
nombre;telefono;calle;numero;ciudad;rut;rol;id
```

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/jgcarrillo-sudo/LlanquihueTours.git
```

2. Abre el proyecto en IntelliJ IDEA (o NetBeans).

3. Verifica que el archivo `empleados.txt` esté en `src/resources/`.

4. Ejecuta el archivo `Main.java` desde el paquete `app`.

5. Revisa la salida en consola: carga de datos, listado completo, filtro por rol y filtro por ciudad.

---

**Repositorio GitHub:** https://github.com/jgcarrillo-sudo/LlanquihueTours
**Fecha de entrega:** 23/11/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Sumativa
