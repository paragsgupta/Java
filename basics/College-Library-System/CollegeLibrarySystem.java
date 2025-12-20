public class CollegeLibrarySystem {
    public static void main(String[] args) {

        Library library = new Library();

        // Adding books to library
        library.addBook(new Book("Java Programming", "James Gosling"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));
        library.addBook(new Book("Database Systems", "Raghu Ramakrishnan"));

        // Show books
        library.showAllBooks();

        // Issue a book
        System.out.println("\nIssuing a book...");
        library.issueBook("Java Programming");

        // Return a book
        System.out.println("\nReturning a book...");
        library.returnBook("Java Programming");

        // Show updated list
        library.showAllBooks();
    }
}
