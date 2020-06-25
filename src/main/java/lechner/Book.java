package lechner;


public class Book {
    private String title;
    private String author;
    private String language;
    private String genre;
    private Integer length;

    public Book(String title, String author, String language, String genre, Integer length) {
        this.title = title;
        this.author = author;
        this.language = language;
        this.genre = genre;
        this.length = length;
    }
//Getter & Setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", genre='" + genre + '\'' +
                ", length=" + length +
                '}';
    }
}