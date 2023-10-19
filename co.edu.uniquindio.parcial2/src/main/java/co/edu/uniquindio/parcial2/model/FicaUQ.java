package co.edu.uniquindio.parcial2.model;

import java.util.ArrayList;
import java.util.List;

public class FicaUQ {
    private String nombre;

    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Tarea> listaTarea = new ArrayList<>();

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

    public List<Tarea> getListaTarea() {
        return listaTarea;
    }

    public void setListaTarea(List<Tarea> listaTarea) {
        this.listaTarea = listaTarea;
    }

    @Override
    public String toString() {
        return "FicaUQ{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
