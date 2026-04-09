package com.foxconn.debug.inventario;

public class Material {
    private String codigo;
    private String descripcion;
    private int cantidad;

    public Material(String codigo, String descripcion, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    @Override
    public String toString() {
        return codigo + " - " + descripcion + " (Cantidad: " + cantidad + ")";
    }
}
