
abstract class Animal {
	
	String name;
	String location;
	
	final char gender;
	public int age;
	public int health;
	
	abstract public void live(String livelocation);
	abstract public void speicalskill1(Animal a);
	abstract public Animal speicalskill2(Animal a);
	
	abstract public void setAge(int age);
	abstract public void setHealth(int health);
	
	abstract int getAge();
	abstract int getHealth();
	
	
	Animal(String name, char gender){
		this.name = name;
		this.gender = gender;
	}
	

}
