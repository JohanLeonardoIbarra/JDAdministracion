
/**
 * Write a description of class Propiedad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Propiedad
{
    private String nombre;
    private String propietario;
    private Double area;
    private Integer habitantes;
    private Boolean descPago = false, descPlataforma = false; 
    
    public Propiedad(String nombre,String propietario, Double area, 
    Integer habitantes ){

        this.nombre=nombre;
        this.propietario=propietario;
        this.area=area;
        this.habitantes=habitantes;        

    }

    //Start GetterSetterExtension Code
    /**Getter method nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Setter method nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Getter method propietario*/
    public String getPropietario(){
        return this.propietario;
    }//end method getPropietario

    /**Setter method propietario*/
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }//end method setPropietario

    /**Getter method area*/
    public Double getArea(){
        return this.area;
    }//end method getArea

    /**Setter method area*/
    public void setArea(Double area){
        this.area = area;
    }//end method setArea

    /**Getter method habitantes*/
    public Integer getHabitantes(){
        return this.habitantes;
    }//end method getHabitantes

    /**Setter method habitantes*/
    public void setHabitantes(Integer habitantes){
        this.habitantes = habitantes;
    }//end method setHabitantes

    /**Getter method descPago*/
    public Boolean getDescPago(){
        return this.descPago;
    }//end method getDescPago

    /**Setter method descPago*/
    public void setDescPago(Boolean descPago){
        this.descPago = descPago;
    }//end method setDescPago

    /**Getter method descPlataforma*/
    public Boolean getDescPlataforma(){
        return this.descPlataforma;
    }//end method getDescPlataforma

    /**Setter method descPlataforma*/
    public void setDescPlataforma(Boolean descPlataforma){
        this.descPlataforma = descPlataforma;
    }//end method setDescPlataforma

    public Double calcular()
    {
        Double pago = 0.0;
        
        if(area <= 120)
        {
            pago = 107000.00;
        }
        else if (area <= 250)
        {
            pago = 155000.00;
        }
        else if (area <= 320)
        {
            pago = 222916.67;
        }
        else {pago = 285333.33;}
        
        if(descPago == true){pago -= pago * 0.05;}
        if(descPlataforma == true){pago -= pago * 0.10;}
        
        return pago;
    }
}
