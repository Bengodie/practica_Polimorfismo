/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaPolimorfismo;

/**
 *
 * @author Diego
 */
public abstract class Invertebrado extends Animal{
    private String claseIV;
    private String reproduccion;
    public Invertebrado() {
        this.claseIV = "";
    }

    public Invertebrado( int edad, String nombre,String claseIV) {
        super(edad, nombre);
        this.claseIV = claseIV;
    }

    public String getClaseIV() {
        return claseIV;
    }

    public void setClaseIV(String claseIV) {
        this.claseIV = claseIV;
    }
    
    public abstract String getReprod();

    @Override
    public String toString(){
        return super.toString()
                +"\nClase de invertebrado: " +this.getClaseIV();
    }
}
