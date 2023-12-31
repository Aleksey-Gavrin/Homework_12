public class Library {
    private final Book[] library;
    private int currentIndex = 0;
    public Library(int size) {
        this.library = new Book[size];
    }
    public void addBook(Book newBook){
        if (currentIndex < library.length) {
            library[currentIndex] = newBook;
            currentIndex++;
        }
    }
    public void printBooks() {
        for (Book book : library) {
            if (book != null) {
                System.out.println(book.getAuthor() + ": " + book.getTitle() + ": " + book.getPblctnYear());
            }
        }
    }
    public void getBookByTitle(String title) {
        boolean match = false;
        for (Book book : library) {
            if (book != null && book.getTitle().equals(title)) {
                System.out.println(book);
                match = true;
            }
        }
        if (!match) {
            System.out.println("Такой книги нет в библиотеке.");
        }
    }
    public void setYearByTitle(String title, int year) {
        boolean match = false;
        for (Book book : library) {
            if (book != null && book.getTitle().equals(title)) {
                book.setPblctnYear(year);
                System.out.println("Для книги " + book.getTitle() + ", написанной " + book.getAuthor() + ", год публикации" +
                        " изменен на " + book.getPblctnYear());
                match = true;
            }
        }
        if (!match) {
            System.out.println("Такой книги нет в библиотеке.");
        }
    }
    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("Library:" + "\n");
        for (Book book : library) {
            if (book != null) {
                out.append(book).append("\n");
            }
        }
        return String.valueOf(out);

    }
}

