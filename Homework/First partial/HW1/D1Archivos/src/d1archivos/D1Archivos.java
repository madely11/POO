/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d1archivos;

/**
 *
 * @author Madely Betancourt
 */
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;


public class D1Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        File file = new File ("C:\\Progra\\Archivo1.txt");
        String contenido = "";
        String line;
        String value;
        int y=0;
        
        System.out.println("Ingrese el valor que desea buscar:");
        value = leer.nextLine();
        try{
            if (file.exists() ) {
                BufferedReader in = new BufferedReader(new FileReader(file));
                while( ((line = in.readLine()) != null) && y==0 ){
                    contenido += line+"\n";
                    if(value.equals(line)){
                         System.out.println("El valor ha sido encontrado");
                         y=1;
                    } 
                }
                in.close();
                if (y==0)
                    System.out.println("El valor no fue encontrado");
            } else {
                System.out.println("El archivo fue removido");
            }
            
      
        }catch (Exception e){
            System.out.println("El archivo fue removido");
        }
            
    }
    
}
