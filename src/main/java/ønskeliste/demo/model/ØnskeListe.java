package ønskeliste.demo.model;

public class ØnskeListe {
    private int ØnskeListeID;
    private String ØnskeListeTitle;
    private String ØnskeListeEmail;

    public ØnskeListe(int ønskelisteID, String ønskeListeTitle, String ønskeListeEmail) {
        this.ØnskeListeID = ønskelisteID;
        this.ØnskeListeTitle = ønskeListeTitle;
        this.ØnskeListeEmail = ønskeListeEmail;
    }
    public ØnskeListe(){}

    public int getØnskeListeID() {
        return ØnskeListeID;
    }

    public String getØnskeListeTitle() {
        return ØnskeListeTitle;
    }

    public String getØnskeListeEmail() {
        return ØnskeListeEmail;
    }

    public void setØnskeListeID(int ønskeListeID) {
        ØnskeListeID = ønskeListeID;
    }

    public void setØnskeListeTitle(String ønskeListeTitle) {
        ØnskeListeTitle = ønskeListeTitle;
    }

    public void setØnskeListeEmail(String ønskeListeEmail) {
        ØnskeListeEmail = ønskeListeEmail;
    }

    @Override
    public String toString() {
        return "ØnskeListe{" +
                "ØnskeListeID=" + ØnskeListeID +
                ", ØnskeListeTitle='" + ØnskeListeTitle + '\'' +
                ", ØnskeListeEmail='" + ØnskeListeEmail + '\'' +
                '}';
    }
}
