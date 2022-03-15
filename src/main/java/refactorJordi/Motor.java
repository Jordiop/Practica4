
package refactorJordi;

/**
 *
 * @author jordi
 */
public class Motor{
    private String fabricante;
    private String potencia;
    private int codigo;
    
    /**
     *
     */
    public Motor(){  
    };
    
    /**
     *
     * @param fabricante
     * @param potencia
     * @param codigo
     */
    public Motor(String fabricante, String potencia, int codigo){
        setFabricante(fabricante);
        setPotencia(potencia);
        setCodigo(codigo);
    };
    
    @Override
    public String toString(){
        return getClass().getSimpleName()+
                "\n [Fabricante: "+ this.fabricante +"]\n"
               +" [Potencia: "+ this.potencia +"]\n"
               +" [Codigo: "+ this.codigo +"]\n";
    };
    
    /**
     *
     * @return
     */
    public String getFabricante(){
        return fabricante;
    };

    /**
     *
     * @param fabricante
     */
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    };
    
    /**
     *
     * @return
     */
    public String getPotencia(){
        return potencia;
    };

    /**
     *
     * @param potencia
     */
    public void setPotencia(String potencia){
        this.potencia = potencia;
    };
    
    /**
     *
     * @return
     */
    public int getCodigo(){
        return codigo;
    };

    /**
     *
     * @param codigo
     */
    public void setCodigo(int codigo){
        this.codigo = codigo;
    };
};

