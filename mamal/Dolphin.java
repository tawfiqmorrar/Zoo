package mamal;

import Interface.Env;
import Interface.Feed;

public class Dolphin extends Mamal implements Env,Feed {

	public Dolphin(boolean vertebrates, String repo, String skin, String sound, String species) {
		super(vertebrates, repo, skin, sound, species);
		setName("Dolphin");
	}
	
	
	public void getContinent() {
		System.out.println("The continent for Dolphin is Worldwide ");
	}
	


	public void getWeather() {
		
		System.out.println("The weather for Dolphin is Marine ");
	}
	
	public void getEnviro() {
		
		System.out.println("The enviroment for Dolphin is Oceans");
	}
	
	public void eat() {
		System.out.println("The dolphin eats: Carnovire");
	}


}
