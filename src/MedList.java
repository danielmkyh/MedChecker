import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MedList {

    public ArrayList<Meds> medlist;

    public MedList() {
        medlist = new ArrayList<>();
        loadMeds();
    }

    public void loadMeds() {
        File inventoryFile = null;
        Scanner inventoryScanner = null;
        try {
            inventoryFile = new File("./inventory/inventory.csv");
            inventoryScanner = new Scanner(inventoryFile);
            while(inventoryScanner.hasNextLine()) {
                String line = inventoryScanner.nextLine();
                String[] data = line.split(",");
                Meds meds = createMedsObject(data);
                medlist.add(meds);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if(inventoryScanner != null) {
                inventoryScanner.close();
            }
        }
    }

    public void saveMeds() {
        File file = new File("./inventory/inventory.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);
            for(Meds meds : medlist) {
                fileWriter.write(meds.toStringWithoutDate());
                fileWriter.write(",");
                fileWriter.write(LocalDate.now().toString());
                fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Could not save the meds list");
        }
    }

    private Meds createMedsObject(String[] data) {
        if(data.length != 7) {
            throw new IndexOutOfBoundsException("Line had more or less than 7 fields when reading inventory");
        }
        String name = data[0];
        int remaining = Integer.parseInt(data[1]);
        int bundles = Integer.parseInt(data[2]);
        int amountInBundle = Integer.parseInt(data[3]);
        int perDay = Integer.parseInt(data[4]);
        int extra = Integer.parseInt(data[5]);
        LocalDate date = LocalDate.parse(data[6]);
        return new Meds(name, remaining, bundles, amountInBundle, perDay, extra, date);
    }

    public void addMeds(Meds meds) {

        medlist.add(meds);
    }

    public void removeMeds(Meds meds) {

        medlist.remove(meds);
    }


    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("[\n");
        for(Meds meds :medlist) {
            strBuilder.append("\t");
            strBuilder.append(meds.toString());
            strBuilder.append(",\n");
        }
        strBuilder.append("]");
        return strBuilder.toString();
    }
}