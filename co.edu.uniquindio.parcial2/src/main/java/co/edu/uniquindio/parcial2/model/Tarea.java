package co.edu.uniquindio.parcial2.model;

import java.util.Date;

public class Tarea {
    private int numeroTarea;
    private Date fechaInicio;
    private Date fechaFin;
    private long duracionTarea;
    private String descripcion;
    private Empleado empleadoAsociado;
    FicaUQ ownedByFicaUQ;

    /*Constructor*/

    public Tarea() {
    }

    public Tarea(int numeroTarea, Date fechaInicio, Date fechaFin, long duracionTarea, String descripcion) {
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

    public void setDuracionTarea(long duracionTarea) {
        this.duracionTarea = duracionTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public FicaUQ getFicaUQ() {
        return ownedByFicaUQ;
    }

    public void setFicaUQ(FicaUQ ficaUQ) {
        this.ownedByFicaUQ = ficaUQ;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }

    public FicaUQ getOwnedByFicaUQ() {
        return ownedByFicaUQ;
    }

    public void setOwnedByFicaUQ(FicaUQ ownedByFicaUQ) {
        this.ownedByFicaUQ = ownedByFicaUQ;
    }

    public void calcularDuracion(){
        long duracionMili = 0L;
        if (fechaInicio != null && fechaFin != null) {
            duracionMili = fechaFin.getTime() - fechaInicio.getTime();
            duracionTarea = convertirMinutos(duracionMili);
        } else {
            duracionTarea = 0;
        }
    }

    private long convertirMinutos(long duracionMili) {
        long duracionMinutos = 0L;
        duracionMinutos = duracionMili / 60000;
        return duracionMinutos;
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
