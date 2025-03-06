import java.util.Scanner;

public class CalculosDeRectangulo {
    double x, y;

    public CalculosDeRectangulo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Con este calcularemos el area
    public double area() {
        return x * y;
    }

    //Este calcula el perimetro
    public double perimetro() {
        return 2 * (x + y);
    }

    //Y este calcula la diagonal
    public double diagonal() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base del rectángulo: ");
        double x = scanner.nextDouble();
        //Escanea la base y la altura del rectangulo
        System.out.print("Altura del rectángulo: ");
        double y = scanner.nextDouble();

        CalculosDeRectangulo rectangulo = new CalculosDeRectangulo(x, y);

        System.out.println("Área: " + rectangulo.area());
        System.out.println("Perímetro: " + rectangulo.perimetro());
        System.out.println("Diagonal: " + rectangulo.diagonal());

        scanner.close();
    }
}
