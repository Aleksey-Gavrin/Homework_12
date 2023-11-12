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
}
