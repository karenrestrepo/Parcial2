package co.edu.uniquindio.parcial2.model;

import co.edu.uniquindio.parcial2.Enum.TipoContrato;
import co.edu.uniquindio.parcial2.Enum.TipoEmpleado;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FicaUQ {
    private String nombre;

    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Tarea> listaTareas = new ArrayList<>();

    /*Constructor*/

    public FicaUQ() {
    }

    public FicaUQ(String nombre) {
        this.nombre = nombre;
    }

    /*Getters and setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTarea) {
        this.listaTareas = listaTarea;
    }

    /**
     * Método para crear un empleado
     *
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @param salario
     * @param numeroHorasTrabajo
     * @param tipoContrato
     * @param tipoEmpleado
     * @return
     */
    public boolean crearEmpleado(String nombre, String apellido, String cedula, int edad,
                                 double salario, int numeroHorasTrabajo, TipoContrato tipoContrato, TipoEmpleado tipoEmpleado){

        if(tipoEmpleado.equals(TipoEmpleado.ADMINISTRADOR)){
            Administrador administrador = new Administrador();
            administrador.setNombre(nombre);
            administrador.setApellido(apellido);
            administrador.setCedula(cedula);
            administrador.setEdad(edad);
            administrador.setSalario(salario);
            administrador.setNumeroHorasTrabajo(numeroHorasTrabajo);
            administrador.setTipoContrato((TipoContrato) tipoContrato);
            getListaEmpleados().add(administrador);
        }

        if(tipoEmpleado.equals(TipoEmpleado.JORNALERO)){
            Jornalero jornalero = new Jornalero();
            jornalero.setNombre(nombre);
            jornalero.setApellido(apellido);
            jornalero.setCedula(cedula);
            jornalero.setEdad(edad);
            jornalero.setSalario(salario);
            jornalero.setNumeroHorasTrabajo(numeroHorasTrabajo);
            jornalero.setTipoContrato((TipoContrato) tipoContrato);
            getListaEmpleados().add(jornalero);
        }

        if(tipoEmpleado.equals(TipoEmpleado.RECOLECTOR)){
            Recolector recolector = new Recolector();
            recolector.setNombre(nombre);
            recolector.setApellido(apellido);
            recolector.setCedula(cedula);
            recolector.setEdad(edad);
            recolector.setSalario(salario);
            recolector.setNumeroHorasTrabajo(numeroHorasTrabajo);
            recolector.setTipoContrato((TipoContrato) tipoContrato);
            getListaEmpleados().add(recolector);
        }









        return true;
    }


    /**
     * Método para mostrar un empleado
     */
    public void mostrarEmpleados() {
        for (Empleado miEmpleado : getListaEmpleados()) {
            System.out.println(miEmpleado.toString());


        }
    }

    /**
     * Método para mostrar el tipo empleado
     * @param valorTipo
     */
    public void mostrarTipoEmpleado(int valorTipo) {
        for (Empleado miEmpleado : getListaEmpleados()) {

            if (valorTipo == 1 && miEmpleado instanceof Administrador){
                System.out.println(miEmpleado.toString());
            }

            if (valorTipo == 2 && miEmpleado instanceof Jornalero){
                System.out.println(miEmpleado.toString());
            }

            if (valorTipo == 3 && miEmpleado instanceof Recolector){
                System.out.println(miEmpleado.toString());
            }
        }
    }

    public void crearTarea() {
    }

    /**
     * Método para crear tareas
     * @param numeroTarea
     * @param cedulaEmpleado
     */
    public void crearTarea(int numeroTarea, String cedulaEmpleado, Date fechaInicio, Date fechaFin) {
        Tarea tarea = new Tarea();
        tarea.setNumeroTarea(numeroTarea);
        tarea.setFechaInicio(fechaInicio);
        tarea.setFechaFin(fechaFin);

        Empleado empleado= obtenerEmpleado(cedulaEmpleado);
        if (empleado != null){
            tarea.setEmpleadoAsociado(empleado);
        }
        tarea.calcularDuracion();
        getListaTareas().add(tarea);
    }

    /** Método para obtener un empleado
     *
     * @param cedulaEmpleado
     * @return un empleado
     */
    private Empleado obtenerEmpleado(String cedulaEmpleado) {
        Empleado empleadoEncontrado = null;
        for (Empleado empleado : getListaEmpleados()) {
            if (empleado.getCedula().equals(cedulaEmpleado)){
                empleadoEncontrado = empleado;
                break;
            }
            
        }
        return empleadoEncontrado;
    }

    /**
     * Método para eliminar un cliente
     * @param cedulaEmpleado
     */
    public void eliminarCliente(String cedulaEmpleado) {
        Empleado empleadoEncontrado = obtenerEmpleado(cedulaEmpleado);
        if(empleadoEncontrado != null){
            getListaEmpleados().remove(empleadoEncontrado);
        }
    }

    public void actualizarEmpleado(String cedulaEmpleado) {
        Empleado empleadoEncontrado = obtenerEmpleado(cedulaEmpleado);
        if(empleadoEncontrado != null){
//            empleadoEncontrado.setNombre();
//            empleadoEncontrado.setApellido();
        }



//        for (Empleado empleado : getListaEmpleados()) {
//            if (empleado.getCedula().equals(cedulaEmpleado)) {
//                empleadoEncontrado = empleado;
//                getListaEmpleados().remove(empleadoEncontrado);
//                break;
//            }
//        }
    }
    @Override
    public String toString() {
        return "FicaUQ{" +
                "nombre='" + nombre + '\'' +
                '}';
    }



}
