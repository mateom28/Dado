
package javaapplication2.logica;
import java.util.Random;
/**
 *
 * @author Estudiantes
 */
public class Dado {
    
    public int lanzamiento(){
        Random r = new Random();
        int TiroDado = r.nextInt(6)+1;
        return TiroDado;
    }
     
}
