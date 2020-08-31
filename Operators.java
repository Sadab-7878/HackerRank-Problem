import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mealCost = input.nextDouble();
        int tipPercent = input.nextInt();
        int taxPercent = input.nextInt();

        double tip = mealCost * tipPercent/100;
        double tax = mealCost * taxPercent/100;

        int totalCost = (int) Math.round(mealCost+tax+tip);

        System.out.println(totalCost);
    }
}
