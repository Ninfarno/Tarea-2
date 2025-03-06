import java.util.Scanner;

public class IntercambioDeValores {
    static Integer a;
    static Integer b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Escanea los valores para a y b
        System.out.println("Escribe el valor de a: ");
        a = scanner.nextInt();

        System.out.println("Escribe el valor de b: ");
        b = scanner.nextInt();

        System.out.println("Antes de intercambiar: a = " + a + ", b = " + b); //Imprime valores originales

        intercambiar();//Invoca el metodo intercambiar

        System.out.println("Después de intercambiar: a = " + a + ", b = " + b);//Imprime valores intercambiados

        scanner.close();
    }
    public static void intercambiar() {
        int Vtemp = a; //Vtemp --> Variable Temporal
        a = b;
        b = Vtemp;
    }
}