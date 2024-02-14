
public class Estudiante extends Persona {
    private int edad;
    
    public Estudiante(String nombre, String apellidos, String numeroIdentificacion, int edad){
        super(nombre, apellidos, numeroIdentificacion);
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double calcularPromedioPorMateria(String nombreMateria){
        double sumaCalificaciones=0;
        int cantidadCalificaciones=0;
        
        for(calificacion.getMateria().equals(nombreMateria)){
            sumaCalificaciones+=calificacion.getValor();
            cantidadCalificaciones++;
        }
        return cantidadCalificaciones>0?sumaCalificaciones/cantidadCalificaciones:0;
    }
    
    
}
