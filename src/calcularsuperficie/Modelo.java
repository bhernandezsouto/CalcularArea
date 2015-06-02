/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularsuperficie;

/**
 *
 * @author Bea
 */
public class Modelo {

    String shapeType; // indica que figura escoge el usuario
    float varA; //dato de la figura
    float varB; //dato de la figura
    float varArea; //area calculada

    public Modelo() {
    }

    public Modelo(float varA) {
        this.varA = varA;
    }
    
    public Modelo(float varA, float varB) {
        this.varA = varA;
        this.varB = varB;
    }
    
}