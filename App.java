package com.foxconn.debug.inventario;

public class App {
    public static void main(String[] args) {
        System.out.println("Sistema de Inventario en Tiempo Real - FOXCONN DEBUG");
        
        // Inicializar servicio de inventario
        InventarioService inventario = new InventarioService();
        
        // Ejemplo de registro de material
        Material m1 = new Material("CPU-123", "Procesador defectuoso", 10);
        inventario.registrarEntrada(m1);
        
        // Mostrar inventario actual
        inventario.mostrarInventario();
    }
}
