public class Person extends Animal implements Runnable, Swimmable {
	
	final char gender;
	private int age;
	private int health;
	
	public void setAge(int age) {
		if (age >0 && age < 100)
		this.age = age;
		else System.out.println("Wrong value");
	}
	
	public void setHealth(int health) {
		if (health >0 && health < 100)
		this.health = health;
		else System.out.println("Wrong value");
	}
	
	
	int getAge(){return age;};
	int getHealth(){return health;};
	

	public Dog speicalskill2(Wolf a) {
		System.out.print(name + " tames " + a.name + ".");
		System.out.println("Now " + a.name +" is a friend of " + name);
		a = new Dog(a.name, a.gender, a.age);
		return (Dog) a;
	}
	
	public void run(String location) { 
		this.location = location;
		System.out.println(name +" is running on the "+ location); }
	
	public void swim(String location)  { 
		this.location = location;
		System.out.print(name +" is swimming in the "+location); }
	
	public int getSwimspeed(){
		if (location == "water")
			return (int) (50-(0.7*health)-(0.3*age));
		else if (location == "swamp")
			return (int) (30-(0.7*health)-(0.3*age));
		return (int) 0;
	}
		
	public int getRunspeed(){
		if (location == "grass")
			return (int) (100-(0.7*health)-(0.3*age));
		else if (location == "sand")
			return (int) (80-(0.7*health)-(0.3*age));
		return (int) 0;};
	
	Person(String name,char gender){
		super(name, gender);
		this.gender = gender;
	}
	
	public static void main(String[] args) {
		Person p = new Person("Lucy",'f');
		p.setHealth(19);
		p.run("swamp");
		p.age = 10;
		System.out.println(p.getSwimspeed());
		System.out.println(p.getHealth());
		System.out.println(p.gender);
	}

	@Override
	public void live(String location) {
		// TODO Auto-generated method stub
		
	}




}
 
