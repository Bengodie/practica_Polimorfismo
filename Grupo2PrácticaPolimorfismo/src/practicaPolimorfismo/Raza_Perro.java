/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaPolimorfismo;

/**
 *
 * @author indir
 */
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Raza_Perro implements Domestico{

       int raza;
      @Override
      public int  elegirRaza(){
         // raza= Integer.parseInt(JOptionPane.showInputDialog("""
                                                        //     Ingrese la raza de perro que desea:
                                                             
                                                          //   1.Salchicha
                                                            // 2.Labrador
                                                            // 3.Dalmata"""));
        //  return raza;
           raza= Integer.parseInt((String) JOptionPane.showInputDialog(null, """
                                                             Ingrese la raza de perro que desea:
                                                             
                                                             1.Salchicha
                                                             2.Labrador
                                                             3.Dalmata""", "Perrito", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/img/huella.png"),null, null));
          return raza;
      }
      
      @Override
      public void mostrar(){
           switch (raza) {
               case 1 -> JOptionPane.showMessageDialog(null, "Haz adoptado un perrito salchicha", "Salchicha", JOptionPane.PLAIN_MESSAGE,
                           new  ImageIcon("src/img/salchicha.png"));
               case 2 -> JOptionPane.showMessageDialog(null, "Haz adoptado un perrito labrador", "Golden river", JOptionPane.PLAIN_MESSAGE,
                           new  ImageIcon("src/img/labrador.png"));
               default -> JOptionPane.showMessageDialog(null, "Haz adoptado un perrito dalmata", "Labrador", JOptionPane.PLAIN_MESSAGE,
                           new  ImageIcon("src/img/dalmata.png"));
           }
      }
     @Override
      public String nombrar(){
          String nombre= JOptionPane.showInputDialog("Ingrese el nombre del perro");
          return nombre;
      }
      @Override
      public void jugar(){
          JOptionPane.showMessageDialog(null, "Quiero ir a jugar", "Jugar con el perro", JOptionPane.PLAIN_MESSAGE, 
                  new  ImageIcon("src/img/jugar.png"));
      }
 
   
     
      
      
    
    
    
}
