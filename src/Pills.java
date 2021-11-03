import java.time.LocalDate;

public class Pills extends Meds {
    public Pills (String name, int remaining, int bundles, int amountInBundle, int perDay, int extra, LocalDate date) {
        super (name, remaining, bundles, amountInBundle, perDay, extra, date);
    }

    public Pills() {

    }
}