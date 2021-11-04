import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class runProgram {

    public static void newMedObject() {
        Scanner input = new Scanner(System.in);

        String name;
        int remaining;
        int bundles;
        int amountInBundle;
        int perDay;
        int extra;
        LocalDate lastDate;

        System.out.println("\nFyll i namn och styrka ex: Fruxo 50mg");
        name = String.valueOf(input.nextLine());
        System.out.println("Fyll i antal kvar som du redan har tagit ut ex: 250");
        remaining = input.nextInt();
        System.out.println("Fyll i hur många uttag du har kvar på befintliga recept ex: 2");
        bundles = input.nextInt();
        System.out.println("Fyll i hur många får du ta ut per uttag ex: 200 ");
        amountInBundle = input.nextInt();
        System.out.println("Fyll i hur många du äter om dagen ex: 2");
        perDay = input.nextInt();
        System.out.println("Fyll i hur många du får ta extra per dag ex: 1 ");
        extra = input.nextInt();
        lastDate = LocalDate.now();

        Meds medToAdd = new Meds(name, remaining,bundles,amountInBundle,perDay,extra,lastDate);
        MedList medList = new MedList();
        medList.addMeds(medToAdd);
        medList.saveMeds();

    }

    private static void consumption() {
        // TODO make a method that:
        // TODO 1. calculate consumption based on the diffInDays and store it in remaining
        // TODO 2. based on the new remaining value + (bundles * amountInBundle) divide it by perDay and preset days left.
        // TODO 3. If it is less than 8 days left present a Warning
    }

    private static void quit() {
        // TODO Maybe quit should trigger (Overwrite) to avoid extra typing
    }

    private static void removeMed() {
        // TODO Create some working method of choosing what line to remove from the medlist by only typing the name
    }

    private static void changeMed() {
        // TODO if possible create method for change of individual values in single line of meds
    }

    static long printDays() {
        // TODO get prevTime from save file for calculation of diffInDays and if needed convert it to Time from date
        LocalDateTime prevTime = LocalDateTime.of(2021, 10, 1, 0, 0);
        LocalDateTime nowTime = LocalDateTime.now();
        long diffInDays = java.time.Duration.between(prevTime, nowTime).toDays();

        System.out.println("Idag " + nowTime.toLocalDate() + " är det " + diffInDays + " dagar sedan senaste kontroll " + prevTime.toLocalDate());
        return diffInDays;
    }

}