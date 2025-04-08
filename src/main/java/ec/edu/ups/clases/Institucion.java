package ec.edu.ups.clases;

import ec.edu.ups.enums.TipoDireccion;

import java.util.List;

public class Institucion {
    private int id;
    private String nombre;
    private List<String> sedes;
    private Direccion direccion;
    private List<Asignacion> asignaciones;

    public Institucion() {
    }

    public Institucion(List<Asignacion> asignaciones, List<String> sedes, String nombre, int id) {
        this.asignaciones = asignaciones;
        this.sedes = sedes;
        this.nombre = nombre;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getSedes() {
        return sedes;
    }

    public void setSedes(List<String> sedes) {
        this.sedes = sedes;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void addDireccion(TipoDireccion tipoDireccion, String tipo, String callePricipal, String calleSecundaria, String numeracion, String ciudad, String provincia, String pais) {
        this.direccion = new Direccion(tipoDireccion,tipo,callePricipal,calleSecundaria,numeracion,ciudad,provincia,pais);
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sedes=" + sedes +
                ", direccion=" + direccion +
                ", asignaciones=" + asignaciones +
                '}';
    }
}
