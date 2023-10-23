package co.edu.uniquindio.parcial2.ejercicio2;

import co.edu.uniquindio.parcial2.Enum.TipoContrato;
import co.edu.uniquindio.parcial2.model.FicaUQ;

public class MainEjercicio2 {
    public static void main(String[] args) {
        FicaUQ ficaUQ = inicializarDatosPrueba();

        /*Crear Empleado*/
        crearEmpleado("Ana", "Marín", "1010550",
                21, 1160000.0, 8, TipoContrato.HORAS, ficaUQ);
        crearEmpleado("Sara", "Mora", "1010544",
                18, 1160000.0, 8, TipoContrato.MEDIO_TIEMPO, ficaUQ);
        crearEmpleado("Luz", "Perez", "1010564",
                30, 1160000.0, 8, TipoContrato.MEDIO_TIEMPO, ficaUQ);

        /*Mostrar empleados*/
        ficaUQ.mostrarEmpleados();

        /*Mostrar empleados de un tipo*/
        ficaUQ.mostrarTipoEmpleado(1);

        /*Eliminar empleado*/
        eliminarEmpleado(ficaUQ, "1010544");
        System.out.println("----> Información luego de eliminar: ");
        ficaUQ.mostrarEmpleados();

        /*Actualizar cliente*/
        actualizarEmpleado(ficaUQ, "1010550");

        /*Tarea*/
        ficaUQ.crearTarea(1, "1010550");
    }



    private static void crearEmpleado(String nombre, String apellido, String cedula, int edad,
                                      double salario, int numeroHorasTrabajo, Enum tipoContrato, FicaUQ ficaUQ) {
        ficaUQ.crearEmpleado(nombre,apellido, cedula, edad, salario, numeroHorasTrabajo, tipoContrato);
    }

    private static FicaUQ inicializarDatosPrueba() {
        FicaUQ ficaUQ = new FicaUQ();
        ficaUQ.setNombre("Finca");
        return ficaUQ;
    }
    private static void eliminarEmpleado(FicaUQ ficaUQ, String cedulaEmpleado) {
        ficaUQ.eliminarCliente(cedulaEmpleado);
    }

    private static void actualizarEmpleado(FicaUQ ficaUQ, String cedulaEmpleado) {
        ficaUQ.actualizarEmpleado(cedulaEmpleado);
    }
}
