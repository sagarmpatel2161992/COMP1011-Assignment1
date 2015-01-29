/**
 * @author SAGAR
 * Program Description: Hero Class for generating and showing abilities.
 * Version: final 29th January 2015
 *
 */
public class Hero {

	// Declared Private properties
	private int strength;
	private int speed;
	private int health;
	// Public property name declared
	String name;

	/**
	 * @param name
	 */
	
	// Constructor with name as argument has been declared
	public Hero(String name) {
		super();
		this.name = name;
		// generating ability by calling generateAbility method 
		generateAbility();
	}

	//generating random strength, speed and health
	private void generateAbility() {
		this.strength = (int) (Math.random() * 100 + 1) % 100;
		this.speed = (int) (Math.random() * 100 + 1) % 100;
		this.health = (int) (Math.random() * 100 + 1) % 100;
	}

	// fight method defined
	public void fight() {
		//  make damage if hitAttempt returns true 
		if (hitAttempt()) {
			int damage = hitDamage();
			System.out.println("Damage is " + damage);
		}

	}

	// hitAttempt method declaration 
	public boolean hitAttempt() {
		// generating random number between 1 to 100
		int hitrandom = (int) (Math.random()*100 + 1) % 101;
		
		//System.out.println("Hit random number:(which will return true if it's between(1-20)):" + hitrandom);

		// condition to check if hit random is less than 20 or not
		if (hitrandom <= 20) {
			return true;
		}

		return false;
	}

	// HitDamage returns integer by multiplying strength of t=hero to factor(between 1-6)  
	public int hitDamage() {		
		int factor = (int) (Math.random()*1000000 + 1) % 7;
		System.out.println("factor(Which must be between (1-6)):" + factor);
		return (this.strength * factor);
	}

	// show methid to display hero's ability and damage
	public void show() {
		System.out.println("\nAbility Of " + this.name);
		System.out.println("------------------------------------------------");
		System.out.println("Strength Of " + this.name + " is " + this.strength);
		System.out.println("Speed Of " + this.name + " is " + this.speed);
		System.out.println("Health Of " + this.name + " is " + this.health);
	}

}
