/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.logica;
import javaapplication2.logica.Dado;
/**
 *
 * @author Estudiantes
 */
public class Cliente {
    
    public void Clientes(){
        Dado b = new Dado();
        b.lanzamiento();
        Dado a = new Dado();
        a.lanzamiento();
        int T2=0,T3=0,T4=0,T5=0,T6=0,T7=0,T8=0,T9=0,T10=0,T11=0,T12=0;
        for (int i = 0; i < 1000; i++) {
            int s = a.lanzamiento()+b.lanzamiento();
            if (s == 2){
                T2 = T2+1;     
            }
            if (s == 3){
                T3 = T3+1;     
            }
            if (s == 4){
                T4 = T4+1;     
            }
            if (s == 5){
                T5 = T5+1;     
            }
            if (s == 6){
                T6 = T6+1;     
            }
            if (s == 7){
                T7 = T7+1;     
            }
            if (s == 8){
                T8 = T8+1;     
            }
            if (s == 9){
                T9 = T9+1;     
            }
            if (s == 10){
                T10 = T10+1;     
            }
            if (s == 11){
                T11 = T11+1;     
            }
            if (s == 12){
                T12 = T12+1;     
            }
        }
        
        System.out.println("frecuencia 2: "+T2+"\nfrecuencia 3: "+T3+"\nfrecuencia 4: "+T4+"\nfrecuencia 5: "+T5+"\nfrecuencia 6: "+T6+"\nfrecuencia 7: "+T7+"\nfrecuencia 8: "+T8+"\nfrecuencia 9: "+T9+"\nfrecuencia 10: "+T10+"\nfrecuencia 11: "+T11+"\nfrecuencia 12: "+T12);
    }
    
}
