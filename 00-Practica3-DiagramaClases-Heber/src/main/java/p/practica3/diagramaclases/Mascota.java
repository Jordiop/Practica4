
package p.practica3.diagramaclases;

/**
 *
 * @author jordi
 */
public abstract class Mascota {
//SUPER-CLASE DE CLASES HIJAS 'Perro' y 'Gato'
    
    //ATRIBUTOS
    private String nombre;
    private int edad;
    
    //CONSTRUCTORES

    /**
     *
     */
    public Mascota(){  
    };
    
    /**
     *
     * @param nombre
     * @param edad
     */
    public Mascota(String nombre, int edad){
        setNombre(nombre);
        setEdad(edad);
    };
    
    //SOBRE-ESCRIBIR METODO toString
    @Override
    public String toString(){
        return getClass().getSimpleName()+
                "[Nombre: "+ this.nombre +"]\n"+
                "[Edad: "+ this.edad +"]";
    };
    
    //GETTERS && SETTERS

    /**
     *
     * @return
     */
    public String getNombre(){
        return nombre;
    };

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    };
    
    /**
     *
     * @return
     */
    public int getEdad(){
        return edad;
    };

    /**
     *
     * @param edad
     */
    public void setEdad(int edad){
        this.edad = edad;
    };
};
