/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaPolimorfismo;

/**
 *
 * @author Diego
 */
public class Artropodo extends Invertebrado{
    private String dieta;
    private String especie;

    public Artropodo() {
        this.dieta = " ";
        this.especie = " ";
    }

    public Artropodo(int edad, String nombre, String claseIV, String dieta, String especie) {
        super(edad, nombre, claseIV);
        this.dieta = dieta;
        this.especie = especie;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    @Override
    public String getReprod(){
        return super.toString()
                +"\nEspecie: "+this.getEspecie()
                +"\nDieta: "+this.getDieta()
                +"\nLos artropodos somos oviparos u ovoviviparos, nos reproducimos mediante huevos";
    }
    
    @Override
     public String toString(){
        return super.toString()
                +"\nEspecie: "+this.getEspecie()
                +"\nDieta: "+this.getDieta();
    }
}
