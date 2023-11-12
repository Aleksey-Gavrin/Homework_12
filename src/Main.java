public class Main {
   static Book[] books = new Book[5];
   private static int currentIndex = 0;
   public static void main(String[] args) {
   System.out.println();

    Author author_1 = new Author("Чарлз", "Дарвин");
    Book book_1 = new Book("\"Происхождение видов\"", author_1, 1859);

    Author author_2 = new Author("Уильям", "Гибсон");
    Book book_2 = new Book("\"Нейромант\"", author_2, 1980);
        book_2.setPblctnYear(1984);

    addBook(book_1);
    addBook(book_2);
    printBooks();
    }


    public static void addBook(Book newBook){
        if (currentIndex < books.length) {
            books[currentIndex] = newBook;
            currentIndex++;
        }
    }
    public static void printBooks() {
        for (Book book : books) {
            if (book != null) {
            System.out.println(book.getAuthor() + ": " + book.getTitle() + ": " + book.getPblctnYear());
            }
        }
    }
}