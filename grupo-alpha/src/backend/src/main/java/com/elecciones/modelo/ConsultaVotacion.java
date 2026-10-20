package backend.src.main.java.com.elecciones.modelo;


/**
 * Implementación de la Historia de Usuario HU-01: Consulta de Puesto y Mesa de Votación.
 * Basado en el modelo UML del sistema electoral (Clases: Ciudadano, PuestoVotacion, MesaVotacion).
 */
public class ConsultaVotacion {

    // Simulación de entidades del modelo UML
    public static class Ciudadano {
        private String cedula;
        private String nombre;
        private String apellido;

        public Ciudadano(String cedula, String nombre, String apellido) {
            this.cedula = cedula;
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public String getCedula() { return cedula; }
        public String getNombreCompleto() { return nombre + " " + apellido; }
    }

    public static class PuestoVotacion {
        private String idPuesto;
        private String nombre;
        private String direccion;

        public PuestoVotacion(String idPuesto, String nombre, String direccion) {
            this.idPuesto = idPuesto;
            this.nombre = nombre;
            this.direccion = direccion;
        }

        public String getNombre() { return nombre; }
        public String getDireccion() { return direccion; }
    }

    // Método principal para cumplir con la HU-01: Consultar puesto y mesa asignada por cédula
    public void consultarAsignacionVotacion(String cedulaBuscada) {
        // Simulación de consulta al sistema electoral
        System.out.println("=== CONSULTA DE PUESTO Y MESA DE VOTACIÓN (HU-01) ===");
        
        if ("123456789".equals(cedulaBuscada)) {
            Ciudadano ciudadano = new Ciudadano("123456789", "Esteban", "Cantillo");
            PuestoVotacion puesto = new PuestoVotacion("P001", "Colegio Nacional Simón Bolívar", "Calle 10 # 5-20");
            int numeroMesa = 4;

            System.out.println("Ciudadano: " + ciudadano.getNombreCompleto() + " (Cédula: " + ciudadano.getCedula() + ")");
            System.out.println("Puesto de Votación: " + puesto.getNombre());
            System.out.println("Dirección: " + puesto.getDireccion());
            System.out.println("Mesa Asignada: N° " + numeroMesa);
        } else {
            System.out.println("Ciudadano no encontrado en el censo electoral.");
        }
    }

    // Método main para pruebas locales
    public static void main(String[] args) {
        ConsultaVotacion consulta = new ConsultaVotacion();
        consulta.consultarAsignacionVotacion("123456789");
    }
}
