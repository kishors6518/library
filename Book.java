package library;
class Book 
{
    private String title;
    private String author;
    private String type;
    private long ISBN;

    public Book(String title, String author,String type,long ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.type=type;
    }
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Type: "+type+", ISBN: " + ISBN;
    }
}





