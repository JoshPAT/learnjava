
public class Dog extends Wolf implements Runnable, Swimmable{
	
	Dog(String name, char gender, int age) {
		super(name, gender, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(String ground) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getRunspeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void live(String livelocation) {
		// TODO Auto-generated method stub
		
	}

	public void speicalskill1(Animal a) {
		System.out.println(name +" loves " + a.name);
		
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





	@Override
	public void swim(String ground) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public int getSwimspeed() {
		// TODO Auto-generated method stub
		return 0;
	}


}
