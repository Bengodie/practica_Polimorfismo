/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaPolimorfismo;

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
        ///////////////////////////////////////////////
        System.out.println("\n-------Animal-------");
        Animal  a1= new Animal(54,"Teresa");
        System.out.println("\n: "+a1.toString());
        ///////////////////////////////////////////////
        System.out.println("\n\n-------Vertebrado-------");
        Vertebrado v1= new Vertebrado(45,"Balu","Mamifero");
        System.out.print("Datos del vertebrado: "+v1.toString());
        //////////////////////////////////////////////
        System.out.println("\n\n-------Invertebrado-------");
        Invertebrado i1= new Invertebrado(3,"Spiderman","Artropodo");
        System.out.print("Datos del invertebrado: "+i1.toString());
        /////////////////////////////////////////////
        System.out.println("\n\n-------Mamifero-------");
        Mamifero m1= new Mamifero(15,"RinTinTin","Mamifero", "Omnivoro","Perro" );
        System.out.print("Datos del Mamifero: "+m1.toString());
        /////////////////////////////////////////////
        System.out.println("\n\n-------Anfibio-------");
        Anfibio af1= new Anfibio(4,"Rene","Anfibio", "Insectos y plantas","Rana dorada" );
        System.out.print("Datos del Anfibio: "+af1.toString());
        /////////////////////////////////////////////
        System.out.println("\n\n-------Artropodo-------");
        Artropodo at1= new Artropodo(1,"Ella","Artropodo", "Insectos","Tarantula" );
        System.out.print("Datos del Artropodo: "+at1.toString());
        /////////////////////////////////////////////
        System.out.println("\n\n-------Ave-------");
        Ave av1= new Ave(8,"Pancha","Ave", "Omnivoro","Lora" );
        System.out.print("Datos del Ave: "+av1.toString());
        /////////////////////////////////////////////
        System.out.println("\n\n-------Gusano-------");
        Gusano g1= new Gusano(0,"Jim","Gusano", "Desechos organicos","Lombriz" );
        System.out.print("Datos del Gusano: "+g1.toString());
        /////////////////////////////////////////////
        System.out.println("\n\n-------Molusco-------");
        Molusco mo1= new Molusco(1,"Perlita","Molusco", "Materia Organica","Ostra" );
        System.out.print("Datos del Molusco: "+mo1.toString());
        /////////////////////////////////////////////
        System.out.println("\n-------Pez-------");
        Pez p1= new Pez(2,"Nemo","Pez", "Microorganismos marinos","Pez payaso" );
        System.out.print("Datos del Pez: "+p1.toString());
        /////////////////////////////////////////////
        System.out.println("\n\n-------Reptil-------");
        Reptil r1= new Reptil(12,"Chicho","Reptil", "Omnivoro","Iguana" );
        System.out.print("Datos del Reptil: "+r1.toString());
        /////////////////////////////////////////////
        
    }
    
}
