import java.io.Serializable;
import java.time.LocalDate;

//
public class Meds implements Serializable {

    protected String name;
    protected int remaining;
    protected int bundles;
    protected int amountInBundle;
    protected int perDay;
    protected int extra;
    protected LocalDate lastDate;

    public Meds() {

    }

    public Meds(String name, int remaining, int bundles, int amountInBundle, int perDay, int extra, LocalDate date) {
        this.name = name;
        this.remaining = remaining;
        this.bundles = bundles;
        this.amountInBundle = amountInBundle;
        this.perDay = perDay;
        this.extra = extra;
        this.lastDate = date;
    }

    public void consume(int days) {
        int consumed = days * perDay;
        remaining = remaining - consumed;
//        // Behöver en variabel för antal dagar kvar men skall den hanteras här?
//        int dagarKvar = ((uttagKvar*antalPerUttag)+antalKvar)/konsPerDag;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getRemaining() {

        return remaining;
    }

    public void setRemaining(int remaining) {

        this.remaining = remaining;
    }

    public int getBundles() {

        return bundles;
    }

    public void setBundles(int bundles) {

        this.bundles = bundles;
    }

    public int getAmountInBundle() {

        return amountInBundle;
    }

    public void setAmountInBundle(int amountInBundle) {

        this.amountInBundle = amountInBundle;
    }

    public int getPerDay() {

        return perDay;
    }

    public void setPerDay(int perDay) {

        this.perDay = perDay;
    }

    public int getExtra() {

        return extra;
    }

    public void setExtra(int extra) {

        this.extra = extra;
    }

    public LocalDate getLastDate() {

        return lastDate;
    }

    public void setLastDate(LocalDate lastDate) {

        this.lastDate = lastDate;
    }

    @Override
    public String toString() {
        return name + "," + remaining + "," + bundles + "," + amountInBundle + "," + perDay + "," + extra + "," + lastDate.toString();
    }

    public String toStringWithoutDate() {
        return name + "," + remaining + "," + bundles + "," + amountInBundle + "," + perDay + "," + extra;
    }
}