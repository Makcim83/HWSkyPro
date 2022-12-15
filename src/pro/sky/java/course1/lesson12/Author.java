package pro.sky.java.course1.lesson12;

public class Author {
    private String name;
    private String family;

    public Author (String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String getName() {
        return name;
    }
    public String getFamily() {
        return family;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setFamily(String family) {
        this.family = family;
    }
}
