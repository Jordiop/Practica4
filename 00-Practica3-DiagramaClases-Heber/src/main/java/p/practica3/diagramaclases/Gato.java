
package p.practica3.diagramaclases;

/**
 *
 * @author jordi
 */
public class Gato extends Mascota implements Sonido{
    private String raza;
    
    /**
     *
     */
    public Gato(){    
    };
    
    /**
     *
     * @param nombre
     * @param edad
     * @param raza
     */
    public Gato(String nombre, int edad, String raza){
        super(nombre,edad);
        setRaza(raza);
    };
    
    @Override
    public String toString(){
        return getClass().getSimpleName()+
                "\n[Nombre "+ this.getNombre() +"]\n"+
                "[Edad "+ this.getEdad() +"]\n"+
                "[Raza "+ this.raza +"]\n";
    };
    
    /**
     *
     * @return
     */
    public String getRaza(){
        return raza;
    };

    /**
     *
     * @param raza
     */
    public void setRaza(String raza){
        this.raza = raza;
    };
    
    //IMPLEMENTACION METODO DE INTERFAZ 'Sonido'

    /**
     *
     * @param sonido
     * @return
     */
    @Override
    public String sonido(String sonido){
      return "El gato suele hacer el siguiente sonido: " + sonido;  
    };
};
