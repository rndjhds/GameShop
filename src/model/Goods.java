package model;

public class Goods {
	
	private int seq;
	private String product_name;
	private int price;
	private String content;
	private String register;
	private String reg_date;
	private String modifier;
	private String mod_date;
	private String delete_yn;
	private String img;
	public Goods() {
		super();
	}
	public Goods(int seq, String product_name, int price, String content, String register, String reg_date,
			String modifier, String mod_date, String delete_yn, String img) {
		super();
		this.seq = seq;
		this.product_name = product_name;
		this.price = price;
		this.content = content;
		this.register = register;
		this.reg_date = reg_date;
		this.modifier = modifier;
		this.mod_date = mod_date;
		this.delete_yn = delete_yn;
		this.img = img;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
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
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public String getMod_date() {
		return mod_date;
	}
	public void setMod_date(String mod_date) {
		this.mod_date = mod_date;
	}
	public String getDelete_yn() {
		return delete_yn;
	}
	public void setDelete_yn(String delete_yn) {
		this.delete_yn = delete_yn;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "Goods [seq=" + seq + ", product_name=" + product_name + ", price=" + price + ", content=" + content
				+ ", register=" + register + ", reg_date=" + reg_date + ", modifier=" + modifier + ", mod_date="
				+ mod_date + ", delete_yn=" + delete_yn + ", img=" + img + "]";
	}
	
	
}
