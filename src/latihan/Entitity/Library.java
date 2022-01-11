package latihan.Entitity;

import java.util.Objects;

public class Library {

    private String titleName;
    private String publsiher;
    private String author;
    private int year;

    public Library(String titleName, String publsiher, String author, int year) {
        this.titleName = titleName;
        this.publsiher = publsiher;
        this.author = author;
        this.year = year;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getPublsiher() {
        return publsiher;
    }

    public void setPublsiher(String publsiher) {
        this.publsiher = publsiher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Library{" +
                "titleName='" + titleName + '\'' +
                ", publsiher='" + publsiher + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return year == library.year && titleName.equals(library.titleName) && publsiher.equals(library.publsiher) && author.equals(library.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleName, publsiher, author, year);
    }
}
