package BeanUtils;

public class Address {

	private String country;

	private String city;

	private String addr;

	private String postcode;

	public Address(String country, String city, String addr, String postcode) {
		this.country = country;
		this.city = city;
		this.addr = addr;
		this.postcode = postcode;
	}

	// 以下get,set
	
	public String getCountry(){
		return this.country;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public String addr(){
		return this.addr;
	}
	
	public String getPostcode(){
		return this.postcode;
	}
	
	public void setCountry(String country){
		this.country = country;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public void setAddr(String addr){
		this.addr = addr;
	}
	
	public void setPostCode(String postcode){
		this.postcode = postcode;
	}
}