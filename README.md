# foxconn-debug-inventario
Sistema de control de inventarios en tiempo real para área DEBUG de FOXCONN GDL
# Sistema de Control de Inventarios en Tiempo Real - FOXCONN GDL (Área DEBUG)

## 📌 Descripción
Este proyecto implementa una aplicación de control de inventarios en tiempo real para el área DEBUG de FOXCONN Guadalajara.  
El sistema busca reducir errores en el registro manual, optimizar recursos y mejorar la trazabilidad de materiales mediante escaneo QR/RFID y dashboards actualizados.

---

## 🎯 Objetivos
- Registro automatizado de movimientos de materiales.
- Consulta en tiempo real de inventarios.
- Generación de reportes automáticos (PDF/Excel).
- Roles de usuario con trazabilidad y seguridad.
- Escalabilidad hacia otras áreas de FOXCONN en fases posteriores.

---

## 🗂️ Arquitectura
- **Backend**: Java (MVC/DAO).
- **Base de datos**: MySQL/PostgreSQL.
- **Frontend**: Web/Móvil con dashboard.
- **Hardware**: Lectores QR/RFID.
- **CI/CD**: Travis-CI o Drone para pruebas automáticas.

---

## 🚀 Flujo de trabajo en Git
- Branches principales:
  - `master` → versión estable (GA).
  - `develop` → código en desarrollo (Beta).
- Cada requerimiento se desarrolla en un **branch único**:
  - Ejemplo: `feature/registro-movimientos`
- Integración a `develop` mediante **Pull Request**.
- Merge final a `master` al concluir milestone GA.

---

## 📌 Milestones
### Beta
- Configuración de base de datos.
- Gestión de usuarios y roles.
- Autenticación segura.
- Registro de movimientos con QR/RFID.
- CI/CD básico con pruebas unitarias (JUnit).

### General Availability (GA)
- Dashboard en tiempo real.
- Alertas de faltantes/exceso.
- Reportes automáticos.
- Optimización de base de datos.
- Documentación final y entrega.

---

## 🧪 Pruebas
- Framework: JUnit.
- Ejecución automática en CI/CD.
- Pruebas unitarias en cada módulo.
- Pruebas de integración en milestone GA.

---

## 📖 Documentación
- `/docs/arquitectura.md` → Detalles de servidores, BD, frontend y roles.
- `/docs/requerimientos.md` → Especificación de requerimientos y dependencias.
- `/docs/manual-tecnico.md` → Instrucciones de instalación y uso.

---

## ⚠️ Exclusiones (Primera versión)
- No incluye balanceo de carga ni alta disponibilidad.
- No contempla integración con SSO corporativo.
- No cubre reportes personalizados complejos.
- No incluye pruebas de estrés extremo.

---

## 👥 Contribución
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/zamitizlaly-cmd/foxconn-debug-inventario.git
