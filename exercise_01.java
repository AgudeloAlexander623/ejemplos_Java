import java.util.Scanner;

public class exercise_01 {
    public exercise_01() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("ingresar el primer numero: ");
        int var2 = var1.nextInt();
        System.out.print("ingresar el segundo numero: ");
        int var3 = var1.nextInt();
        int var4 = var2 + var3;
        int var5 = var2 - var3;
        int var6 = var2 * var3;
        int var7 = var2 / var3;
        System.out.println("la suma de " + var2 + " + " + var3 + " = " + var4);
        System.out.println("la resta de " + var2 + " - " + var3 + " = " + var5);
        System.out.println("la multiplicacion de " + var2 + " X " + var3 + " = " + var6);
        System.out.println("la division de " + var2 + " X " + var3 + " = " + var7);
    }
}
