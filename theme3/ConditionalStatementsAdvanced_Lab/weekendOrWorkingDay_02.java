package tema3.ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class weekendOrWorkingDay_02 {
    public static void main(String[] args) {
        //Напишете програма която, чете ден от седмицата (текст),
        // на английски език - въведен от потребителя.
        // Ако денят е работен отпечатва на конзолата - "Working day",
        // ако е почивен - "Weekend".
        // Ако се въведе текст различен от ден от седмицата
        // да се отпечата - "Error".

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
