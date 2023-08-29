package bird;

import Interface.Env;
import Interface.Feed;



public class Eagle extends Bird {

	public Eagle(boolean vertebrates, String repo, String skin, String sound, String species) {
		super(vertebrates, repo, skin, sound, species);
		// TODO Auto-generated constructor stub
		setName("Eagle");
	}
	
	
	@Override
	public void getContinent() {
		System.out.println("The continent for Eagle is Varied");
	}
	


	public void getWeather() {
		
		System.out.println("The weather for Eagle is Varied  ");
	}
	
	public void getEnviro() {
		
		System.out.println("The enviroment for Eagle is Temperate ");
	}
	
	public void eat() {
		System.out.println("The Eagle eats: Carnivore, Insects");
	}



}
