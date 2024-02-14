
import java.util.ArrayList;
import java.util.List;


public class Materia {
    private String nombre;
    private String codigo;
    private int capacidadMaxima;
    private boolean estadoApertura;
    private boolean esHabilitable;
    private List<Estudiante> estudiantes;

    public Materia(String nombre, String codigo, int capacidadMaxima, boolean estadoApertura, boolean esHabilitable) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.capacidadMaxima = capacidadMaxima;
        this.estadoApertura = estadoApertura;
        this.esHabilitable = esHabilitable;
        this.estudiantes=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public boolean isEstadoApertura() {
        return estadoApertura;
    }

    public void setEstadoApertura(boolean estadoApertura) {
        this.estadoApertura = estadoApertura;
    }

    public boolean isEsHabilitable() {
        return esHabilitable;
    }

    public void setEsHabilitable(boolean esHabilitable) {
        this.esHabilitable = esHabilitable;
    }
    
    public void agregarEstudiante (Estudiante estudiante){ //este metodo agrega estudiantes a la lista
        estudiantes.add(estudiante);
    }
    
    public double calcularPromedio(){
        double sumaCalificaciones=0;
        int cantidadEstudiantes=estudiantes.size();
        for(Estudiante estudiante: estudiantes){
            sumaCalificaciones+=estudiante.calcularPromedioPorMateria(this.nombre);
        }
        return cantidadEstudiantes>0?sumaCalificaciones/cantidadEstudiantes:0; //se usa operador ternario
    }
    
}
