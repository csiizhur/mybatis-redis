package domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class TUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8577760718341581879L;

	private int id;
	private String username;
	private String password;
	private Timestamp createtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
}
