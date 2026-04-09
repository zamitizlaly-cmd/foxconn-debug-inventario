package com.foxconn.debug.inventario;

import java.util.HashMap;
import java.util.Map;

public class InventarioService {
    private Map<String, Material> inventario = new HashMap<>();

    public void registrarEntrada(Material material) {
        inventario.put(material.getCodigo(), material);
        System.out.println("Entrada registrada: " + material);
    }

    public void registrarSalida(String codigo, int cantidad) {
        Material material = inventario.get(codigo);
        if (material != null && material.getCantidad() >= cantidad) {
            material.setCantidad(material.getCantidad() - cantidad);
            System.out.println("Salida registrada: " + cantidad + " de " + material.getDescripcion());
        } else {
            System.out.println("Error: material no encontrado o cantidad insuficiente.");
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventario actual:");
        for (Material m : inventario.values()) {
            System.out.println(m);
        }
    }
}
