package G.model;

public class OrderMember {
	
	private int seq;
	private String Product_name;
	private int price;
	private String content;
	public OrderMember() {
		super();
	}
	public OrderMember(int seq, String product_name, int price, String content) {
		super();
		this.seq = seq;
		Product_name = product_name;
		this.price = price;
		this.content = content;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getProduct_name() {
		return Product_name;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "OrderMember [seq=" + seq + ", Product_name=" + Product_name + ", price=" + price + ", content="
				+ content + "]";
	}
	
	
	
	

}
