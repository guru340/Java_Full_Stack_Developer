public class Book {

    private String title;
    private int id;
    private String Author;
    private Boolean Available;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public Boolean getAvailable() {
        return Available;
    }

    @Override
    public String toString() {
        return title+" | "+Author+" | "+id+" --> "+Available;
    }

    public void setAvailable(Boolean available) {
        Available = available;
    }

    public Book(String title, int id, String author, Boolean available) {
        this.title = title;
        this.id = id;
        Author = author;
        Available = available;
    }
}
