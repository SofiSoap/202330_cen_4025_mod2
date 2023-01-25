import java.util.Scanner;

public class TodoMain {

	public static void main(String[] args) {
		
		//************************************TESTING************************************************
	TodoList monday = new TodoList("Monday");
		
		monday.addTodo("walk dog");
		monday.addTodo("drink dog");
		monday.addTodo("pet dog");
		
		System.out.println(monday.toString());
		
	//	monday.delTodo(2);

		
	//	System.out.println(monday.toString());
		
		
		//************************************************************************************
		System.out.println("<Welcome>\n");
		boolean on = true;
		int userChoice=0;
		
		String action;
		String title = null ; 
		String yesno = "n" ;
		boolean valid = false; //to test users input?
		
		while(on == true) {
	
			System.out.println(
			"Please select one of the following \n"+
					"[1]Create todo list\n"+
					"[2]Add to todo list\n"+
					"[3]Delete item in todo list\n"+
					"[4]Quit Program\n"
					);
			
			Scanner myObj = new Scanner(System.in);
			userChoice= myObj.nextInt(); 
			myObj.nextLine();
			
			switch(userChoice) {
			  case 1:
				  
				  System.out.println("You've selected [1]\n");
				  System.out.println("Create a title:");
				 // title = myObj.nextLine();
				//  myObj.nextLine();
				
				  TodoList mainTodo = new TodoList("hello");//TODO: REMOVE TEMP VALUE 
				  
			
			    break;
			  case 2:
				  
				  System.out.println("You've selected [2]");
				  System.out.println("Write out todo:");
				//  action = myObj.nextLine();
				   
			    break;
			  case 3:
				  
				  System.out.println("You've selected [3]");
				  System.out.println("Select a number to delete:");
				  monday.delTodo(0); //TODO: REMOVE TEMP VALUE 
				  
				  break;
			
			  case 4:
				  on = false;
				  
				  break;
			
			  default:
			    System.out.println("Invalid Choice, Please try again.");
			    
			}
			
	
		}
		
		
	
		
		
	}

}
