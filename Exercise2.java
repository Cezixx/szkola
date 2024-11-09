import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Użytkownik wprowadza tu dane
        
        System.out.println("Insert price of product between 100-10k:");
        int price = input.nextInt();

        System.out.println("Insert number of installments:");
        int installment = input.nextInt();
        input.close();

        //Sprawdzamy czy dane są poprawne i wyznaczamy mnożnik na podstawie liczby rat
        
        double multiplier;
        if (price < 100 || price > 10_000 || installment < 6 || installment > 48) {
            System.out.println("You inserted a wrong data: Price should be between 100 and 10_000");
            System.out.println("Number of installments should be between 6 and 48");
        } else {
            if (installment <= 12) {
                multiplier = 0.025;
            } else if (installment <= 24) {
                multiplier = 0.05;
            } else{
                multiplier = 0.1;
            }

        // Obliczanie wyników: odsetek, ceny i wartości raty
            
            double interest = price * multiplier;
            double total_price = price + interest;
            double installment_value = total_price / installment;

            System.out.println("Price of your product:" + total_price + "zł");
            System.out.println("Amount of hold:" + interest + "zł");
            System.out.println("Amount of installment:" + installment_value + "zł");
        }
    }
}
