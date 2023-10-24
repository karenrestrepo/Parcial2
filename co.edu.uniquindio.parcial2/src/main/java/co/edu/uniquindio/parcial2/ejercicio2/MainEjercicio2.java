package co.edu.uniquindio.parcial2.ejercicio2;

import co.edu.uniquindio.parcial2.Enum.TipoContrato;
import co.edu.uniquindio.parcial2.Enum.TipoEmpleado;
import co.edu.uniquindio.parcial2.model.Administrador;
import co.edu.uniquindio.parcial2.model.FicaUQ;
import co.edu.uniquindio.parcial2.model.Jornalero;
import co.edu.uniquindio.parcial2.model.Recolector;

import java.time.LocalDate;
import java.util.Date;

public class MainEjercicio2 {
    public static void main(String[] args) {
        FicaUQ ficaUQ = inicializarDatosPrueba();

        /*Crear Empleado*/
        crearEmpleado(
                "Ana",
                "Marín",
                "1010550",
                21,
                1160000.0,
                8,
                TipoContrato.HORAS,
                ficaUQ,
                TipoEmpleado.ADMINISTRADOR);
        crearEmpleado("Sara", "Mora", "1010544",
                18, 1160000.0, 8, TipoContrato.MEDIO_TIEMPO, ficaUQ, TipoEmpleado.RECOLECTOR);
        crearEmpleado("Luz", "Perez", "1010564",
                30, 1160000.0, 8, TipoContrato.MEDIO_TIEMPO, ficaUQ, TipoEmpleado.JORNALERO);

        /*Mostrar empleados*/
        ficaUQ.mostrarEmpleados();

        /*Mostrar empleados de un tipo*/
        ficaUQ.mostrarTipoEmpleado(1);

        /*Eliminar empleado*/
//        eliminarEmpleado(ficaUQ, "1010544");
//        System.out.println("----> Información luego de eliminar: ");
//        ficaUQ.mostrarEmpleados();
//
//        /*Actualizar cliente*/
//        actualizarEmpleado(ficaUQ, "1010550");

        /*Tarea*/
        Date fechaInicio = new Date(23,10,23, 18,00);
        Date fechaFin = new Date(23,10,24, 17,00);
        ficaUQ.crearTarea(1, "1010550", fechaInicio, fechaFin);
    }



    private static void crearEmpleado(String nombre, String apellido, String cedula, int edad,
                                      double salario, int numeroHorasTrabajo, TipoContrato tipoContrato, FicaUQ ficaUQ, TipoEmpleado tipoEmpleado) {
        ficaUQ.crearEmpleado(nombre,apellido, cedula, edad, salario, numeroHorasTrabajo, tipoContrato, tipoEmpleado);
    }

    private static FicaUQ inicializarDatosPrueba() {
        FicaUQ ficaUQ = new FicaUQ();
        ficaUQ.setNombre("Finca");
//        Administrador administrador = new Administrador();
//        administrador.setNombre(nombre);
//        administrador.setApellido(apellido);
//        administrador.setCedula(cedula);
//        administrador.setEdad(edad);
//        administrador.setSalario(salario);
//        administrador.setNumeroHorasTrabajo(numeroHorasTrabajo);
//        administrador.setTipoContrato((TipoContrato) tipoContrato);
//
//        Jornalero jornalero = new Jornalero();
//        jornalero.setNombre(nombre);
//        jornalero.setApellido(apellido);
//        jornalero.setCedula(cedula);
//        jornalero.setEdad(edad);
//        jornalero.setSalario(salario);
//        jornalero.setNumeroHorasTrabajo(numeroHorasTrabajo);
//        jornalero.setTipoContrato((TipoContrato) tipoContrato);
//
//        Recolector recolector = new Recolector();
//        recolector.setNombre(nombre);
//        recolector.setApellido(apellido);
//        recolector.setCedula(cedula);
//        recolector.setEdad(edad);
//        recolector.setSalario(salario);
//        recolector.setNumeroHorasTrabajo(numeroHorasTrabajo);
//        recolector.setTipoContrato((TipoContrato) tipoContrato);
//
//        getListaEmpleados().add(administrador);
//        getListaEmpleados().add(jornalero);
//        getListaEmpleados().add(recolector);
        return ficaUQ;
    }
    private static void eliminarEmpleado(FicaUQ ficaUQ, String cedulaEmpleado) {
        ficaUQ.eliminarCliente(cedulaEmpleado);
    }

    private static void actualizarEmpleado(FicaUQ ficaUQ, String cedulaEmpleado) {
        ficaUQ.actualizarEmpleado(cedulaEmpleado);
    }
}
