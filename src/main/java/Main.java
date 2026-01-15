import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAO();
        Book newBook = new Book(1); // Example book with ID 1
        
        try {
            int bookId = bookDAO.addBook(newBook);
            if (bookId != -1) {
                System.out.println("Book added with ID: " + bookId);
            } else {
                System.out.println("Failed to add book.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}