import java.util.ArrayList;
import java.util.List;
import java.io.*;
/**
 * Write a description of class ServicioG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ServicioG implements Serializable
{
    List <Propiedad> propiedades;
    
    ServicioG()
    {
        propiedades = new ArrayList<Propiedad>();
    }

    public List<Propiedad> getPropiedades()
    {
        return propiedades;
    }   

    
}
