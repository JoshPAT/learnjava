
public class Survive {
	
	public static void main(String[] args) {
		Survive I = new Survive();
		Person p[] = new Person[2];
		p[0] = new Person("Adam", 'm');
		p[1] = new Person("Eva", 'f');
		Wolf w = new Wolf("Zipper",'f', 12);
		int index = 1;
		
		for (int a = 0; a <10; a++){
			
			System.out.print("["+index+"]: ");
			I.show(p[0]);
			System.out.print("["+ (int)(index+1) +"]: ");
			I.show(w);
			index=index+2;
		}
		w.speicalskill1(p[1]);
		w = p[0].speicalskill2(w);
		w.speicalskill1(p[1]);
	
	}
	
	String runplace[] = {"grass","sand"};
	
	void show(Runnable obj){obj.run(runplace[(int) (Math.random()*2)]);}
	void r2(Runnable obj){obj.run("swamp");}
	
}
