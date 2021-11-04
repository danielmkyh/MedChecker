import java.util.Scanner;

public class Menu {

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        while (choice != 8) {
            switch (choice) {
                case 1:
                    System.out.println("1) Fyll i följande: ");
                    runProgram.newMedObject();
                    break;
                case 2:
                    System.out.println("2) Justera någon befintlig i listan \n(Under construction)");
                    break;
                case 3:
                    System.out.println("3) Ta bort någon befintlig från listan \n(Under construction)");
                    break;
                case 4:
                    System.out.println("4) Laddar in igen från filen");
                    MedList medList = new MedList();
                    System.out.println(medList);
                    break;
                case 5:
                    System.out.println("5) Här är den omräknade listan \n(Under construction)");
                    break;
                case 6:
                    System.out.println(" ----- Huvudmeny -----");
                    printFullMenu();
                    break;
                case 7:
                    System.out.println("7) Sparar \n(Under construction)");
                    break;
                default:

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

}
