
package classificador;

import static java.lang.Math.sqrt;
import java.util.List;

/**
 *
 * @author valeria
 */
public class Classificador {
        
    public static String classificadorEuclidiano(List<Grupo>grupos, double caracteristicas[]){
        double valor = 0.0;
        double menorValor = 1000000;
        String  rotulo = null;
        
        for(int i=0; i<grupos.size(); i++){
            valor = distanciaEuclidiana(grupos.get(i).caracteristicas ,caracteristicas);
            
            if (valor<menorValor){
                menorValor = valor;
                rotulo = grupos.get(i).getCor();
            }
             System.out.println("A distancia atual é "+valor+" "+ grupos.get(i).getCor());
        }
        return rotulo;
        
    }
    
    public static Double distanciaEuclidiana(double a[],double b[]){
        double soma = 0.0;
        for(int i = 0; i< a.length;i++){
            soma+= Math.pow(a[i]+ b[i],2);
        }
        return sqrt(soma);
    }
    
    public static String classificadorManhattan(List<Grupo>grupos, double caracteristicas[]){
        double valor = 0.0;
        double menorValor = 1000000;
        String  rotulo = null;
        
        for(int i=0; i<grupos.size(); i++){
            valor = distanciaManhattan(grupos.get(i).caracteristicas ,caracteristicas);
            
            if (valor<menorValor){
                menorValor = valor;
                rotulo = grupos.get(i).getCor();
            }
             System.out.println("A distancia atual é "+valor+" "+ grupos.get(i).getCor());
        }
        return rotulo;
        
    }
    
    public static Double distanciaManhattan(double[] a, double[] b) {
		double soma=0;
		
		for(int i = 0; i < a.length; i++) {		
                    soma += Math.abs(a[i]-b[i]);
					
		}
		return soma;
	}
    
}
