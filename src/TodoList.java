import java.util.ArrayList;

public class TodoList {
	
	private ArrayList<String> todoListArray= new ArrayList<String>();;
	private String title;
	private String action;
	
	/**
	 * 
	 * TODO: add array for titles, so that users can select different todolist
	 */
	
	TodoList(String title){
		
		this.title = title;
	
	}
	
	void addTodo(String action) {
		
		this.action = action;
		todoListArray.add(this.action);
		
	}
	
	void delTodo(int numToDel) {
		
		todoListArray.remove(numToDel -1);
		
	}
	
	public String toString() {
		  
	return "<"+ this.title+ ">" + "\n" 
			+ "\t -" +this.todoListArray;
		  
	 }
	
	

}
