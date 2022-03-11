
package refactoringPackage;

/**
 *
 * @author jordi
 */
public class Juguete {
    //ATRIBUTOS PRIVADOS
    private String nombre;
    private int precio;
    private int edadRecomendada;
    
    //CONSTRUCTOR VACIO

    /**
     *
     */
    public Juguete(){  
    };
    
    //CONSTRUCTOR COMPLETO

    /**
     *
     * @param nombre
     * @param precio
     * @param edadRecomendada
     */
    public Juguete(String nombre,int precio, int edadRecomendada){
        this.nombre = nombre;
        this.precio = precio;
        this.edadRecomendada = edadRecomendada;
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
    public int getPrecio(){
        return precio;
    };

    /**
     *
     * @param precio
     */
    public void setPrecio(int precio){
        this.precio = precio;
    };
    
    /**
     *
     * @return
     */
    public int getEdadRecomendada(){
        return edadRecomendada;
    };

    /**
     *
     */
    public void setEdadRecomendada(){
        this.edadRecomendada = edadRecomendada;
    };
    
    @Override
    public String toString(){
        return "\n [Nombre: "+ this.nombre +"]\n"
              +" [Precio: "+ this.precio +"]\n"
              +" [EdadRecomendada: "+ this.edadRecomendada +"]\n";
    }
};
