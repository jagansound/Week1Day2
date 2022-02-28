package week1.day2;

public class LearnConditionalStatement3 {
public static void main(String[] args) {
	// Balcony, First Class. Second class
    String choice = "Balcony";
    //Switch Condition
    switch (choice) {
     // Case 1 "Balcony"
    case "Balcony":
    	System.out.println("Ticket cost is 250");
    	break;
    case "First Class":
    	System.out.println("Ticket cost is 150");
    	break;
    case "Second Class":
    	System.out.println("Ticket cost is 100");
    	break;
    default:
       	System.out.println("Ticket cost is 50");
    	break;    
    }
}
}
