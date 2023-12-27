public class Book implements Comparable<Book> {
    String title;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }
    String  author;
    int publishedYear;
    public Book(String title, String author, int publishedYear){
        this.author = author;
        this.title = title;
        this.publishedYear = publishedYear;
    }
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

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public int compareTo(Book Book) {
        return  title.compareTo(Book.getTitle());
    }
}
