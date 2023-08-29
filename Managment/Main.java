package Managment;

import java.util.Scanner;

import mamal.Dolphin;
import mamal.Elephant;
import mamal.Lion;
import bird.Bird;
import bird.Eagle;
import bird.Humm;
import bird.Penguin;
import mamal.Mamal;
import reptile.Croc;
import reptile.Reptile;
import reptile.Snake;
import reptile.Turtle;

public class Main {

	


	public static void main(String[] args) {

		Animal crocodile = new Croc(true, "internal", "scutes", "Grunt", "Reptile");
		Animal snake = new Snake(true, "internal", "scales", "Hiss", "Reptile");
		Animal turtle = new Turtle(true, "internal", "scales", "Hiss", "Reptile");

		Animal lion = new Lion(true, "internal", "fur", "Roar", "Mamal");
		Animal dolphin = new Dolphin(true, "internal", "skin", "EE-EE-EE", "Mamal");
		Animal elephant = new Elephant(true, "internal", "hair", "Trumpet", "Mamal");

		Animal eagle = new Eagle(true, "internal", "feathers", "Screesh", "Bird");
		Animal penguin = new Penguin(true, "internal", "feathers", "Braying", "Bird");
		Animal hummingbird = new Humm(true, "internal", "feathers", "Buzzing", "Bird");

		eagle.setName("eagle");
		penguin.setName("penguin");
		hummingbird.setName("hummingbird");

		lion.setName("lion");
		dolphin.setName("dolphin");

		crocodile.setName("crocodile");
		snake.setName("snake");
		turtle.setName("turtle");

		boolean infinite = false;
		System.out.println("Number of animals: " + Animal.getTotal());
		while (!infinite) {
			System.out.println("Choose the animal you want to know about.");
			System.out.println("L for lion");
			System.out.println("D for Dolphin");
			System.out.println("E for Elephant");
			System.out.println("S for Snake");
			System.out.println("C for Crocodile");
			System.out.println("T for Turtle");
			System.out.println("H for Humming Bird");
			System.out.println("A for Eagle");
			System.out.println("P for Penguin");
			System.out.println("Enter B to exit");
			Scanner input = new Scanner(System.in);
			char choice = input.nextLine().charAt(0);
			int option;
			char voice;
			boolean infinite2 = false;

			switch (choice) {

			case 'L':
			case 'l':
				while (!infinite2) {
					System.out.println("what you want to know about the Lion?(enter a number)");
					System.out.println("1) All info");
					System.out.println("2) Its habitat");
					System.out.println("3) What it eats");
					System.out.println("4)What is it's sound");
					System.out.println("5)Make sound");
					System.out.println("6)Exit");
					option = input.nextInt();
					input.nextLine();

					if (option == 1)
						lion.toString(lion);

					if (option == 2)
						lion.habitat(lion);

					if (option == 3)
						lion.eat();

					if (option == 4)
						System.out.println(lion.getSound());

					if (option == 5) {
						System.out.println("loud or low sound?(L for loud and l for low)");
						voice = input.nextLine().charAt(0);
						if (voice == 'L')
							lion.makeSound(true, lion);
						else
							lion.makeSound(false, lion);

					}
					if (option == 6)
						infinite2 = true;

				}
				break;

			case 'E':
			case 'e':
				while (!infinite2) {
					System.out.println("what you want to know about the Elephant?(enter a number)");
					System.out.println("1) All info");
					System.out.println("2) Its habitat");
					System.out.println("3) What it eats");
					System.out.println("4)What is it's sound");
					System.out.println("5)Make sound");
					System.out.println("6)Exit");
					option = input.nextInt();
					input.nextLine();

					if (option == 1)
						elephant.toString(elephant);

					if (option == 2)
						elephant.habitat(elephant);

					if (option == 3)
						elephant.eat();

					if (option == 4)
						System.out.println(elephant.getSound());

					if (option == 5) {
						System.out.println("loud or low sound?(L for loud and l for low)");
						voice = input.nextLine().charAt(0);
						if (voice == 'L')
							elephant.makeSound(true, elephant);
						else
							elephant.makeSound(false, elephant);

					}
					if (option == 6)
						infinite2 = true;
				}
				break;
			case 'D':
			case 'd':
				while (!infinite2) {

					System.out.println("what you want to know about the Dolphin?(enter a number)");
					System.out.println("1) All info");
					System.out.println("2) Its habitat");
					System.out.println("3) What it eats");
					System.out.println("4)What is it's sound");
					System.out.println("5)Make sound");
					System.out.println("6)Exit");
					option = input.nextInt();
					input.nextLine();

					if (option == 1)
						dolphin.toString(dolphin);

					if (option == 2)
						dolphin.habitat(dolphin);

					if (option == 3)
						dolphin.eat();

					if (option == 4)
						System.out.println(dolphin.getSound());

					if (option == 5) {
						System.out.println("loud or low sound?(L for loud and l for low)");
						voice = input.nextLine().charAt(0);
						if (voice == 'L')
							dolphin.makeSound(true, dolphin);
						else
							dolphin.makeSound(false, dolphin);

					}

					if (option == 6)
						infinite2 = true;
				}
				break;
			case 'S':
			case 's':
				while (!infinite2) {
					System.out.println("what you want to know about the Snake?(enter a number)");
					System.out.println("1) All info");
					System.out.println("2) Its habitat");
					System.out.println("3) What it eats");
					System.out.println("4)What is it's sound");
					System.out.println("5)Make sound");
					System.out.println("6)Exit");
					option = input.nextInt();
					input.nextLine();

					if (option == 1)
						snake.toString(snake);

					if (option == 2)
						snake.habitat(snake);

					if (option == 3)
						snake.eat();

					if (option == 4)
						System.out.println(snake.getSound());

					if (option == 5) {
						snake.makeSound(snake);

					}

					if (option == 6)
						infinite2 = true;
				}
				break;
			case 'T':
			case 't':
				while (!infinite2) {
					System.out.println("what you want to know about the Turtle?(enter a number)");
					System.out.println("1) All info");
					System.out.println("2) Its habitat");
					System.out.println("3) What it eats");
					System.out.println("4)What is it's sound");
					System.out.println("5)Make sound");
					System.out.println("6)Exit");
					option = input.nextInt();
					input.nextLine();

					if (option == 1)
						turtle.toString(turtle);

					if (option == 2)
						turtle.habitat(turtle);

					if (option == 3)
						turtle.eat();

					if (option == 4)
						System.out.println(turtle.getSound());

					if (option == 5) {
						turtle.makeSound(turtle);

					}

					if (option == 6)
						infinite2 = true;

				}
				break;
			case 'C':
			case 'c':
				while (!infinite2) {
					System.out.println("what you want to know about the Crocodile?(enter a number)");
					System.out.println("1) All info");
					System.out.println("2) Its habitat");
					System.out.println("3) What it eats");
					System.out.println("4)What is it's sound");
					System.out.println("5)Make sound");
					System.out.println("6)Exit");
					option = input.nextInt();
					input.nextLine();

					if (option == 1) {
						crocodile.toString(crocodile);
						continue;
					}
					if (option == 2)
						crocodile.habitat(crocodile);

					if (option == 3)
						crocodile.eat();

					if (option == 4)
						System.out.println(crocodile.getSound());

					if (option == 5)
						crocodile.makeSound(crocodile);

					if (option == 6)
						infinite2 = true;

				}
				break;
			case 'H':
			case 'h':
				while (!infinite2) {
					System.out.println("what you want to know about the Humming bird?(enter a number)");
					System.out.println("1) All info");
					System.out.println("2) Its habitat");
					System.out.println("3) What it eats");
					System.out.println("4)What is it's sound");
					System.out.println("5)Make sound");
					System.out.println("6)Exit");
					option = input.nextInt();
					input.nextLine();

					if (option == 1)
						hummingbird.toString(hummingbird);

					if (option == 2)
						hummingbird.habitat(hummingbird);

					if (option == 3)
						hummingbird.eat();

					if (option == 4)
						System.out.println(hummingbird.getSound());

					if (option == 5) {
						System.out.println("How many times you want to hear the sound?");
						int counter = input.nextInt();
						input.nextLine();
						hummingbird.makeSound(counter, hummingbird);

					}
					if (option == 6)
						infinite2 = true;

				}
				break;
			case 'A':
			case 'a':
				while (!infinite2) {
					System.out.println("what you want to know about the Eagle?(enter a number)");
					System.out.println("1) All info");
					System.out.println("2) Its habitat");
					System.out.println("3) What it eats");
					System.out.println("4)What is it's sound");
					System.out.println("5)Make sound");
					System.out.println("6)Exit");
					option = input.nextInt();
					input.nextLine();

					if (option == 1)
						eagle.toString(eagle);

					if (option == 2)
						eagle.habitat(eagle);

					if (option == 3)
						eagle.eat();

					if (option == 4)
						System.out.println(eagle.getSound());

					if (option == 5) {
						System.out.println("How many times you want to hear the sound?");
						int counter = input.nextInt();
						input.nextLine();
						eagle.makeSound(counter, eagle);

					}

					if (option == 6)
						infinite2 = true;
				}
				break;
			case 'P':
			case 'p':
				while (!infinite2) {
					System.out.println("what you want to know about the Pengui?(enter a number)");
					System.out.println("1) All info");
					System.out.println("2) Its habitat");
					System.out.println("3) What it eats");
					System.out.println("4)What is it's sound");
					System.out.println("5)Make sound");
					System.out.println("6)Exit");
					option = input.nextInt();
					input.nextLine();

					if (option == 1)
						penguin.toString(penguin);

					if (option == 2)
						penguin.habitat(penguin);

					if (option == 3)
						penguin.eat();

					if (option == 4)
						System.out.println(penguin.getSound());

					if (option == 5) {
						System.out.println("How many times you want to hear the sound?");
						int counter = input.nextInt();
						input.nextLine();
						penguin.makeSound(counter, penguin);

					}

					if (option == 6)
						infinite2 = true;
				}
				break;
			case 'b':
			case 'B':

				infinite = true;

				break;
			default:
				System.out.println("Invalid choice.");
			}

		}

	}
}
