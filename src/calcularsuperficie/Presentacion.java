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

import java.util.Scanner;

/**
 * Esta clase contiene toda la interaccion con el uusuario Ya sea pedir un dato
 * y guardarlo o mostrar en pantalla resultados
 *
 * @author Bea
 */
public class Presentacion {

    //objeto de lectura de datos Presentacion
    private Scanner sc = new Scanner(System.in);

    /**
     * metodo que se encarga de pedir al usuario el nombre de la figura de la
     * cual desea sacar el area
     *
     * @param obj
     * @return
     */
    public Modelo escogerArea(Modelo obj) {
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        obj.shapeType = sc.nextLine();
        System.out.println("You said: " + obj.shapeType);
        return obj;
    }

    /**
     * metodo que se encarga de pedir al usuario los datos del cuadrado del que
     * desea sacar el area
     *
     * @param obj
     * @return
     */
    public Modelo datosSquare(Modelo obj) {
        System.out.println("what is the side length?");
        obj.varA = sc.nextFloat();
        return obj;
    }

    /**
     * metodo que se encarga de pedir al usuario los datos del rectangulo del
     * que desea sacar el area
     *
     * @param obj
     * @return
     */
    public Modelo datosRectangle(Modelo obj) {
        System.out.println("what is the rectangles width?");
        obj.varA = sc.nextFloat();
        System.out.println("What is the rectangles height?");
        obj.varB = sc.nextFloat();
        return obj;
    }

    /**
     * metodo que se encarga de pedir al usuario los datos del triangulo del que
     * desea sacar el area
     *
     * @param obj
     * @return
     */
    public Modelo datosTriangle(Modelo obj) {
        System.out.println("What is the base length of the triangle?");
        obj.varA = sc.nextFloat();
        System.out.println("What is the height of the triangle?");
        obj.varB = sc.nextFloat();
        return obj;
    }

    /**
     * metodo que se encarga de pedir al usuario los datos del circulo del que
     * desea sacar el area
     *
     * @param obj
     * @return
     */
    public Modelo datosCircle(Modelo obj) {
        System.out.println("What is the radius of the circle?");
        obj.varA = sc.nextFloat();
        return obj;
    }

    /**
     * imprime el area de cualquier figura
     *
     * @param obj
     * @return
     */
    public void imprimirArea(Modelo obj) {
        System.out.println("The area for your " + obj.shapeType + " : " + obj.varArea);
    }
}