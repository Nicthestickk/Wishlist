package ønskeliste.demo.model;

public class Ønske {

    private int id;
    private String navn;
    private String link;
    private String beskrivelse;
    private int ØnskeListeID;

    public Ønske(int id, String navn, String link, String beskrivelse, int ØnskeListeID) {
        this.id = id;
        this.navn = navn;
        this.link = link;
        this.beskrivelse = beskrivelse;
        this.ØnskeListeID = ØnskeListeID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    public int getØnskeListeID() {
        return ØnskeListeID;
    }
    public void setØnskeListeID(int ønskeListeID) {
        ØnskeListeID = ønskeListeID;
    }

    @Override
    public String toString() {
        return "Ønske{" +
                "id=" + id +
                ", navn='" + navn + '\'' +
                ", link='" + link + '\'' +
                ", beskrivelse='" + beskrivelse + '\'' +
                ", ØnskeListeID=" + ØnskeListeID +
                '}';
    }
}
