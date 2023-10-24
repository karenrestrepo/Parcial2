package co.edu.uniquindio.parcial2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuentaTest {
    @Test
    void verificarCuenta(){
        Cuenta cuenta = new Cuenta();
        cuenta.setNombrePersona("oscar");
        String esperado = "oscar";
        String real = cuenta.getNombrePersona();
        assertEquals(esperado, real);
        assertTrue(real.equals("oscar"));

    }
}
