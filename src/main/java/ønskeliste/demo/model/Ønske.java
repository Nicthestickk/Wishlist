package ønskeliste.demo.model;

public class Ønske {

    private String id;
    private String navn;
    private String link;
    private String beskrivelse;
    private int ønskeListeID;
    public Ønske(String id, String length, String title, String subject, String popularity, String awards) {
    }

    public Ønske(String id, String navn, String link, String beskrivelse) {
        this.id = id;
        this.navn = navn;
        this.link = link;
        this.beskrivelse = beskrivelse;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    @Override
    public String toString() {
        return"Ønsker{" +
                "id='" + id + '\'' +
                ", name='" + navn + '\'' +
                ", link='" + link + '\'' +
                ", description='" + beskrivelse + '\'' +
                '}';

    }
}
