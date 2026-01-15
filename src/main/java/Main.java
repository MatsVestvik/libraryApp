import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAO();
        Book newBook = new Book(2, "Chocolate Chip", "Birgitte", "This is how you make chocolate chip cookies."); // Example book with ID 1
        
        try {
            bookDAO.addBook(newBook);
            Book retrievedBook = bookDAO.getBookById(7);
            System.out.println("Retrieved Book: " + retrievedBook.getText());
            // bookDAO.deleteAllBooks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}