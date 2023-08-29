package bird;

import Interface.Env;
import Interface.Feed;
import mamal.Mamal;

public class Penguin extends Bird implements Feed,Env {

	public Penguin(boolean vertebrates, String repo, String skin, String sound, String species) {
		super(vertebrates, repo, skin, sound, species);
		setName("Penguin");
	}
	
	public void getContinent() {
		System.out.println("The continent for Penguin is Varied");
	}
	


	public void getWeather() {
		
		System.out.println("The weather for Penguin is Cold ");
	}
	
	public void getEnviro() {
		
		System.out.println("The enviroment for Penguin is Oceans");
	}
	
	public void eat() {
		System.out.println("The Penguin eats: Carnivore");
	}




}
