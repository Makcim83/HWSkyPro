package pro.sky.java.course1.lesson13;

import java.util.Objects;

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

    @Override
    public String toString() {
        return name + " " + family;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && family.equals(author.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, family);
    }
}