package Other;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomHashMap map1 = new CustomHashMap();
		map1.put("Rushikesh", "Joshi");
		map1.put("Bhargav", "Desai");
		map1.put("Chetna", "Bhatt");
		map1.put("Tapan", "Joshee");
		String old_value = map1.put("Chetna", "Joshiii");
		System.out.println("Value of Chetna :: " + map1.get("Chetna"));
		System.out.println("Old value of Chetna :: " + old_value);
	}

}
