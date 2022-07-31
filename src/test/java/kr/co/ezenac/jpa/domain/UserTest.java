package kr.co.ezenac.jpa.domain;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class UserTest {

	@Test
	void test() {
		User user = new User();
		user.setEmail("ezen@gmail.com");
		user.setName("ezen");
		
		System.out.println(">>> " + user);
		
		User user2 = new User("ezenIt", "ezenit@gmail.com", LocalDateTime.now(), LocalDateTime.now());
		System.out.println(">>> " + user2);
		
		User user3 = new User("ezenItAcademy", "ezenItAcademy@gmail.com");
		System.out.println(">>> " + user3);
		
		User user4 = User.builder()
				.name("theezen")
				.email("ezenezen@gmail.com")
				.build();
		System.out.println(">>> " + user4);
	}
}
