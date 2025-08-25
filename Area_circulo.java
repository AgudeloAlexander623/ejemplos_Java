import java.util.Scanner;

public class Area_circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar el area del circulo a calcular: ");
        double radio = sc.nextDouble();

        //definimos pi manualmente:
        double pi = 3.1416;

        //formula: area = pi*(radio*radio)
        double area = pi * radio * radio;
        System.out.println("el area del circulo con radio "+ radio +" es: "+ area);
    }
}