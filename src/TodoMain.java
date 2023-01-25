import java.util.Scanner;

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
		String action, delNum;
		String title = null ; 
		//String yesno = "n" ;
		//boolean valid = false; //to test users input?
		
		//Scanner 
		Scanner myObj = new Scanner(System.in);
		
		
		//User makes title which creates todo object 
		System.out.println("Create a title for todolist:");
		title = myObj.nextLine();
		System.out.println("Title is: " + title);
		TodoList mainTodo = new TodoList(title);
		System.out.println("\n");
		
		//Give user options 
		while (on == true) {

			System.out
					.println("Please select one of the following \n"
							+ "[1]Add to todo list\n"
							+ "[2]Delete item in todo list\n" 
							+ "[3]Print todo list\n" 
							+ "[4]Quit Program\n");
			userChoiceString = myObj.nextLine();
			userChoice = Integer.parseInt(userChoiceString);
			
			switch (userChoice) {
			// ----------------------------------------------------------------------------
			case 1:
				System.out.println("You've selected [1]Add to todo list");
				System.out.println("Add a todo:");
				action = myObj.nextLine();
				
				mainTodo.addTodo(action);

				System.out.println("Action to complete: " + action);

				System.out.println("\n");
				
				break;
			// ----------------------------------------------------------------------------
			case 2:
				//TODO: add delete so that it works 
				System.out.println("You've selected [2]Delete item in todo list");
				System.out.println(mainTodo.toString());
				System.out.println("Select a number to delete:");
				delNum = myObj.nextLine();
				
				mainTodo.delTodo(Integer.parseInt(delNum));;
				//mainTodo.delTodo(userChoice);
				
			
				break;
			// ----------------------------------------------------------------------------
			case 3:
				System.out.println("You've selected [3]Print todo list");
				System.out.println(mainTodo.toString());
				break;
			// ----------------------------------------------------------------------------
			case 4:
				on = false;

				break;
			// ----------------------------------------------------------------------------

			default:
				System.out.println("Invalid Choice, Please try again.");

			}
			
	
		}
	
		
	}

}
