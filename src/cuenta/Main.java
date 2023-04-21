/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String titular = scanner.nextLine();
        
        System.out.print("Ingrese la cantidad a ingresar en la cuenta: ");
        double cantidad = scanner.nextDouble();
        
        CuentaBancaria cuenta = new CuentaBancaria(titular, cantidad);
        System.out.println("Se ha creado la cuenta:\n" + cuenta);
        
        boolean salir = false;
        while (!salir) {
            System.out.println("Ingrese 'D' para depositar, 'R' para retirar o 'S' para salir: ");
            String opcion = scanner.next();

            switch (opcion.toUpperCase()) {
                case "D":
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    cuenta.ingresar(cantidadDeposito);
                    System.out.println("Se ha depositado " + cantidadDeposito + " a la cuenta:\n" + cuenta);
                    break;
                case "R":
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    cuenta.retirar(cantidadRetiro);
                    System.out.println("Se ha retirado " + cantidadRetiro + " de la cuenta:\n" + cuenta);
                    break;
                case "S":
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}
