import java.util.Scanner;

//TODO: ADD VIEW TO MENU
//TODO: ADD CLEAR TO MENU 

public class TodoMain {

	public static void main(String[] args) {
		
		//************************************TESTING************************************************
//	TodoList monday = new TodoList("Monday");
//		
//		monday.addTodo("walk dog");
//		monday.addTodo("drink dog");
//		monday.addTodo("pet dog");
//		
//		System.out.println(monday.toString());
	//	monday.delTodo(2);

		
	//	System.out.println(monday.toString());
		
		
		//************************************************************************************
		System.out.println("<Welcome>\n");
		
		boolean on = true;
		int userChoice=0;
		String userChoiceString;
		String action;
		String title = null ; 
		//String yesno = "n" ;
		//boolean valid = false; //to test users input?
		
		//Scanner 
		Scanner myObj = new Scanner(System.in);
		
		
		//User makes title which creates todo object 
		System.out.println("You've selected [1]\n");
		System.out.println("Create a title for todolist:");
		title = myObj.nextLine();
		System.out.println("Title is: " + title);
		TodoList mainTodo = new TodoList(title);
		System.out.println("\n");
		
		//Give user options 
		while (on == true) {

			System.out
					.println("Please select one of the following \n" + "[1]NOT VALID\n" + "[2]Add to todo list\n"
							+ "[3]Delete item in todo list\n" + "[4]Print todo list\n" + "[5]Quit Program\n");
			userChoiceString = myObj.nextLine();
			userChoice = Integer.parseInt(userChoiceString);
			
			switch (userChoice) {
			// ----------------------------------------------------------------------------
			case 1:

				
				break;
			// ----------------------------------------------------------------------------
			case 2:

				System.out.println("You've selected [2]");
				System.out.println("Write out todo:");
				action = myObj.nextLine();
				
				mainTodo.addTodo(action);

				System.out.println("Action to complete: " + action);

				System.out.println("\n");
				break;
			// ----------------------------------------------------------------------------
			case 3:

				System.out.println("You've selected [3]");
				System.out.println("Select a number to delete:");
				//mainTodo.delTodo(userChoice);
				
				break;
			// ----------------------------------------------------------------------------
			case 4:
				System.out.println(mainTodo.toString());

				break;
			// ----------------------------------------------------------------------------
			case 5:
				on = false;

				break;

			default:
				System.out.println("Invalid Choice, Please try again.");

			}
			
	
		}
		
		
	
		
		
	}

}
