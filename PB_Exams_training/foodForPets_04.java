package PB_Exams_training;

import java.util.Scanner;

public class foodForPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        double biscuits = 0;
        double totalDogFood = 0;
        double totalCatFood = 0;
        double totalEaten = 0;

        for (int i = 1; i <= days; i++) {
            double currentDogFood = Double.parseDouble(scanner.nextLine());
            double currentCatFood = Double.parseDouble(scanner.nextLine());
            totalDogFood += currentDogFood;
            totalCatFood += currentCatFood;
            totalEaten += currentDogFood + currentCatFood;

            if (i % 3 == 0) {
                biscuits += (currentDogFood + currentCatFood) * 0.10;
            }

        }

        System.out.printf("Total eaten biscuits: %.0fgr.\n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.\n", totalEaten * 100.00 / food);
        System.out.printf("%.2f%% eaten from the dog.\n", (totalDogFood) * 100.00 / totalEaten);
        System.out.printf("%.2f%% eaten from the cat.\n", (totalCatFood) * 100.00 / totalEaten);
    }
}
