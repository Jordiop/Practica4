
package Humanos;

/**
 *
 * @author jordi
 */
public class Niño extends Persona{
//CLASE HIJA 'Niño' DE SUPER-CLASE 'Persona'
//ASOCIACION DE AGREGACIÓN CON CLASE 'Juguete'
    
    //ATRIBUTOS PRIVADOS
    private String colegio;
    private Juguete juguete;//ATTR. 'juguete' DE CLASE 'Juguete'
    
    //CONSTRUCTOR VACIO

    /**
     *
     */
    public Niño(){  
    };
    //CONSTRUCTOR COMPLETO

    /**
     *
     * @param colegio
     * @param nombre
     * @param DNI
     * @param edad
     */
    public Niño(String colegio,String nombre, String DNI, int edad){
        super(nombre,DNI,edad);
        setColegio(colegio);
    };
    
    //OBJETO JUGUETE ES CREADO A PARTIR DEL METODO ENSAMBLADOR
    //RICIBIENDO POR PARAMETRO UN OBJETO DE CLASE 'Juguete'

    /**
     *
     * @param juguete
     */
    public void ensamblador(Juguete juguete){
        this.juguete = juguete;
    }
    
    //Override 'toString'
    @Override
    public String toString(){
      return "[colegio: "+ this.colegio +"]\n"
            +"[nombre: "+ this.getNombre() +"]\n"
            +"[DNI: "+ this.getDNI() +"]\n"
            +"[edad: "+ this.getEdad() +"]\n"
            +"[Juguete: "+ this.juguete +"]\n";
    };
    
    //GETTERS/SETTERS

    /**
     *
     * @return
     */
    public String getColegio(){
        return colegio;
    };

    /**
     *
     * @param colegio
     */
    public void setColegio(String colegio){
        this.colegio = colegio;
    };
};
