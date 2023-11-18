public class Main {
   public static void main(String[] args) {
   System.out.println();

    Library lib = new Library(5);

    Author author_1 = new Author("Чарлз", "Дарвин");
    Book book_1 = new Book("\"Происхождение видов\"", author_1, 1859);

    Author author_2 = new Author("Уильям", "Гибсон");
    Book book_2 = new Book("\"Нейромант\"", author_2, 1980);

    Author author_2_copy = new Author("Уильям", "Гибсон");
    Book book_2_copy = new Book("\"Нейромант\"", author_2_copy, 1980);

    lib.addBook(book_1);
    lib.addBook(book_2);
    lib.addBook(book_2_copy);

    lib.printBooks();

    System.out.println();

    lib.getBookByTitle("\"Происхождение видов\"");

    System.out.println();

    lib.setYearByTitle("\"Происхождение видов\"", 1862);

    System.out.println();
    System.out.println("********** Отладка методов equals() и hashCode() **********");
       System.out.println("Копии авторов равны: " + author_2.equals(author_2_copy));
       System.out.println("Копии авторов равны по hashCode: " + (author_2.hashCode() == author_2_copy.hashCode()));
       System.out.println("Авторы равны: " + author_1.equals((author_2)));
       System.out.println("Авторы равны по hashCode: " + (author_1.hashCode() == author_2.hashCode()));
       System.out.println();
       System.out.println("Копии книг равны: " + book_2.equals(book_2_copy));
       System.out.println("Копии книг равны по hashCode: " + (book_2.hashCode() == book_2_copy.hashCode()));
       System.out.println("Книги равны: " + book_1.equals((book_2)));
       System.out.println("Книги равны по hashCode: " + (book_1.hashCode() == book_2.hashCode()));

    System.out.println();
    System.out.println(lib);
   }
}