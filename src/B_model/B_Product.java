package B_model;

public class B_Product {
	
	private int seq;
	private int rowNum;
	private String title;
	private String content;
	private String register;
	private String reg_date;
	private String modifier;
	private String mod_date;
	private String delete_yn;
	private String url;
	private int category;
	
public B_Product(int seq, String title, String content, String register, String reg_date) {
		super();
		this.seq = seq;
		this.title = title;
		this.content = content;
		this.register = register;
		this.reg_date = reg_date;
	}

public B_Product() {
		
	}

public B_Product(int seq, String title, String content, String register, String reg_date, String modifier,
		String mod_date, String delete_yn, String url, int category) {
	super();
	this.seq = seq;
	this.title = title;
	this.content = content;
	this.register = register;
	this.reg_date = reg_date;
	this.modifier = modifier;
	this.mod_date = mod_date;
	this.delete_yn = delete_yn;
	this.url = url;
	this.category = category;
}

public int getSeq() {
	return seq;
}

public void setSeq(int seq) {
	this.seq = seq;
}

public int getRowNum() {
	return rowNum;
}

public void setRowNum(int rowNum) {
	this.rowNum = rowNum;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
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

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public int getCategory() {
	return category;
}

public void setCategory(int category) {
	this.category = category;
}

@Override
public String toString() {
	return "B_Product [seq=" + seq + ", title=" + title + ", content=" + content + ", register=" + register
			+ ", reg_date=" + reg_date + ", modifier=" + modifier + ", mod_date=" + mod_date + ", delete_yn="
			+ delete_yn + ", url=" + url + ", category=" + category + "]";
}



}