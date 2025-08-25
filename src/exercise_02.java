//importamos scanner para que nos deje ingresar algo en consola
import java.util.Scanner;

public class exercise_02 {
    public static void main(String[] args) {
        // en este prollecto veremos la comparacion de dos variables(Cual es mayor, Cual es menor y si son iguales o no)
        // In this project we will see the comparison of two variables (Which is greater, which is less and if they are equal or not)
        Scanner scanner = new Scanner(System.in);
        
        //pedimos al usuario que ingrese las variables
        System.out.println("ingresar el pirmer numero: ");
        int num1= scanner.nextInt();
        System.out.println("ingresar el segundo numero: ");
        int num2 = scanner.nextInt();

        // hacemos la comparativa de las variables
        if(num1>num2){
            System.out.println( num1 + " es mayor que " + num2);
        }
        else if(num2>num1){
            System.out.println( num2 + " es mayor que " + num1);
        }
        else{
            System.out.println("los numeros son iguales");
        }

    }
}
