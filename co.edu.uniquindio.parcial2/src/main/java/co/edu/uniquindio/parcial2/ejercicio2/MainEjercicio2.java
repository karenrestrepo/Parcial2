package co.edu.uniquindio.parcial2.ejercicio2;

import co.edu.uniquindio.parcial2.model.FicaUQ;

public class MainEjercicio2 {
    public static void main(String[] args) {
        FicaUQ ficaUQ = inicializarDatosPrueba();

        crearEmpleado("Ana", "Marín", "1010550",
                21, 1160000.0, 8, ficaUQ);
        crearEmpleado("Sara", "Mora", "1010544",
                21, 1160000.0, 8, ficaUQ);

    }

    private static void crearEmpleado(String nombre, String apellido, String cedula, int edad,
                                      double salario, int numeroHorasTrabajo, FicaUQ ficaUQ) {
    }

    private static FicaUQ inicializarDatosPrueba() {
        FicaUQ ficaUQ = new FicaUQ();
        ficaUQ.setNombre("Finca");
        return ficaUQ;
    }
}
