import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class LibAPP {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BookDAO bookDAO = new BookDAO();
        MemberDAO memberDAO = new MemberDAO();
        TransctionDAO transactionDAO = new TransctionDAO();

        while (true) {
            System.out.println("\n=== Library Management Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add Member");
            System.out.println("4. View Members");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. View Transactions");
            System.out.println("8. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: // Add Book
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    try {
                        bookDAO.AddBooks(new Book(title,0, author, true));
                        System.out.println("✅ Book added successfully.");
                    } catch (SQLException e) {
                        System.out.println("❌ Error: " + e.getMessage());
                    }
                    break;

                case 2: // View Books
                    try {
                        List<Book> books = bookDAO.getALLBooks();
                        for (Book b : books) {
                            System.out.println(b.getTitle() + " - " + b.getId() + " by " + b.getAuthor() +
                                    (b.getAvailable() ? " [Available]" : " [Issued]"));
                        }
                    } catch (SQLException e) {
                        System.out.println("❌ Error: " + e.getMessage());
                    }
                    break;

                case 3: // Add Member
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();


                    try {
                        memberDAO.AddMembers(new Member(0, name, email));
                        System.out.println("✅ Member added successfully.");
                    } catch (SQLException e) {
                        System.out.println("❌ Error: " + e.getMessage());
                    }
                    break;

                case 4: // View Members
                    try {
                        List<Member> members = memberDAO.getALLMembers();
                        for (Member m : members) {
                            System.out.println(m.getId() + " - " + m.getName() + " (" + m.getEmail() + ") - " );
                        }
                    } catch (SQLException e) {
                        System.out.println("❌ Error: " + e.getMessage());
                    }
                    break;

                case 5: // Issue Book
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    System.out.print("Enter Member ID: ");
                    int memberId = sc.nextInt();
                    try {
                        transactionDAO.issueBook(bookId, memberId);
                        System.out.println("✅ Book issued successfully.");
                    } catch (SQLException e) {
                        System.out.println("❌ Error: " + e.getMessage());
                    }
                    break;

                case 6: // Return Book
                    System.out.print("Enter Transaction ID: ");
                    int transactionId = sc.nextInt();
                    try {
                        transactionDAO.returnBook(transactionId);
                        System.out.println("✅ Book returned successfully.");
                    } catch (SQLException e) {
                        System.out.println("❌ Error: " + e.getMessage());
                    }
                    break;

                case 7: // View Transactions
                    try {
                        List<Transction> txns = transactionDAO.getAllTransactions();
                        for (Transction t : txns) {
                            System.out.println(t.getId() + " - BookID: " + t.getBookId() +
                                    ", MemberID: " + t.getMemberId() +
                                    ", Issued: " + t.getIsAsueDate() +
                                    ", Returned: " + (t.getReturnDate() != null ? t.getReturnDate() : "Not Returned"));
                        }
                    } catch (SQLException e) {
                        System.out.println("❌ Error: " + e.getMessage());
                    }
                    break;

                case 8: // Exit
                    System.out.println("👋 Exiting system...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("⚠ Invalid choice! Try again.");
            }
        }
    }
}
