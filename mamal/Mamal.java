package mamal;

import Interface.Env;
import Interface.Feed;
import Managment.Animal;


public class Mamal extends Animal implements Env, Feed{
	

	

	
	private String age;

	
	 public Mamal(boolean vertebrates, String repo, String skin, String sound, String species) {
		 super(vertebrates, repo, skin,sound, species);
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	
	
	
		
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getContinent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getWeather() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEnviro() {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
