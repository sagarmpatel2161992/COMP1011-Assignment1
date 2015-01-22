
public class Hero {
	
	private int strength;
	private int speed;
	private int health;
	String name;
	public Hero(String name) {
		super();
		this.name = name;
		generateAbility();
	}
	
	 private void generateAbility()
	{
		this.strength = (int) ((Math.random()*100 +1)%100);
		this.speed = (int) ((Math.random()*100 +1)%100);
		this.health = (int) ((Math.random()*100 +1)%100);
	}
	 
	 public void fight()
	 {		
		if(hitAttempt())
		{
			int damage = hitDamage();
			System.out.println("Damage is " + damage);
		}
		
	 }
	 

	 public boolean hitAttempt()
	 {
		 int hitrandom = (int) ((Math.random()*100 +1)%101);
		 
		 if(hitrandom <= 20)
		 {
			 return true;
		 }
		 
		 return false;
	 }
	 
	 public int hitDamage()
	 {
		 int factor =  (int) ((Math.random()*100 +1)%7);
		 return (this.strength * factor);
	 }
	 
	 public void show()
	 {
		System.out.println("\nAbility Of " + this.name);
		System.out.println("------------------------------------------------");
		System.out.println("Strength Of " + this.name + " is "+ this.strength);
		System.out.println("Speed Of " + this.name + " is "+ this.strength);
		System.out.println("Health Of " + this.name + " is "+ this.strength);		
	 }
	 
	 		
}
