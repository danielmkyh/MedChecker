import java.io.Serializable;
import java.time.LocalDate;

// Jag skapade denna som huvud Meds class ifall jag skall addera mer än bara Pills som skall kunna ärva från den
public class Meds implements Serializable {

    protected String preparat;
    protected int antalKvar;
    protected int uttagKvar;
    protected int antalPerUttag;
    protected int konsPerDag;
    protected int evExtraPerDag;
    protected LocalDate lastDate;

    public Meds() {

    }

    public Meds(String preparat, int antalKvar, int uttagKvar, int antalPerUttag, int konsPerDag, int evExtraPerDag, LocalDate date) {
        this.preparat = preparat;
        this.antalKvar = antalKvar;
        this.uttagKvar = uttagKvar;
        this.antalPerUttag = antalPerUttag;
        this.konsPerDag = konsPerDag;
        this.evExtraPerDag = evExtraPerDag;
        this.lastDate = date;
    }



    public void consume(int days) {
        int antalConsumed = days * konsPerDag;
        antalKvar = antalKvar - antalConsumed;
//        // Behöver en variabel för antal dagar kvar men skall den hanteras här?
//        int dagarKvar = ((uttagKvar*antalPerUttag)+antalKvar)/konsPerDag;
    }

    public String getPreparat() {
        return preparat;
    }

    public void setPreparat(String preparat) {
        this.preparat = preparat;
    }

    public int getAntalKvar() {
        return antalKvar;
    }

    public void setAntalKvar(int antalKvar) {
        this.antalKvar = antalKvar;
    }

    public int getUttagKvar() {
        return uttagKvar;
    }

    public void setUttagKvar(int uttagKvar) {
        this.uttagKvar = uttagKvar;
    }

    public int getAntalPerUttag() {
        return antalPerUttag;
    }

    public void setAntalPerUttag(int antalPerUttag) {
        this.antalPerUttag = antalPerUttag;
    }

    public int getKonsPerDag() {
        return konsPerDag;
    }

    public void setKonsPerDag(int konsPerDag) {
        this.konsPerDag = konsPerDag;
    }

    public int getEvExtraPerDag() {
        return evExtraPerDag;
    }

    public void setEvExtraPerDag(int evExtraPerDag) {
        this.evExtraPerDag = evExtraPerDag;
    }

//    @Override
//    public String toString() {
//        return preparat + " " + antalKvar + "st kvar " + uttagKvar + "x" + antalPerUttag  + "st uttag kvar " + " --- " + " Äter "+ konsPerDag + "st per dag " + evExtraPerDag + "st vid behov";
//    }


    public LocalDate getLastDate() {
        return lastDate;
    }

    public void setLastDate(LocalDate lastDate) {
        this.lastDate = lastDate;
    }

    @Override
    public String toString() {
        return preparat + "," + antalKvar + "," + uttagKvar + "," + antalPerUttag + "," + konsPerDag + "," + evExtraPerDag + "," + lastDate.toString();
    }

    public String toStringWithoutDate() {
        return preparat + "," + antalKvar + "," + uttagKvar + "," + antalPerUttag + "," + konsPerDag + "," + evExtraPerDag;
    }
}