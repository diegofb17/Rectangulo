/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author whizrxt
 */
public class Rectangulo {

    private PuntoGeometrico puntoA;
    private PuntoGeometrico puntoB;
    private PuntoGeometrico puntoC;
    private PuntoGeometrico puntoD;

    public Rectangulo() {
        this.puntoA = new PuntoGeometrico(0, 5);
        this.puntoB = new PuntoGeometrico(5, 5);
        this.puntoC = new PuntoGeometrico(5, 0);
        this.puntoD = new PuntoGeometrico(0, 0);
    }

    public void calcularSuperficie() {
        double base = this.puntoC.getX() - this.puntoD.getX();
        base = Math.abs(base);

        double altura = this.puntoB.getY() - this.puntoC.getY();
        altura = Math.abs(altura);

        double superficie = base * altura;
        System.out.println("La superficie del rectangulo es: " + superficie);

    }

    public void desplazarRectangulo(double x, double y) {
        this.puntoA.setX(this.puntoA.getX() + x);
        this.puntoB.setX(this.puntoB.getX() + x);
        this.puntoC.setX(this.puntoC.getX() + x);
        this.puntoD.setX(this.puntoD.getX() + x);
        
        this.puntoA.setY(this.puntoA.getY() + y);
        this.puntoB.setY(this.puntoB.getY() + y);
        this.puntoC.setY(this.puntoC.getY() + y);
        this.puntoD.setY(this.puntoD.getY() + y);

    }

    @Override
    public String toString() {
        return "Rectangulo{" + "puntoA=" + puntoA + ", puntoB=" + puntoB + ", puntoC=" + puntoC + ", puntoD=" + puntoD + '}';
    }
    
    public static void main(String[] args) {
        Rectangulo rec1= new Rectangulo();
        System.out.println(rec1);
        rec1.calcularSuperficie();
        
        rec1.desplazarRectangulo(4, 4);
        rec1.calcularSuperficie();
        
        System.out.println(rec1);
    }
}
