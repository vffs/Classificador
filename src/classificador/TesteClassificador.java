
package classificador;

import static classificador.Classificador.classificador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author valeria
 */
public class TesteClassificador {
    
    public static void main(String[] args) {
        
       List<Grupo>grupos = new ArrayList(); 
       
       grupos.add(new Grupo("Amarelo", 1.0, 1.0, 1.0));// fala idioma, toca intrumento, pratica esporte
       grupos.add(new Grupo("Verde",1.0, 1.0 , 0.0));//fala idioma e toca instrumento
       grupos.add(new Grupo("Azul", 1.0, 0.0 , 1.0));//fala idioma e pratica esporte
       grupos.add(new Grupo("Vermelho",0.0 , 1.0, 1.0));//toca instrumento e pratica esporte
       grupos.add(new Grupo("Laranja",1.0, 0.0 , 0.0));//fala idioma
       grupos.add(new Grupo("Marrom",0.0, 1.0, 0.0));//toca intrumento
       grupos.add(new Grupo("Cinza", 0.0 , 0.0 , 1.0));//pratica esporte
       grupos.add(new Grupo("Preto",0.0 , 0.0 ,0.0));// não fala idioma, não toca instrumento e não pratica esporte
       
       double[] valeria={0.0 , 0.0 , 0.0}; 
      System.out.println("Valéria é do grupo : " + classificador( grupos,valeria));
       
    }
    
}
