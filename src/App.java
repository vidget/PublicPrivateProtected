import world.Plant;

//private --- only within same class
//public --- from anywhere
//protected --- same class, subclass, and same package
// no modifier -- same package only





public class App {

	public static void main(String[] args) {
		
		Plant plant = new Plant();
		
		
		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		//won't work type is private in the class
		//System.out.println(plant.type);
		
		//size is protected; App in not in the same 
		//package as plant
		// System.out.println(plant.size);
	}

}
