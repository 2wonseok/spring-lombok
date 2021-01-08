import lombok.Data;

@Data
public class Book {
	private String title;
	private int page;
	
	public String toString() {
		return "제목은: " + title+ " 페이지는: " + page;
		
	}

}
