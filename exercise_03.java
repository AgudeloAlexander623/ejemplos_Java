import java.util.Scanner;

public class exercise_03 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("please, enter your name: ");
        String name = scanner.nextLine();

        System.out.print("please, enter your last name: ");
        String lastname = scanner.nextLine();

        System.out.println(" hello " + name +" "+ lastname +", welcome to Java ");

        scanner.close();
    }
}
