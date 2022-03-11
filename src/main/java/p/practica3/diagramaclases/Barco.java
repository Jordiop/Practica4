
package p.practica3.diagramaclases;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jordi
 */
public class Barco{
//ASOCIACION DE COMPOSICIÓN CON CLASE 'Motor'
    
    //ATRIBUTOS PRIVADOS
    private String nombre;
    private Date fechaConstruccion = new Date();
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
    public Barco(String nombre, String fechaConstruccion, int numCamarotes, String fabricante, String potencia, int codigo){
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
    public void setFechaConstruccion(String fechaConstruccion){
        //parser de String a Date
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        Date fecha = new Date();
        try {
            fecha = formato.parse(fechaConstruccion);
        } catch (ParseException ex) {
            Logger.getLogger(Barco.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.fechaConstruccion = fecha;
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
    
    public String sonido(String sonido){
        return "El sonido del motor es "+sonido;
    }
};



