package reptile;

import Interface.Env;
import Interface.Feed;


public class Snake extends Reptile implements Feed,Env {

	public Snake(boolean vertebrates, String repo, String skin, String sound, String species) {
		super(vertebrates, repo, skin, sound, species);
		// TODO Auto-generated constructor stub
		setName("Snake");
	}
	

	public void getContinent() {
		System.out.println("The continent for Snake is Worldwide   ");
	}
	


	public void getWeather() {
		
		System.out.println("The weather for  Snake is Varied ");
	}
	
	public void getEnviro() {
		
		System.out.println("The enviroment for  Snake is Forests, Deserts  ");
	}
	
	public void eat() {
		System.out.println("The Snake eats:Herbivore, Carnivore");
	}



}
