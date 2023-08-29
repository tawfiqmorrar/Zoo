package bird;

import Interface.Env;
import Interface.Feed;

public class Humm extends Bird implements Env,Feed{

	public Humm(boolean vertebrates, String repo, String skin, String sound, String species) {
		super(vertebrates, repo, skin, sound, species);
		setName("Humming bird");
	}
	
	
	public void getContinent() {
		System.out.println("The continent for Humming bird is North, South ");
	}
	


	public void getWeather() {
		
		System.out.println("The weather for Humming Bird is Tropical ");
	}
	
	public void getEnviro() {
		
		System.out.println("The enviroment for Humming Bird is Forests");
	}
	
	public void eat() {
		System.out.println("The Humming Bird eats: Insects");
	}



}
