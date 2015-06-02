/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularsuperficie;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación Clase main contiene toda la logica del programa
 *
 * @author bea
 */
public class Controlador {

    /**
     * el metodo main se encarga de llamar a todos los metodos necesarios para
     * hacer el calculo del area de las figuras establecidas.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Presentacion pre = new Presentacion();
        pre.escogerArea(mod);

        if (mod.shapeType.equals("square")) {
            pre.datosSquare(mod);
            areaSquare(mod);
            pre.imprimirArea(mod);
        } else if (mod.shapeType.equals("rectangle")) {
            pre.datosRectangle(mod);
            areaRectangle(mod);
            pre.imprimirArea(mod);
        } else if (mod.shapeType.equals("triangle")) {
            pre.datosTriangle(mod);
            areaTriangle(mod);
            pre.imprimirArea(mod);
        } else if (mod.shapeType.equals("circle")) {
            pre.datosCircle(mod);
            areaCircle(mod);
            pre.imprimirArea(mod);
        } else {
            mod.shapeType = "";
            System.out.println("You have to enter the name of the geometric figures indicated in lowercase .\n"
                    + "Try again");
        }

    }

    /**
     * Metodo que calcula el area del circulo.
     */
    public static float areaCircle(Modelo mod) {
        //add area calculations for a circle here

        mod.varArea = mod.varA * mod.varA;
        mod.varArea = (float) (3.1416 * mod.varArea);

        return mod.varArea;
    }

    /**
     * Metodo que calcula el area del triangulo.
     */
    public static float areaTriangle(Modelo mod) {
        //add area calculations for triangle here

        mod.varArea = (float) (0.5 * mod.varA * mod.varB);

        return mod.varArea;
    }

    /**
     * Metodo que calcula el area del rectangulo.
     */
    public static float areaRectangle(Modelo mod) {
        //add area calculations for rectangle here

        mod.varArea = mod.varA * mod.varB;

        return mod.varArea;
    }

    /**
     * Metodo que calcula el area del cuadrado.
     */
    public static float areaSquare(Modelo mod) {
        //add area calculations for square

        mod.varArea = mod.varA * mod.varA;

        return mod.varArea;
    }
}
