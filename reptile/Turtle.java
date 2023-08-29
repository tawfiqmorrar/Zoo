package reptile;

import Interface.Env;
import Interface.Feed;


public class Turtle extends Reptile implements Feed,Env {

	public Turtle(boolean vertebrates, String repo, String skin, String sound, String species) {
		super(vertebrates, repo, skin, sound, species);
		// TODO Auto-generated constructor stub
		setName("Turtle");
		
	}
	
	
	public void getContinent() {
		System.out.println("The continent for Turtle is Varies  ");
	}
	


	public void getWeather() {
		
		System.out.println("The weather for Turtle is Aquatic, Semi-Aquatic  ");
	}
	
	public void getEnviro() {
		
		System.out.println("The enviroment for Turtle is Oceans, Wet-Land ");
	}
	
	public void eat() {
		System.out.println("The Turtle eats:Herbivore, Carnivore");
	}



}
