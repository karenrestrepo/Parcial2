package co.edu.uniquindio.parcial2.model;

import java.util.Date;

public class Tarea {
    private int numeroTarea;
    private Date fechaInicio;
    private Date fechaFin;
    private double duracionTarea;
    private String descripcion;
    FicaUQ ficaUQ;

    /*Constructor*/

    public Tarea() {
    }

    public Tarea(int numeroTarea, Date fechaInicio, Date fechaFin, double duracionTarea, String descripcion) {
        this.numeroTarea = numeroTarea;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracionTarea = duracionTarea;
        this.descripcion = descripcion;
    }

    /*Getters ans Setters*/

    public int getNumeroTarea() {
        return numeroTarea;
    }

    public void setNumeroTarea(int numeroTarea) {
        this.numeroTarea = numeroTarea;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getDuracionTarea() {
        return duracionTarea;
    }

    public void setDuracionTarea(double duracionTarea) {
        this.duracionTarea = duracionTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public FicaUQ getFicaUQ() {
        return ficaUQ;
    }

    public void setFicaUQ(FicaUQ ficaUQ) {
        this.ficaUQ = ficaUQ;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "numeroTarea=" + numeroTarea +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", duracionTarea=" + duracionTarea +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
