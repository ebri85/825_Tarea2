/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brizuelaruizesau.tarea2;

import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author esau_br
 */
public class main {

    /**
     Tarea 2
     * 
     * Utilizar recursividad para recorrer un Vector de Enteros
     * Multiplicando cada uno sus contenidos
     * 
     */
    public static void main(String[] args) {
        //
        
        int opcion=0;
        int t=0;
        int num= 0;
        Vector <Integer>numeros = new Vector<>(1);
       
        DecimalFormat agruparNumeros = new DecimalFormat("###,###");
      
      
      try{
          
          do{
              opcion = OpcionMenu();
              
              switch(opcion){
                  
                  case 1:
                      t = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de Elementos que desea agregar"));              
                      
                      numeros.setSize(t);//fija el tamanno del vector
 
                      break;
                      
                  case 2:
                      int cont=0;
                      String hilera="****VECTOR****\n\n";
                      while(cont<numeros.size()){//llena el Vector
                          num= Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero que desea agregar al Vector"));
                          numeros.set(cont,num);
                          hilera+= "Vector"+'['+cont+"]=" + "   "+ num + "\n";
                         cont++;
                         

                      }

                          JOptionPane.showMessageDialog(null,hilera);//Imprime el VECTOR
                      
                      break;
                      
                  case 3:
                      int indice = t-1;
                                            
                     JOptionPane.showMessageDialog(null,"Resultado de Multiplicar los Enteros contenidos en el Vector\n"+
                                                  agruparNumeros.format(Recursividad(numeros,indice)));
                     
                     numeros.clear();
                      break;
                      
                      
                  case 0:
                      
                      JOptionPane.showMessageDialog(null,"Saliendo de la aplicacion");
                          
                      System.exit(0);
                      
                      break;
              }
              
              
          }while(opcion!=0);         
          
          
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,e.toString());//va a mostrar el porque se genera la excepcion
          
      }

    }
    
    public static int OpcionMenu(){//Metodo del Menu
        int resultado=0;
        String menu = "**\t Menu Inicializacion\t**\n\n";
        
            menu+="1\t-\t Indique la cantidad de Elementos que desea agregar\n\n";
            menu+="2\t-\t Agregar Elementos al Vector\n\n";
            menu+="3\t-\t Multiplicar Elementos del Vector\n\n";
            menu+="0\t-\t SALIR\n\n";
            
            resultado = Integer.parseInt(JOptionPane.showInputDialog(menu));      

        return resultado;
    }
    

   public static int Recursividad(Vector <Integer> n, int i){
       
        
    return (i==0)?n.get(i):n.get(i)* Recursividad(n,i-1);//Se llama asi mismo pasando por parametro el indice menor

   }
    
}
