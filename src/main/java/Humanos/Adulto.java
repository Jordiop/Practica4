
package Humanos;

/**
 *
 * @author jordi
 */
public class Adulto extends Persona{
    //ATRIBUTOS PRIVADOS
    private String NSS;
    private String direccion;

    //CONSTRUCTOR COMPLETO PASANDO PARAMETROS (atributos de clase padre) A CONSTRUCTOR DE CLASE PADRE 'Persona' MEDIANTE 'super(attr1,attr2,attr3)

    /**
     *
     * @param NSS
     * @param direccion
     * @param nombre
     * @param DNI
     * @param edad
     */
    public Adulto(String NSS, String direccion, String nombre, String DNI, int edad){
        super(nombre,DNI,edad);
        setNSS(NSS);
        setDireccion(direccion);
    };
    
    //GETTERS && SETTERS

    /**
     *
     * @return
     */
    public String getNSS() {
        return NSS;
    };

    /**
     *
     * @param NSS
     */
    public void setNSS(String NSS) {
        this.NSS = NSS;
    };

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    };

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    };
    
    //Override 'toString'
    @Override
    public String toString(){
      return "[NSS: "+ this.NSS+"]\n"
            +"[direccion: "+ this.direccion +"]\n"
            +"[nombre: "+ this.getNombre() +"]\n"
            +"[DNI: "+ this.getDNI() +"]\n"
            +"[edad: "+ this.getEdad() +"]\n";
      //IMPRIMIR INFORMACIÓN DEL OBJETO REFERENCIANDO METODOS DE LA CLASE PADRE
    };
}
