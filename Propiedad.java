
/**
 * Write a description of class Propiedad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Propiedad
{
    Boolean descProntoPago, descPlataforma;
    String nombre;
    String propietario;
    Double area;
    Integer habitantes;
    
    Propiedad(String nombre, String propietario, Double area, Integer habitantes)
    {
        this.nombre = nombre;
        this.propietario = propietario;
        this.area = area;
        this.habitantes = habitantes;
    }
    
    
}
