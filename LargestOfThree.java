import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        int num1, num2 , num3;

        System.out.println("Please enter three numbers: ");
        Scanner input = new Scanner(System.in);

        num1 = input.nextInt();

        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the largest of the three numbers.");
        }else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the largest of the three numbers.");
        }else if (num3 > num1 && num3 > num2){
            System.out.println(num3 + " is the largest of the three numbers.");
        }else if(num1 == num2 && num1 == num3){
            System.out.println( "The three numbers are equal.");
        }
    }
}
