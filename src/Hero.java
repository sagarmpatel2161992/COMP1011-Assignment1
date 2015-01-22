
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
	 
	 		
}
