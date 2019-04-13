
package classificador;

import static java.lang.Math.sqrt;
import java.util.List;

/**
 *
 * @author valeria
 */
public class Classificador {
        
    public static String classificador(List<Grupo>grupos, double caracteristicas[]){
        double valor = 0.0;
        double menorValor = 1000000;
        String  rotulo = null;
        
        for(int i=0; i<grupos.size(); i++){
            valor = distancia(grupos.get(i).caracteristicas ,caracteristicas);
            
            if (valor<menorValor){
                menorValor = valor;
                rotulo = grupos.get(i).getCor();
            }
             //System.out.println("A distancia atual é "+valor+" "+ grupos.get(i).getCor());
        }
        return rotulo;
        
    }
    public static Double distancia(double a[],double b[]){
        double soma = 0.0;
        for(int i = 0; i< a.length;i++){
            soma+= Math.pow(a[i]+ b[i],2);
        }
        return sqrt(soma);
    }
    
}
