import java.util.Objects;

public class Book {
   private final String title;
   private final Author author;
   private int pblctnYear;

   public Book(String title, Author author, int pblctnYear) {
       this.title = title;
       this.author = author;
       this.pblctnYear = pblctnYear;
   }
   public String getTitle() {
       return this.title;
   }
   public Author getAuthor() {
       return this.author;
   }
   public int getPblctnYear() {
       return this.pblctnYear;
   }
   public void setPblctnYear(int pblctnYear) {
       this.pblctnYear = pblctnYear;
   }
   @Override
   public String toString(){
       return title + " написана автором: " + author + " и опубликована в " + pblctnYear + " году.";
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pblctnYear == book.pblctnYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, pblctnYear);

    }
}
