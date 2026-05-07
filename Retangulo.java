/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas.polimorfismo;

/**
 *
 * @author Admin
 */
class Retangulo extends Forma {
    private final double b;
    private final double h;
    public Retangulo(double b, double h) { this.b = b; this.h = h; }
    @Override
    public double calcularArea() { return b * h; }
}