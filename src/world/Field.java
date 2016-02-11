package world;


public class Field {
	
	private Plant plant = new Plant();
	
	
	public Field(){
		//size is protected and in the same package of plant
		System.out.println(plant.size);
	}

}
