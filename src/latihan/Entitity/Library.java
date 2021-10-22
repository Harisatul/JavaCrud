package latihan.Entitity;

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
}
