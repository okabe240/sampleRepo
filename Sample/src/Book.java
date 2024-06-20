public class Book {
	private String title;
	private String author;
	private int price;
	
	public void setBookInfo(String t, String a, int p) {
		setTitle(t);
		setAuthor(a);
		setPrice(p);
	}
	
	public void getBookInfo() {
		System.out.println("タイトル：" + getTitle() + " 著者：" + getAuthor() + " 価格：" + getPrice());
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

