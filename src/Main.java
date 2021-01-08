
public class Main {
	public static void main(String[] args) {
		Object o = new Object();
		
		System.out.println(o);
		System.out.println(o.toString());
		
		Book book = new Book();
		book.setTitle("java");
		book.setPage(300);
		
		System.out.println(book.getTitle());
		System.out.println(book.getPage());
		System.out.println(book.toString());
		
		System.out.println("================");
		Car c1 = new Car();
//		c1.setName("kia");
		System.out.println(c1.getName());
		
		System.out.println("================");
		House h1 = new House();
		h1.setName("white");
//		System.out.println(h1.getName());
		Book b1 = new Book();
		b1.setTitle("제목");
		b1.setPage(10);
		System.out.println(b1);
	}
}
