package ønskeliste.demo.model;

import java.util.Objects;

public class Ønske {

    private int ID;
    private String title;
    private String URL;
    private String beskrivelse;

    public Ønske(int id, String title, String URL, String beskrivelse) {
        this.ID = id;
        this.title = title;
        this.URL = URL;
        this.beskrivelse = beskrivelse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, URL);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }


    @Override
    public String toString() {
        return "Ønsker{" +
                "id=" + ID +
                ", title='" + title + '\'' +
                ", URL='" + URL + '\'' +
                ", beskrivelse='" + beskrivelse + '\'' +
                '}';
    }
}
