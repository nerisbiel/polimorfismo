/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carros.polimorfismo;

/**
 *
 * @author Admin
 */
public class MainVeiculos {
     public static void acionar(Veiculo v) {
        v.mover();
    }

    public static void main(String[] args) {
        acionar(new Carro());
        acionar(new Bicicleta());
    }
}