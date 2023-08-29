package Managment;

import Interface.Env;
import Interface.Feed;
import bird.Bird;
import mamal.Mamal;

public class Animal implements Feed,Env {
	
	public Animal(boolean vertebrates, String repo, String skin, String sound, String species) {
		this.species = species;
		this.vertebrates = vertebrates;
		this.repo = repo;
		this.skin = skin;
		this.sound = sound;
		total++;
	}

	private boolean vertebrates;
	private String skin;
	private String repo;
	private final String species;
	public static int total = 0;
	private String sound;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public static int getTotal() {
		return total;
	}

	

	public String getSpecies() {
		return species;
	}

	public boolean isVertebrates() {
		return vertebrates;
	}

	public void setVertebrates(boolean vertebrates) {
		this.vertebrates = vertebrates;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getRepo() {
		return repo;
	}

	public void setRepo(String repo) {
		this.repo = repo;
	}

	
	public void toString(Animal animal) {
		  System.out.println(animal.getName()+" attributes:");
		  System.out.println("Vertebrates: " +animal.isVertebrates());
		  System.out.println("Skin: "+animal.getSkin());
		  System.out.println("repo: "+animal.getRepo());
		  System.out.println("Species: "+animal.getSpecies());
		 System.out.print("Continent: ");
		 ((Env)animal).getContinent();
		 System.out.println();
		 System.out.print("Weather: ");
		 ((Env)animal).getWeather();
		 System.out.println();
		 System.out.print("Enviroment: ");
		 ((Env)animal).getEnviro();
		 System.out.println();
		  System.out.println("Eats: ");
		  ((Feed)animal).eat();
		  System.out.println();
		  System.out.println("Sound: "+animal.getSound());
	    }

	
	
	public void makeSound(Animal animal)
	{
		System.out.println(animal.getSound());
		
	}
	
	public void makeSound(boolean loud, Animal animal) {
		
		if (loud == true)
			System.out.println("loud "+animal.getSound());
		else 
			System.out.println("low "+animal.getSound());
		
	}

	
public void makeSound(int a, Animal animal) {
		
		for(int i = 0; i < a;i++) {
			
			System.out.println(animal.getSound());
			
		}
		
	}
	
	
	public void habitat(Animal animal) {
		 System.out.print("Continent: ");
		 ((Env)animal).getContinent();
		 System.out.println();
		 System.out.print("Weather: ");
		 ((Env)animal).getWeather();
		 System.out.println();
		 System.out.print("Enviroment: ");
		 ((Env)animal).getEnviro();
		 System.out.println();
		 
		
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

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	

}
