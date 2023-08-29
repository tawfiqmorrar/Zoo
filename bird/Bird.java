package bird;

import Interface.Env;
import Interface.Feed;
import Managment.Animal;

public class Bird extends Animal implements Env,  Feed {
	
	private String weather;
	private String continent;
	private String enviro;
	private String eat;
	
	
	


	private boolean fly;
	
	
	


	
	public Bird(boolean vertebrates, String repo, String skin,String sound, String species) {
		
		super(vertebrates, repo, skin,sound,species);
		
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
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