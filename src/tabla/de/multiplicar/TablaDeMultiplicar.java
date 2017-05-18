/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla.de.multiplicar;
import java.util.*;
import java.io.*;

/**
 *
 * @author JAVIER
 */
public class TablaDeMultiplicar {

    /**
     * @param args the command line arguments
     */
    static void Tabla (int a){
        int m;
        if (a == 0){
            System.out.println("ERROR");
                } else {
        for (int i = 1; i <= 10; i++){
            m = a * i;
            System.out.println(a+" X "+i+" = "+m);
        }
        }       
    }
    public static void main(String[] args) throws FileNotFoundException
    {
    Scanner imput = new Scanner (new File("test1.txt"));
    int count = 0;
        while (imput.hasNext()) {
            String word = imput.next();
            count++;
        }
        System.out.println("Palabras totales = " + count);
    }
    
}
