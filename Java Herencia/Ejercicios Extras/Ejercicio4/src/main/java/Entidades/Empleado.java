package Entidades;

public class Empleado extends Persona {

    private Integer anioIncorporacion;
    private Integer numeroDespachoAsignado;

    public Empleado() {
    }

    public Empleado(Integer anioIncorporacion, Integer numeroDespachoAsignado, String nombre, String apellido, Integer numeroIdentificacion, String estadoCivil) {
        super(nombre, apellido, numeroIdentificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespachoAsignado = numeroDespachoAsignado;
    }

    public Integer getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(Integer anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public Integer getNumeroDespachoAsignado() {
        return numeroDespachoAsignado;
    }

    public void setNumeroDespachoAsignado(Integer numeroDespachoAsignado) {
        this.numeroDespachoAsignado = numeroDespachoAsignado;
    }

    public void crearEmpleado() {
        
        crearPersona();

        System.out.println("Ingrese su año de incorporación");

        anioIncorporacion = leer.nextInt();

        System.out.println("Ingrese el numero de despacho que fue asignado");

        this.numeroDespachoAsignado = leer.nextInt();

    }

    @Override
    public String toString() {
        return super.toString() + "\nEmpleado"
                + "\nAño de incorporación: " + anioIncorporacion
                + "\nNumero de despacho asignado : " + numeroDespachoAsignado ;
    }

}
