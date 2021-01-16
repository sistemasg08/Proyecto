
package ejemplo16;

import java.util.Scanner;


public class Ejemplo16 {

    
        public static void main(String[] args) {
        // TODO code application logic here
        int a, b, suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("SUMA DE DOS NUMEROS ENTEROS");
        System.out.print("Ingrese primer número: ");
        a = leer.nextInt();
        System.out.print("Ingrese primer número: ");
        b = leer.nextInt();
        suma = sumar(a,b);
        System.out.println("La suma de los números es: " + suma);
    }  // Fin del método main
    
    static int sumar(int a, int b){
        return a + b;
    } // Fin del método sumar
}
