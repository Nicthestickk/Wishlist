package ønskeliste.demo.model;

public class Ønske {

    private String id;
    private String name;
    private String link;
    private String description;

    public Ønske(String id, String length, String title, String subject, String popularity, String awards) {
    }

    public Ønske(String id, String name, String link, String description) {
        this.id = id;
        this.name = name;
        this.link = link;
        this.description = description;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return"Ønsker{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
