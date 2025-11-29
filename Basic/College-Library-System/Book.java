class Book {
    private String title;
    private String author;
    private boolean isIssued;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    // Issue Book
    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued: " + title);
        } else {
            System.out.println("Book is already issued.");
        }
    }

    // Return Book
    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("This book wasn't issued.");
        }
    }

    // Display book information
    public void showDetails() {
        System.out.println("Title: " + title + " | Author: " + author + " | Status: " + (isIssued ? "Issued" : "Available"));
    }
}
