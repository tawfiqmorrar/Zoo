package reptile;

import Interface.Env;
import Interface.Feed;



public class Croc extends Reptile implements Feed,Env{

	public Croc(boolean vertebrates, String repo, String skin, String sound, String species) {
		super(vertebrates, repo, skin, sound, species);
		// TODO Auto-generated constructor stub
		setName("Crocodile");
	}
	
	public void getContinent() {
		System.out.println("The continent for Crocodile is Africa, Asia ");
	}
	


	public void getWeather() {
		
		System.out.println("The weather for Crocodile is Tropical ");
	}
	
	public void getEnviro() {
		
		System.out.println("The enviroment for Crocodile is Swamps, Rivers ");
	}
	
	public void eat() {
		System.out.println("The Crocodile eats: Carnivore");
	}



}
