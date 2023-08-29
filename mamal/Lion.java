package mamal;

import Interface.Env;
import Interface.Feed;

public class Lion extends Mamal implements Env,Feed {

	public Lion(boolean vertebrates, String repo, String skin, String sound, String species) {
		super(vertebrates, repo, skin, sound, species);
		setName("Lion");
	}

	public void getContinent() {
		System.out.println("The continent for Lion is Africa ");
	}
	


	public void getWeather() {
		
		System.out.println("The weather for Lion is Savvanahs ");
	}
	
	public void getEnviro() {
		
		System.out.println("The enviroment for Lion is Grassland");
	}
	
	public void eat() {
		System.out.println("The loin eat: Carnivore");
	}

}
