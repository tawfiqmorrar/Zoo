package mamal;

import Interface.Env;
import Interface.Feed;

public class Elephant extends Mamal implements Env,Feed {
	
	public Elephant(boolean vertebrates, String repo, String skin, String sound, String species) {
		super(vertebrates, repo, skin, sound, species);
		
		setName("elephant");
		
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void getContinent() {
		System.out.println("The continent for elephant is Africa, Asia ");
	}
	


	public void getWeather() {
		
		System.out.println("The weather for elephant is Tropical ");
	}
	
	public void getEnviro() {
		
		System.out.println("The enviroment for elephant is Grassland");
	}
		
	public void eat(){
		
		System.out.println("The elephant eats Herbivore");
	}
	
}
