/*
 * Luisa Fernanda Sosa Brambila
 * A01411485
 * IIS.
 */
package spp2.lsosab.a05;
import java.util.Scanner;
/**
 *
 * @author Fernanda
 */
public class SPP2LSosaBA05 {

    
    public static void main(String[] args) {
       solicitarD("Un número entero o decimal");
       solicitarL("Un numero muy largo");
       solicitarS("Una cadena de caracteres");
    }
          static double solicitarD(String dato){
              Scanner tec= new Scanner(System.in);
              double d=0;
              boolean test;
              do {
            System.out.println("Introduce " + dato);
            try {
                d= tec.nextDouble();
                test=true;
                 }
            catch (Exception ex) {
                test=false;
                System.out.println("El dato insetado no es  "+ dato + ex);
                d=tec.nextDouble();
            }   
            
        } while (test == false);
        return d; }
          
          static long solicitarL(String dato){
              Scanner tec= new Scanner(System.in);
              long l;
              boolean test2;
              do{
                  System.out.println("Introduce" + dato);
              
              try{ 
                  l=tec.nextInt();
                  test2=true;
              } 
              catch (Exception e2){ test2=false;
                  System.out.println("El dato insertado no es"+ dato);
                  l=tec.nextInt();
              } 
              }
              while (test2==false);
             return l;
          }

              static String solicitarS(String dato){
                 
                  Scanner tec= new Scanner(System.in);
                   String cadena= "";
                  boolean test3;
                  do{
                      System.out.println("Introduce"+ dato);
                      
                      try{
                          cadena=tec.nextLine();
                          test3=true;
                      }
                      catch (Exception e3){
                          test3=false;
                      }
                  }
                  while (test3==false);
                  return cadena;                          
                      }
}
                  
        