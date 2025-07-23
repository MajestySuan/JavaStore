JavaStore


JavaStore es una aplicación de tienda virtual desarrollada en Java utilizando Swing para la construcción de la interfaz gráfica. El proyecto está diseñado como una solución simple para gestionar inventarios, ventas y compras dentro de un entorno local educativo o experimental. Es ideal para familiarizarse con la programación orientada a objetos en Java, la interacción con bases de datos (MySQL) y el desarrollo de aplicaciones de escritorio.

Características Principales
Interfaz gráfica amigable desarrollada con Java Swing.

Gestión de productos con su CRUD respectivo.

Carrito de compras y procesamiento de pedidos.

Conexión a base de datos MySQL para almacenamiento persistente.

Estructura modular de código, facilitando la comprensión y mantenimiento.

Proyecto educativo/documentado para aprendizaje autodidacta.

Estructura del Proyecto
text
JavaStore/
│
├── src/                 # Código fuente principal
├── build/               # Archivos compilados
├── classes/             # Clases generadas
├── nbproject/           # Archivos de configuración de NetBeans
├── mysql-connector-j-8.0.33 # Controlador de conexión MySQL
├── build.xml            # Script de compilación
├── manifest.mf          # Configuración de manifiesto Java
Requisitos
Java JDK 8 o superior

MySQL 5.7+ (puedes usar otra versión si configuras el conector)

IDE recomendada: NetBeans, Eclipse, IntelliJ IDEA

Conector MySQL JDBC incluido en el proyecto (mysql-connector-j-8.0.33)

Instalación y Ejecución
Clona el repositorio

bash
git clone https://github.com/MajestySuan/JavaStore.git
Configura tu base de datos MySQL

Crea una base de datos llamada javastore (puedes cambiar el nombre en el código si lo deseas).

Ejecuta el script de creación de tablas (.sql) incluido, o crea las tablas según lo indicado en los modelos de la aplicación.

Abre el proyecto en tu IDE favorito

Importa el proyecto en NetBeans, Eclipse o IntelliJ.

Compila y ejecuta

Asegúrate de que el conector JDBC esté en el classpath.

Corre la clase principal (Main o similar) desde tu IDE.

Uso
Inicia la aplicación.

Añade, edita o elimina productos desde la interfaz.

Simula compras agregando productos al carrito y procesando el pedido.

Consulta y manipula los registros directamente desde MySQL si lo deseas.
