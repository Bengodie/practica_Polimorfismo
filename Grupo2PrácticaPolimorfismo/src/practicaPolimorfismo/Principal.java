/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaPolimorfismo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n-------Animal-------");
        Animal  a1= new Animal(54,"Teresa");
        System.out.println("\n: "+a1.toString());
        /////////////////////////////////////////////
        System.out.println("\n\n-------Mamifero-------");
        Mamifero m1= new Mamifero(15,"RinTinTin","Mamifero", "Omnivoro","Perro" );
        System.out.print("Datos del Mamifero: "+m1.getReprod());
        /////////////////////////////////////////////
        System.out.println("\n\n-------Anfibio-------");
        Anfibio af1= new Anfibio(4,"Rene","Anfibio", "Insectos y plantas","Rana dorada" );
        System.out.print("Datos del Anfibio: "+af1.getReprod());
        /////////////////////////////////////////////
        System.out.println("\n\n-------Artropodo-------");
        Artropodo at1= new Artropodo(1,"Ella","Artropodo", "Insectos","Tarantula" );
        System.out.print("Datos del Artropodo: "+at1.getReprod());
        /////////////////////////////////////////////
        System.out.println("\n\n-------Ave-------");
        Ave av1= new Ave(8,"Pancha","Ave", "Omnivoro","Lora" );
        System.out.print("Datos del Ave: "+av1.getReprod());
        /////////////////////////////////////////////
        System.out.println("\n\n-------Gusano-------");
        Gusano g1= new Gusano(0,"Jim","Gusano", "Desechos organicos","Lombriz" );
        System.out.print("Datos del Gusano: "+g1.getReprod());
        /////////////////////////////////////////////
        System.out.println("\n\n-------Molusco-------");
        Molusco mo1= new Molusco(1,"Perlita","Molusco", "Materia Organica","Ostra" );
        System.out.print("Datos del Molusco: "+mo1.getReprod());
        /////////////////////////////////////////////
        System.out.println("\n-------Pez-------");
        Pez p1= new Pez(2,"Nemo","Pez", "Microorganismos marinos","Pez payaso" );
        System.out.print("Datos del Pez: "+p1.getReprod());
        /////////////////////////////////////////////
        System.out.println("\n\n-------Reptil-------");
        Reptil r1= new Reptil(12,"Chicho","Reptil", "Omnivoro","Iguana" );
        System.out.print("Datos del Reptil: "+r1.getReprod());
        ///////////////--------------interface-------------/////////////////////
         Domestico p = new Raza_Perro();
         p.elegirRaza();
        
        p.mostrar();
        JOptionPane.showMessageDialog(null, "El  nombre del perro es: "+ p.nombrar(), "Nombrarlo", JOptionPane.PLAIN_MESSAGE, 
                new  ImageIcon("src/img/nombrar.png"));
        p.jugar();
        
        
    }
    
}
