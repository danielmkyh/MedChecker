import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        MedList medList = new MedList();
        System.out.println(medList);
        Menu.menu();
    }

    public static void main2(String[] args) {
        MedList medList = new MedList();
        System.out.println(medList);
        Meds meds = new Meds("Kommunalgrå 30mg", 300, 2, 500, 5, 0, LocalDate.now());
        medList.addMeds(meds);
        medList.saveMeds();
        System.out.println(medList);
        medList.removeMeds(meds);
        medList.saveMeds();
        System.out.println(meds);
        System.out.println(medList);
    }
}