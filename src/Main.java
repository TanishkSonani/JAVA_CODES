import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name = sc.nextLine();
        System.out.println("Fuck you " + name);

        System.out.println("What is your age ?");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println(age + " ka hai ye bhen ka loda");

        System.out.println("What is your favorite food ?");
        String food = sc.nextLine();
        System.out.println("Yahi tatti pasand aati hai kya madharchod ?");
    }

}
