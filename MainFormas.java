/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas.polimorfismo;

/**
 *
 * @author Admin
 */

import java.util.ArrayList;

public class MainFormas {
    public static void main(String[] args) {
        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(new Circulo(3));
        lista.add(new Retangulo(4, 5));

        for (Forma f : lista) {
            // O Java decide em tempo de execução qual método chamar
            System.out.println("Área: " + f.calcularArea());
        }
    }
}