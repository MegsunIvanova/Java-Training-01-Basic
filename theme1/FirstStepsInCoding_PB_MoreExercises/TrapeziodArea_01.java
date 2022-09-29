package tema1.FirstStepsInCoding_PB_MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrapeziodArea_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Напишете програма, която чете от конзолата три дробни числа b1, b2 и h и
        // пресмята лицето на трапец с основи b1 и b2 и височина h.
        // Формулата за лице на трапец е (b1 + b2) * h / 2.
        //На фигурата по-долу е показан трапец със страни 8 и 13 и височина 7.
        // Той има лице (8 + 13) * 7 / 2 = 73.5.
        //Отговорът трябва да е форматиран до втората цифра след десетичния знак.

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double face = (b1 + b2) * h / 2;

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(face));

    }
}
