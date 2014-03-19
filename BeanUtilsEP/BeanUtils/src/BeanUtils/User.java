package BeanUtils;

public class User {

	private String username;

	private String password;

	private String attribute;

	private Long userId;

	private Profile profile;

	// 以下get,set
	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

	public String getAttribute() {
		return this.attribute;
	}

	public Long getUserId() {
		return this.userId;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
}