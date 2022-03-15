package refactorJordi;

import java.util.Date;

/**
 *
 * @author jordi
 */
public class Barco{
//ASOCIACION DE COMPOSICIÓN CON CLASE 'Motor'
    
    //ATRIBUTOS PRIVADOS
    private String nombre;
    private Date fechaConstruccion;
    private int numCamarotes;
    private Motor motor;//objeto 'motor' de clase 'Motor'
    
    //CONSTRUCTOR VACIO

    /**
     *
     */
    public Barco(){
        //El objeto motor se inicializa en el constructor de la clase base, si se elimina la clase base 'Barco', el objeto 'motor' también.
        motor = new Motor();
    };
    
    //CONSTRUCTOR COMPLETO

    /**
     *
     * @param nombre
     * @param fechaConstruccion
     * @param numCamarotes
     * @param fabricante
     * @param potencia
     * @param codigo
     */
    public Barco(String nombre, Date fechaConstruccion, int numCamarotes, String fabricante, String potencia, int codigo){
        setNombre(nombre);
        setFechaConstruccion(fechaConstruccion);
        setNumCamarotes(numCamarotes);
        motor = new Motor(fabricante,potencia,codigo);
    };
    
    //Override toString()
    @Override
    public String toString(){
        return "[nombre: "+ this.nombre +"]\n"
                +"[Fecha Construccion: "+ this.fechaConstruccion +"]\n"
                +"[Numero Camarotes: "+ this.numCamarotes +"]\n"
                +"[Motor: "+ this.motor +"]\n";
    };
    
    //GETTERS && SETTERS

    /**
     *
     * @return
     */
    public String getNombre(){
        return this.nombre;
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
    public Date getFechaConstruccion(){
        return fechaConstruccion;
    };

    /**
     *
     * @param fechaConstruccion
     */
    public void setFechaConstruccion(Date fechaConstruccion){
        this.fechaConstruccion = fechaConstruccion;
    };
    
    /**
     *
     * @return
     */
    public int getNumCamarotes(){
        return numCamarotes;
    };

    /**
     *
     * @param numCamarotes
     */
    public void setNumCamarotes(int numCamarotes){
        this.numCamarotes = numCamarotes;
    };
    
    //

    /**
     *
     * @param sonido
     * @return
     */
    
};



