
package refactorJordi;

import p.practica3.diagramaclases.Mascota;
import p.practica3.diagramaclases.Mascota;

/**
 *
 * @author jordi
 */
public class Perro extends Mascota{
    private String raza;
    
    /**
     *
     */
    public Perro(){
    };
    
    /**
     *
     * @param raza
     * @param nombre
     * @param edad
     */
    public Perro(String raza, String nombre, int edad){
        super(nombre,edad);
        setRaza(raza);
    };
    
    @Override
    public String toString(){
        return getClass().getSimpleName()+
                "\n[Nombre: "+ this.getNombre() +"]\n"+
                "[Edad: "+ this.getEdad() +"]\n"+
                "[Raza: "+ this.raza +"]\n";
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
    public String sonido(String sonido){
      return "El perro suele hacer el siguiente sonido: " + sonido;  
    };
};
