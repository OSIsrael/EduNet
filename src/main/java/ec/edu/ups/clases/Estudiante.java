package ec.edu.ups.clases;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String cedula, String nombre, String apellido, String telefono, String correoElectronico, String carrera) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.carrera = carrera;
    }

    public Estudiante() {

    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tEstudiante{" +
                "\n\tcarrera='" + carrera + '\'' +
                '}';
    }
}
