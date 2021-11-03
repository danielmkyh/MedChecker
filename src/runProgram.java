import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class runProgram {
    static long printDays() {
        // Load time from save file and set prevTime to that to be able to calculate days passed since last check
        LocalDateTime prevTime = LocalDateTime.of(2021, 10, 1, 0, 0);
        LocalDateTime nowTime = LocalDateTime.now();
        long diffInDays = java.time.Duration.between(prevTime, nowTime).toDays();

//        LocalDate prevDate = LocalDate.of(2021,10,1);
//        LocalDate nowDate = LocalDate.now();
//        long diffInDays2 = java.time.Duration.between(prevDate, nowDate).toDays();

        System.out.println("Idag " + nowTime.toLocalDate() + " är det " + diffInDays + " dagar sedan senaste kontroll " + prevTime.toLocalDate());
        return diffInDays;
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        while (choice != 8) {
            switch (choice) {
                case 1:
                    System.out.println("1) Jasså du vill lägga till något nytt");
                    runProgram.addMed();
                    break;
                case 2:
                    System.out.println("2) Du vill justera något av attributen (Under construction)");
                    break;
                case 3:
                    System.out.println("3) Du vill ta bort ett preparat (Under construction)");
                    break;
                case 4:
                    System.out.println("4) Laddar in igen från filen");
                    MedList medList = new MedList();
                    break;
                case 5:
                    System.out.println("5) Här är den omräknade listan");
                    //MedList.viewMedList;
                    break;
                case 6:
                    System.out.println("6) ----- Huvudmeny -----");
                    printFullMenu();
                    break;
                case 7:
                    System.out.println("7) Sparar (Under construction)");
                    //MedList.saveMeds;
                    break;
                default:
                    //System.out.println("Du kan bara välja 1-5");
            }
            printMenu();
            choice = scan.nextInt();
        }
        System.out.println("Tack för denna gång!");


    }

    private static void printMenu() {
        // Compact menu:
        System.out.println("\nMeny: (1)Lägg till, (2)Ändra, (3)Ta bort, (4)Ladda om, (5)Aktuell lista, (6)Se full meny, (7)Spara (8)Avsluta \n >" );
    }

    private static void printFullMenu() {
        // Full main menu:
        System.out.println("1. Lägga till preparat");
        System.out.println("2. Ändra något av attributen");
        System.out.println("3. Ta bort ett preparat");
        System.out.println("4. Ladda om / Ångra alla ändringar och ladda in lista från fil igen");
        System.out.println("5. Se aktuell omräknad lista");
        System.out.println("6. Se denna meny");
        System.out.println("7. Spara");
        System.out.println("8. Avsluta");
        System.out.println(" >");
    }

    private static void addMed() {
        Scanner input = new Scanner(System.in);
        String[] newMed = new String[6];

        System.out.println("\nFyll i namn och styrka ex: Fruxo 50mg");
        newMed[0] = String.valueOf(input.next());
        System.out.println("Fyll i antal kvar som du redan har tagit ut ex: 250");
        newMed[1] = String.valueOf(input.next()); // Texten ovan skrivs ur men programmet verkar hoppa över denna ibland, vad kan orsaka detta?
        System.out.println("Fyll i hur många uttag du har kvar på befintliga recept ex: 2");
        newMed[2] = String.valueOf(input.next());
        System.out.println("Fyll i hur många får du ta ut per uttag ex: 200 ");
        newMed[3] = String.valueOf(input.next());
        System.out.println("Fyll i hur många du äter om dagen ex: 2");
        newMed[4] = String.valueOf(input.next());
        System.out.println("Fyll i hur många du får ta extra per dag ex: 1 ");
        newMed[5] = String.valueOf(input.next());


        System.out.println("-------------Summering-------------");
        System.out.println(newMed[0] + " jag har " + newMed[1] + "st kvar av och äter " + newMed[4] + "st om dagen och jag får ta " + newMed[5] + "st extra vid behov per dag.\n"
                + "Jag har " + newMed[2] + "st uttag kvar med " + newMed[3] + "st per uttag.");

//    public static void changeMed() {
//      // TODO
//    }
//
//    public static void removeMed() {
//      // TODO
//    }
//
//    public static void quit() {
//          // TODO Maybe quit should trigger (Overwrite) to avoid extra typing
//    }




    }

}