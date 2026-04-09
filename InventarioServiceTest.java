package com.foxconn.debug.inventario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventarioServiceTest {

    @Test
    public void testRegistrarEntrada() {
        InventarioService service = new InventarioService();
        Material m = new Material("CPU-123", "Procesador defectuoso", 5);
        service.registrarEntrada(m);

        assertEquals(5, service.getInventario().get("CPU-123").getCantidad());
    }
}
