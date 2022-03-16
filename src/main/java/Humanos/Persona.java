
package Humanos;

/**
 *
 * @author jordi
 */
public abstract class Persona {
//SUPER-CLASE 'Persona' DE CLASES HIJAS 'Niño' y 'Adulto'
    
    //ATRIBUTOS PRIVADOS
    private String nombre;
    private String DNI;
    private int edad;
    
    //CONSTRUCTOR VACIO

    /**
     *
     */
    public Persona(){  
    };
    //CONSTRUCTOR COMPLETO

    /**
     *
     * @param nombre
     * @param DNI
     * @param edad
     */
    public Persona(String nombre, String DNI, int edad){
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    };
    
    //Overrride 'toString()' IMPRIMIR INFORMACIÓN OBJETO
    @Override
    public String toString(){
      return getClass().getName()
              +"\n[nombre: "+ this.nombre +"]\n"
              +"[DNI: "+ this.DNI +"]\n"
              +"[edad: "+ this.edad + "]";
    };
    
    //GETTERS/SETTERS
    //ATTR. nombre

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
    
    //ATTR. DNI

    /**
     *
     * @return
     */
    public String getDNI(){
        return DNI;
    };

    /**
     *
     * @param DNI
     */
    public void setDNI(String DNI){
        this.DNI = DNI;
    };
    
    //ATTR. edad

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


