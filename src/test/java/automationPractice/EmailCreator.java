package automationPractice;

import java.util.Date;

public class EmailCreator {
	
	private String email;

	public EmailCreator() {
		StringBuilder sb = new StringBuilder();
		Date utc = new Date();
		sb.append("user_");
		sb.append(utc.getTime());
		sb.append("@domain.com");
		this.email = sb.toString(); 
	}

	public String getUniqueEmail() {
		return email;
	}
	
}
