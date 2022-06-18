import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the year: ");
        int year = input.nextInt();

//        int year = 2057;

        if (year % 400 == 0) {

            System.out.println(year + " is a leap year.");
        }else if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not leap year.");
        }
    }
}
