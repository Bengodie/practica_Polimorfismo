/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaPolimorfismo;

/**
 *
 * @author Diego
 */
public abstract class Vertebrado extends Animal{
   private String claseV;
   private String reproduccion;

    public Vertebrado() {
        this.claseV = "";
    }

    public Vertebrado( int edad, String nombre, String claseV) {
        super(edad, nombre);
        this.claseV = claseV;
    }
    
    public String getClaseV() {
        return claseV;
    }

    public void setClaseV(String claseV) {
        this.claseV = claseV;
    }
   
    public abstract String getReprod();
    
    @Override
        public String toString(){
            return super.toString()
                +"\nClase de vertebrado: " +this.getClaseV();
    }
   
}
