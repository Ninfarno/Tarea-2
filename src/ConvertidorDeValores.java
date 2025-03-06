import java.util.Scanner;

public class ConvertidorDeValores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        //Cambiar a Hexadecimal y las letras a mayúsculas
        //Hexadecimal: 1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
        String hexadecimal = Integer.toHexString(numero).toUpperCase();

        //Cambiar a Octal más simple usar Integer.toOctalString(Var)
        //Octal: n/8= cociente, resto; y se repite hasta que cociente sea 0
        String octal = Integer.toOctalString(numero);

        //Cambio a Binario
        //Cada uno tiene un valor, no quise buscarlo -_-'
        String binario = Integer.toBinaryString(numero);

        //Muestra los resultados
        System.out.println("Representación en hexadecimal: " + hexadecimal);
        System.out.println("Representación en octal: " + octal);
        System.out.println("Representación en binario: " + binario);

        scanner.close();
    }
}