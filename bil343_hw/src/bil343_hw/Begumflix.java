package bil343_hw;

import java.util.ArrayList;
import java.util.List;

public  class Begumflix {
	private static List<Subscription> subList = new ArrayList<>();

	public static List<Subscription> getSubList() {
		return subList;
	}
	
	public static void addSubscription(Subscription sub) {
		subList.add(sub);
	}
}
