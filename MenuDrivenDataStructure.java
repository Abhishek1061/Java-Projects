import java.util.ArrayList;
import java.util.Scanner;

//Using Queue collection algorithm

public class MenuDrivenDataStructure {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		
		while(true) {
			System.out.println("Menu");
			System.out.println("Enter 1. Add First Element");
			System.out.println("Enter 2. Add Last Element");
			System.out.println("Enter 3. Delete Element");
			System.out.println("Enter 4. Accessing Element");
			System.out.println("Enter 5. Checking Index Element");
			System.out.println("Enter 6. Diaplay ArrayList");
			System.out.println("Enter 7. Exit");
			
			System.out.print("Enter your Choice: " );
			int choiceNum = sc.nextInt();
			System.out.println();
			
			switch(choiceNum) {
			 case 1:
                 addFirstElement(arr, sc);
                 break;
			 case 2:
                 addLastElement(arr, sc);
                 break;
             case 3:
                 deleteElement(arr, sc);
                 break;
             case 4:
                 accessElement(arr, sc);
                 break;
             case 5:
                 checkIndexElement(arr, sc);
                 break;
             case 6:
                 displayArrayList(arr);
                 break;
             case 7:
                 System.out.println("Exiting...");
                 sc.close();
                 System.exit(0);
             default:
                 System.out.println("Invalid choice. Please enter a valid number (1-6).");
                 break;
			}
		}
	}
	
	private static void addFirstElement(ArrayList<Integer> arr, Scanner sc) {
		System.out.print("Enter value to add at first index: ");
		int addFirst = sc.nextInt();
		arr.add(addFirst);
		
		System.out.println();
	}
	
	private static void addLastElement(ArrayList<Integer> arr, Scanner sc) {
		System.out.print("Enter value to add at last index: ");
		int addLastElement = sc.nextInt();
		arr.set(arr.size()-1, addLastElement);
		System.out.println();
	}
	
	private static void deleteElement(ArrayList<Integer> arr, Scanner sc) {
		if(!arr.isEmpty()) {
			arr.remove(arr.get(0));
			System.out.println("Element deleted");
			System.out.println();
		}else {
			System.out.println("Array List is empty.");
		}
	}
	
	private static void accessElement(ArrayList<Integer> arr, Scanner sc) {
		if(!arr.isEmpty()) {
			System.out.print("Enter index to access value: ");
			int index = sc.nextInt();
			if(index >= 0 && index < arr.size()) {
				System.out.println("Element at index " + index + ": " + arr.get(index));
				System.out.println();
			}else {
				System.out.println("Invalid index. Please enter valid index between 0 and " + (arr.size()-1));
				System.out.println();
			}
		}else {
			System.out.println("Array List is empty.");
		}
	}
	
	private static void checkIndexElement(ArrayList<Integer> arr, Scanner sc) {
		System.out.print("Enter value to check index: ");
		int valueToCheck = sc.nextInt();
		int index = arr.indexOf(valueToCheck);
		if(index != -1) {
			System.out.println("Value found at index: " + index);
			System.out.println();
		}else {
			System.out.println("Value not found in the array list.");
			System.out.println();
		}
	}
	
	private static void displayArrayList(ArrayList<Integer> arr) {
		 if(arr.isEmpty()){
		      System.out.println("Array List is empty.");
		      System.out.println();
		    }else{
		    System.out.print("ArrayList: ");
		    System.out.println(arr);
		    System.out.println();
		    }
    }
}
