import java.util.Date;

public class Transction {
    private int id;
    private int bookId;
    private int memberId;
    private Date issueDate;
    private Date returnDate;

    @Override
    public String toString() {
        return id + " | Book:" + bookId + " | Member:" + memberId + " | Issued:" + issueDate + " | Returned:" + (returnDate != null ? returnDate : "-" );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Date getIsAsueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Transction(int id, int bookId, int memberId, Date issueDate, Date returnDate) {
        this.id = id;
        this.bookId = bookId;
        this.memberId = memberId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }
}
