package demo;
import java.lang.reflect.InvocationTargetException;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import BeanUtils.Address;
import BeanUtils.Profile;
import BeanUtils.User;

/**
 * @author Chris Wong
 * <p>
 * <a href="http://pclevin.blogspot.hk/2012/06/javaapachebeanutils.html">BeanUtilExample</a>
 * </p>
 */
public class BeanUtilExample {

	// 建立假資料
	public User prepareDate() throws IllegalAccessException,
			InvocationTargetException {
		Profile profile = new Profile();

		profile.setEmail("pp@gmail.com");
		profile.setBirthDate(new GregorianCalendar(2012, 06, 16).getTime());

		Map<String, String> phone = new HashMap<String, String>();
		phone.put("home", "(03)XXXXXXX");
		phone.put("office", "(02)1234-5678");
		phone.put("mobile", "09XX-XXX-XXX");
		profile.setPhone(phone);

		Address addr1 = new Address("台灣省", "桃園縣中壢市", "XX路", "100001");
		Address addr2 = new Address("台灣省", "台北市中山區", "XXX路", "100002");
		Address[] address = { addr1, addr2 };
		profile.setAddresses(address);

		User user = new User();
		user.setUserId(new Long(123456789));
		user.setUsername("puma");
		user.setPassword("987654321");
		user.setAttribute("男");
		user.setProfile(profile);

		return user;
	}

	public static void main(String[] args) {

		BeanUtilExample example = new BeanUtilExample();

		try {
			User user = example.prepareDate();
			// 取值方式
			System.out.println(BeanUtils.getProperty(user, "userId"));
			System.out.println(PropertyUtils.getProperty(user, "userId"));
			System.out.println(BeanUtils.getProperty(user, "username"));
			System.out.println(BeanUtils.getProperty(user, "password"));
			System.out.println(BeanUtils.getProperty(user, "attribute"));
			System.out.println(BeanUtils.getProperty(user, "profile"));
			System.out.println(BeanUtils.getProperty(user, "profile.email"));
			System.out
					.println(BeanUtils.getProperty(user, "profile.birthDate"));
			System.out.println(BeanUtils.getProperty(user, "profile.phone"));
			System.out.println(BeanUtils.getProperty(user,
					"profile.phone(mobile)"));
			System.out.println(BeanUtils.getProperty(user,
					"profile.phone(office)"));
			System.out.println(BeanUtils.getProperty(user,
					"profile.phone(home)"));
			System.out.println(BeanUtils.getProperty(user,
					"profile.addresses[0].country"));
			System.out.println(BeanUtils.getProperty(user,
					"profile.addresses[0].city"));
			System.out.println(BeanUtils.getProperty(user,
					"profile.addresses[0].postcode"));

			System.out
					.println("--------------------------------------------------------------------");

			User user2 = new User();
			BeanUtils.copyProperties(user2, user); // 將user這物件轉至user2
			System.out.println(BeanUtils.getProperty(user2, "userId")); // 輸出user類的userId的值
			System.out.println(PropertyUtils.getProperty(user2, "userId"));
			System.out.println(BeanUtils.getProperty(user2, "username"));
			System.out.println(BeanUtils.getProperty(user2, "password"));
			System.out.println(BeanUtils.getProperty(user2, "profile"));
			System.out.println(BeanUtils.getProperty(user2, "profile.email"));
			System.out.println(BeanUtils
					.getProperty(user2, "profile.birthDate"));
			System.out.println(BeanUtils.getProperty(user2, "profile.phone"));
			System.out.println(BeanUtils.getProperty(user2,
					"profile.phone(mobile)"));
			System.out.println(BeanUtils.getProperty(user2,
					"profile.phone(office)"));
			System.out.println(BeanUtils.getProperty(user2,
					"profile.phone(home)"));
			System.out.println(BeanUtils.getProperty(user2,
					"profile.addresses[0].country"));
			System.out.println(BeanUtils.getProperty(user2,
					"profile.addresses[0].city"));
			System.out.println(BeanUtils.getProperty(user2,
					"profile.addresses[0].postcode"));

			System.out
					.println("--------------------------------------------------------------------");

			Profile profile = new Profile();
			HashMap<String, String> map = new HashMap<String, String>();

			map.put("1", "13880808080");
			map.put("2", "13550505050");
			BeanUtils.setProperty(profile, "telephone", map);
			System.out.println(BeanUtils.getProperty(profile, "telephone(1)"));

		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}