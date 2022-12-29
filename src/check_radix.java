import java.util.Scanner;

public class check_radix {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check radix ");
        String num = sc.nextLine();

        if(num.matches("[01]+")){
            System.out.println("Given Number Is Binary Radix Is 2 ");
        }

        else if(num.matches("[0-7]+")){
            System.out.println("The Given Number Is Octal Radix is 8");
        }

        else if(num.matches("[0-9]+")){
            System.out.println("The Given Number Is Decimal Radix is 10");
        }

        else if(num.matches("[0-9 A-F]+")){
            System.out.println("The Given Number Is Hex Radix is 16");
        }

        else{
            System.out.println("Enter a Valid number");
        }



    }
}
