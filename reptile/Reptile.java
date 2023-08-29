package reptile;

import Interface.Env;
import Interface.Feed;
import Managment.Animal;

public class Reptile extends Animal implements Env, Feed{
	
	



	public Reptile( boolean vertebrates, String repo, String skin,String sound, String species) {
		super(vertebrates, repo, skin,sound, species);
		
		
		
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
