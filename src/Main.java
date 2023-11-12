public class Main {
   public static void main(String[] args) {
   System.out.println();

    Library lib = new Library(5);

    Author author_1 = new Author("Чарлз", "Дарвин");
    Book book_1 = new Book("\"Происхождение видов\"", author_1, 1859);

    Author author_2 = new Author("Уильям", "Гибсон");
    Book book_2 = new Book("\"Нейромант\"", author_2, 1980);
        book_2.setPblctnYear(1984);

    lib.addBook(book_1);
    lib.addBook(book_2);

    lib.printBooks();

    System.out.println();

    lib.getBookByTitle("\"Происхождение видов\"");

    System.out.println();

    lib.setYearByTitle("\"Происхождение видов\"", 1862);
    }



}