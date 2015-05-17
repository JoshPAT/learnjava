
public class Wolf extends Animal implements Runnable, Swimmable, Jumpable {
	

	public static int age;
	private int health;
	public int hungry;
	
	@Override
	public void speicalskill1(Animal a) {
		System.out.println(name +" attacks " + a.name);
		
	}		

	public void jump() {
		
		
	}
	
	public void run(String location) { 
		this.location = location;
		System.out.println(name +" is running on the "+ location); }
	
	public void swim(String location)  { 
		this.location = location;
		System.out.print(name +" is swimming in the "+ location); }
	
	public int getSwimspeed(){
		if (location == "water")
			return (int) (50-(0.7*health)-(0.3*age));
		else if (location == "swamp")
			return (int) (30-(0.7*health)-(0.3*age));
		return (int) 0;
	}
		
	public int getRunspeed(){
		if (location == "grass")
			return (int) (90-(0.7*health)-(0.3*age));
		else if (location == "sand")
			return (int) (70-(0.7*health)-(0.3*age));
		return (int) 0;};
		
	Wolf(String name,char gender,int hungry){
			super(name,gender);
			this.hungry = hungry;
	}	
	
	
	public static void main(String[] args) {
		Wolf d = new Wolf("Zipper", 'f' ,(int) (Math.random()*10+1));
		d.run("swamp");
		System.out.println(d.getSwimspeed());
		System.out.println(d.health);
		System.out.println();
		
	}

	@Override
	public void live(String location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		
	}

	@Override
	int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int getHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Animal speicalskill2(Animal a) {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
