package ec.edu.ups.clases;

import ec.edu.ups.enums.Rol;
import ec.edu.ups.enums.TipoDireccion;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // INSTITUCION 1
        Institucion institucion = new Institucion();
        institucion.setId(1);
        institucion.setNombre("UNIVERSIDAD POLITECNICA SALESIANA");
        List<String> sedes = new ArrayList<>();
        sedes.add("CUENCA");
        institucion.setSedes(sedes);
        institucion.addDireccion(TipoDireccion.INSTITUCION, "Edificio", "Calle Vieja", "Elia Liut", "4-56", "Cuenca", "Azuay", "Ecuador");

        // INSTITUCION 2
        Institucion institucion2 = new Institucion();
        institucion2.setId(2);
        institucion2.setNombre("UNIVERSIDAD POLITECNICA SALESIANA");
        List<String> sedes2 = new ArrayList<>();
        sedes2.add("GUAYAQUIL");
        institucion2.setSedes(sedes2);
        institucion2.addDireccion(TipoDireccion.INSTITUCION, "EDIFICIO", "Gral. Francisco Robles", "Otra calle", "107", "Guayaquil", "Guayas", "Ecuador");

        // PERSONAS
        //ESTUDIANTE
        Estudiante estudiante = new Estudiante("0107551566", "Israel", "Orellana", "0999314920", "iorellanas1@est.ups.edu.ec", "Computación");
        estudiante.addDireccion(new Direccion(TipoDireccion.CASA, "Casa", "Huancavilcas", "Colorados", "1-23", "Cuenca", "Azuay", "Ecuador"));
        //DOCENTE
        Docente docente = new Docente("0605040302", "Juan", "Perez", "0987654320", "juan@edu.com",
                List.of("Licenciatura en Matemáticas", "Maestría en Educación"),
                List.of("Matemáticas", "Estadística"));
        docente.addDireccion(new Direccion(TipoDireccion.TRABAJO, "Oficina", "Av. C", "Calle D", "202", "Quito", "Pichincha", "Ecuador"));
        // ADMINISTRATIVO
        Administrativo administrativo = new Administrativo("1111222233", "Einar", "Kaalhus", "0777777777", "larss@ups.edu.ec",
                List.of("Reporte Mensual", "Ajuste de cuentas"),
                List.of("Director de carrera de Computación", "Rector de Posgrados"));
        administrativo.addDireccion(new Direccion(TipoDireccion.TRABAJO, "Oficina", "Av. Sucre", "Calle Larga", "303", "Cuenca", "Azuay", "Ecuador"));
        // VISITANTE
        Visitante visitante = new Visitante("010100101001", "Fernando", "Martínez", "09123453213232", "fer@gmail.com", "Pedir información",
                new GregorianCalendar(2025, Calendar.APRIL, 9),
                new GregorianCalendar(2025, Calendar.AUGUST, 3));
        visitante.addDireccion(new Direccion(TipoDireccion.TRABAJO, "Oficina", "Av. Don Bosco", "Felipe Segundo", "303", "Cuenca", "Azuay", "Ecuador"));

        // ASIGNACIONES
        Asignacion asignacionEst = new Asignacion(estudiante, new GregorianCalendar(2024, Calendar.SEPTEMBER, 17), Rol.ESTUDIANTE);
        Asignacion asignacionDoc = new Asignacion(docente, new GregorianCalendar(2019, Calendar.JULY, 6), Rol.DOCENTE);
        institucion.setAsignaciones(Arrays.asList(asignacionEst, asignacionDoc));

        Asignacion asignacionAdm = new Asignacion(administrativo, new GregorianCalendar(2015, Calendar.AUGUST, 8), Rol.ADMINISTRATIVO);
        Asignacion asignacionVis = new Asignacion(visitante, new GregorianCalendar(2025, Calendar.APRIL, 9), Rol.VISITANTE);
        institucion2.setAsignaciones(Arrays.asList(asignacionAdm, asignacionVis));

        // IMPRIMIR
        System.out.println("===== INSTITUCIÓN 1 =====");
        System.out.println(institucion);
        System.out.println("\n===== INSTITUCIÓN 2 =====");
        System.out.println(institucion2);
    }
}
