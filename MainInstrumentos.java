/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrumentos.polimorfismo;

/**
 *
 * @author Admin
 */
public class MainInstrumentos {
    public static void executar(InstrumentoMusical i) {
        i.tocar();
    }

    public static void main(String[] args) {
        executar(new Guitarra());
        executar(new Piano());
    }
}
