import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAO();
        Book newBook = new Book(2, "Chocolate Chip", "Birgitte", "This is how you make chocolate chip cookies."); // Example book with ID 1
        
        try {
            bookDAO.deleteAllBooks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}