package world;

 
class Something{
	
	
	
}


public class Plant {

	//Bad practice
	public String name;
	
	//Acceptable practice --- it's final
	public final static int ID = 8;
	
	//private means it can only be accessed from this class
	private String type;
	
	//you can be accessed within the class, 
	//subclass & package
	protected String size;
	
	
	public Plant(){
		this.name = "Vidget";
		this.type = "plant";
		
		this.size = "large";
		
		
	}
	
}
