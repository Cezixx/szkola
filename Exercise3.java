import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        char operator;
        double num1, num2, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = input.nextDouble();

        System.out.println("Choose the operator: +, -, *, /, % ");
        operator = input.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = input.nextDouble();
        input.close();
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("The sum is " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("The subtraction is " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("The multiplication is " + result);
                    break;

                case '/':
                    if(num2 == 0) {
                        System.out.println("You can't divide by 0");
                    } else {
                        result = num1 / num2;
                        System.out.println("The division is " + result);
                    }
                    break;
                case '%':
                    result = num1 % num2;
                    System.out.println("The remainder is " + result);
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }
    }
}