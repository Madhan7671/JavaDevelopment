package Library_management.com.capgemini.com;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

@Entity
@Table(name="LibraryBooks")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bookId")
	private Long bookId;
	@Column(name="title", nullable=false)
	private String title;
	@Column(name="Author", nullable=false)
	private String Author_name;
	@NotBlank(message="it cannot be null")
	private String Genere;
	@Column(name="price", nullable=false)
	private Double Price;
	@Column(name="status")
	@NotBlank(message="it cannot be null")
	private String Status;
	@Column(name="publishedyear", nullable=false)
	private String PublishedYear;
	public Book() {
		
	}
	public Book(String title, String author_name, @NotBlank(message = "it cannot be null") String genere,
			Double price, @NotBlank(message = "it cannot be null") String status, String publishedYear) {
	
		this.title = title;
		Author_name = author_name;
		Genere = genere;
		Price = price;
		Status = status;
		PublishedYear = publishedYear;
	}
	
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor_name() {
		return Author_name;
	}
	public void setAuthor_name(String author_name) {
		Author_name = author_name;
	}
	public String getGenere() {
		return Genere;
	}
	public void setGenere(String genere) {
		Genere = genere;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getPublishedYear() {
		return PublishedYear;
	}
	public void setPublishedYear(String publishedYear) {
		PublishedYear = publishedYear;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", Author_name=" + Author_name + ", Genere=" + Genere
				+ ", Price=" + Price + ", Status=" + Status + ", PublishedYear=" + PublishedYear + "]";
	}
	
}
