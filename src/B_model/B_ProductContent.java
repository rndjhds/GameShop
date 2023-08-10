package B_model;

public class B_ProductContent {

	int seq;
	String content;
	String register;
	String reg_date;
	String modifier;
	String mod_date;
	String delete_yn;
	
	
	
	public B_ProductContent(int seq, String content, String register, String reg_date, String delete_yn) {
		super();
		this.seq = seq;
		this.content = content;
		this.register = register;
		this.reg_date = reg_date;
		this.delete_yn = delete_yn;
	}
	public B_ProductContent(int seq, String content, String register, String reg_date, String modifier, String mod_date,
			String delete_yn) {
		super();
		this.seq = seq;
		this.content = content;
		this.register = register;
		this.reg_date = reg_date;
		this.modifier = modifier;
		this.mod_date = mod_date;
		this.delete_yn = delete_yn;
	}
	public B_ProductContent() {
		super();
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
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
	@Override
	public String toString() {
		return "B_ProductContent [seq=" + seq + ", content=" + content + ", register=" + register + ", reg_date="
				+ reg_date + ", modifier=" + modifier + ", mod_date=" + mod_date + ", delete_yn=" + delete_yn + "]";
	}
	
	
}
