package ec.edu.ups.clases;

import java.util.List;

public class Administrativo extends Persona {
    private List<String> cargos;
    private List<String> responsabilidades;

    public Administrativo(String number, String cedula, String nombre, String apellido, String telefono, String correoElectronico) {
        super(cedula, nombre, apellido, telefono, correoElectronico);

    }

    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correoElectronico, List<String> responsabilidades, List<String> cargos) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.responsabilidades = responsabilidades;
        this.cargos = cargos;
    }

    public List<String> getCargos() {
        return cargos;
    }

    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(List<String> responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tAdministrativo{" +
                "\n\tcargos=" + cargos +
                "\n\t, responsabilidades=" + responsabilidades +
                '}';
    }
}
