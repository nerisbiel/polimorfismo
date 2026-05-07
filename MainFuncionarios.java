/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario.polimorfismo;

/**
 *
 * @author Admin
 */
public class MainFuncionarios {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente();
        Funcionario f2 = new Vendedor();

        System.out.println("Salário Gerente: " + f1.calcularSalario());
        System.out.println("Salário Funcionario: " + f2.calcularSalario());
    }
}