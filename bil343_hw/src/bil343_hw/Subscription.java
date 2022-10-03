package bil343_hw;

import java.util.ArrayList;
import java.util.List;

public class Subscription extends Begumflix{
	private String name;
	private String surname;
	private String emailAddress;
	private char[] password;
	private int age;
	private SubscriptionType subscriptionType;
	private List<Renewal> renewals = new ArrayList<>();
	
	public List<Renewal> getRenewals() {
		return renewals;
	}
	public void setRenewals(List<Renewal> renewals) {
		this.renewals = renewals;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public char[] getPassword() {
		return password;
	}
	public int getAge() {
		return age;
	}
	public SubscriptionType getSubscriptionType() {
		return subscriptionType;
	}
	
	
}
