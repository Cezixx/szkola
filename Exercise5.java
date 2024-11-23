import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        double salary = doubleInput("Insert your salary here:");
        double result;
        double tax = 14.839;

        if (salary <= 85_000) {
            result = (salary * 0.18) - 556.02;
            System.out.println("You tax is equal: " + result);
        }else if (salary > 85_000) {
            result = (salary * 0.32) + tax;
            System.out.println("Your tax is equal: " + result);
        }
    }

    static double doubleInput(String message){
        try {
            Scanner input = new Scanner(System.in);
            System.out.println(message);
            double salary = input.nextDouble();
            return salary;
        }catch (InputMismatchException e) {
            System.out.println("You inserted letter instead of number");
            return doubleInput("Insert data again:");
        }
    }
}