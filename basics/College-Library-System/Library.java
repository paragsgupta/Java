import java.util.ArrayList;

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add new book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Issue book
    public void issueBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.issueBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    // Return book
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    // Show all books
    public void showAllBooks() {
        System.out.println("\n--- Library Books ---");
        for (Book book : books) {
            book.showDetails();
        }
    }
}
