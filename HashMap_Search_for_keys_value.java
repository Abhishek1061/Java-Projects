import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class HashMapExample1 {

	public static void main(String[] args) {
		// 
		
		Map<String, List<String>> wordFamily = new HashMap<String, List<String>>();
		
		List<String> listColor = new ArrayList<String>();
		// 1st method of adding element in the list.
		listColor.add("Red");
		listColor.add("Blue");
		listColor.add("Orange");
		listColor.add("Bhack");
		
		// 2nd method of addition of element in the list.
		List<String> listFruit = new ArrayList<String>(Arrays.asList("Apple", "Mango", "Papaya"));
	
		ArrayList<String> listCountry = new ArrayList<String>(Arrays.asList("India", "US", "China"));
		
		//Adding the Keys and values in Map.
		wordFamily.put("Color", listColor);
		wordFamily.put("Fruit", listFruit);
		wordFamily.put("Country",listCountry);
		
		// 2nd method of addition of element in the list value.
//		wordFamily.put("Country", Arrays.asList("India", "US", "China"));

		//For each loop for accessing the elements.
		for(Map.Entry<String, List<String>> i : wordFamily.entrySet()) {
			System.out.println(i);
		}
		
		// Taking the user input
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the input: ");
		String userInput = sc.next();
		search(wordFamily, userInput);

	}
	
	// Method to search for the key and values prsent in map(wordFamily).
	public static void search(Map<String, List<String>> wordFamily , String input) {
		
		//search key.
		if(wordFamily.containsKey(input)) {
			System.out.println(input + " is a key");
		}else {
			//search value and their key pair.
			boolean found = false;
			
			for(Map.Entry<String, List<String>> entry : wordFamily.entrySet()) {
				if(entry.getValue().contains(input)) {
					System.out.println(input + " is a value in the key " + entry.getKey());
					found = true;
					break;
				}
			}
			//Not found in map.
			if(!found) {
				System.out.println(input + " not found");
			}
		}
	}
	

}
