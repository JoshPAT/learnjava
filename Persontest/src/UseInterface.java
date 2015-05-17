interface Runner { public void run();}

interface Swimmer {public void swim();}

interface Flyable { 
	abstract public void fly(); 
	public void land(); 
	public void takeoff();
}

abstract class Animal  {
	int age;
	abstract public void eat();
	abstract public void sleep();
} 


class Person extends Animal implements Runner,Swimmer,Flyable {
	public void run() { System.out.println("run"); }
	public void swim()  { System.out.println("swim"); }
	public void eat() { System.out.println("eat"); }
	public void sleep() { System.out.println("sleep"); }
	public void fly() { System.out.println("fly");}
	public void land(){ System.out.println("land");}
	public void takeoff(){ System.out.println("takeoff");}

}

public class UseInterface{
	
	public void m1(Runner f) { f.run(); }
	public void m2(Swimmer s) {s.swim();}
	public void m3(Animal a) {a.eat();}
	public void m4(Animal a) {a.sleep();}
	
	public static void main(String args[]){
		UseInterface t = new UseInterface();
		Person p = new Person();
		t.m1(p);
		t.m2(p);
		t.m3(p);
		t.m4(p);
	}
}
