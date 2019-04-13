package classificador;



/**
 *
 * @author valeria
 */
public class Grupo {
    private String cor;
    public double caracteristicas[];
    
    public Grupo(String cor, Double falaIdioma, Double tocaIntrumento, Double praticaEsporte){
        caracteristicas = new double[3];
        this.cor = cor;
        this.caracteristicas[0] = falaIdioma;
        this.caracteristicas[1] = tocaIntrumento;
        this.caracteristicas[2] = praticaEsporte;
    }
    
    public String getCor(){
        return cor;
    }
}
