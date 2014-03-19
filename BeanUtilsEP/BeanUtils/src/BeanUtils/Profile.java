package BeanUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Profile {

	private String email;

	private Date birthDate;

	private Address[] addresses;

	private Map<String, String> phone;

	private HashMap<String, String> telephone;

	// 以下get,set
	public String getEmail(){
		return this.email;
	}
	
	public Date getBirthDate(){
		return this.birthDate;
	}
	
	public Address[] getAddresses(){
		return this.addresses;
	}
	
	public Map<String, String> getPhone(){
		return this.phone;
	}
	
	public HashMap<String, String> getTelephone(){
		return this.telephone;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setBirthDate(Date birthDate){
		this.birthDate = birthDate;
	}
	
	public void setAddresses(Address[] addresses){
		this.addresses = addresses;
		/*int i = 0;
		for(Address address: addresses){
			this.addresses[i] = address;
			i++;
		}*/
	}
	
	public void setPhone(Map<String, String> phone){
		this.phone = phone;
	}
	
	public void setTelephone(HashMap<String, String> telephone){
		this.telephone = telephone;
	}
}