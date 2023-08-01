package member.model;

public class Member {

	private String id;
	private String password;
	private String email;
	private String birth;
	private String tel;
	private String address;
	private int type;
	private int delete;

	public Member() {
	}

	public Member(String id, String password, String email, String birth, String tel, String address, int type,
			int delete) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
		this.birth = birth;
		this.tel = tel;
		this.address = address;
		this.type = type;
		this.delete = delete;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getDelete() {
		return delete;
	}

	public void setDelete(int delete) {
		this.delete = delete;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", email=" + email + ", birth=" + birth + ", tel=" + tel
				+ ", address=" + address + ", type=" + type + ", delete=" + delete + "]";
	}

}
