import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert first number:");
        int first_number = input.nextInt();
        System.out.println("Insert second number:");
        int second_number = input.nextInt();
        System.out.println("Insert third number");
        int third_number = input.nextInt();
        input.close();

        int max_number;
        int min_number;

        max_number = Math.max(first_number, Math.max(second_number, third_number));
        min_number = Math.min(first_number, Math.min(second_number, third_number));

        System.out.println("Maximum number:" + max_number);
        System.out.println("Minimum number:" + min_number);
    }
}
